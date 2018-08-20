package uce.edu.ec.muce.servicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.validation.Valid;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import uce.edu.ec.muce.intefaces.CatalogoRepositorio;
import uce.edu.ec.muce.intefaces.ItemBajaRepositorio;
import uce.edu.ec.muce.intefaces.ItemRepositorio;
import uce.edu.ec.muce.modelos.Item;
import uce.edu.ec.muce.modelos.ItemBaja;
import uce.edu.ec.muce.modelos.filtros.ExposicionResult;
import uce.edu.ec.muce.modelos.filtros.ItemsFiltro;
import uce.edu.ec.muce.modelos.filtros.ReporteExposicion;
import uce.edu.ec.muce.modelos.filtros.ReporteGeneral;

@Controller
@RequestMapping("/item")
public class ItemService extends AbstracService<ItemRepositorio, Item> {

	@Autowired
	private ItemBajaRepositorio itemBaja;

	@Autowired
	private CatalogoRepositorio catalogo;

	@PostMapping("/filtro")
	@ResponseBody
	public CompletableFuture<List<Item>> createSimple(@Valid @RequestBody ItemsFiltro body) {
		//
		int min = body.getPagina() + 1;
		int max = body.getPagina() + 1 + body.getRegistros();
		if (body.getGrupoId() != null && body.getCategoriaId() != null) {
			// return CompletableFuture.completedFuture(repo.filtro(body.getMuseoId(),
			// body.getGrupoId(), body.getCategoriaId()));

			return CompletableFuture.completedFuture(
					repo.filtropaginado(body.getMuseoId(), body.getGrupoId(), body.getCategoriaId(), min, max));
		} else {
			return CompletableFuture
					.completedFuture(repo.filtropaginadoSoloMuseo(body.getMuseoId(), body.getGrupoId(), min, max));
		}

	}
	
	@PostMapping("/reportegeneral")
	@ResponseBody
	public ReporteGeneral reportegeneral(@Valid @RequestBody ItemsFiltro body) {
		//
		ReporteGeneral rp = new ReporteGeneral();
		rp.setCantidadPiezas(repo.cantidadPiezas(body.getMuseoId(), body.getGrupoId()));
		rp.setCantidadPiezasInventario(repo.cantidadPiezasInventario(body.getMuseoId()));
		rp.setCantidadPiezasCatalogacion(repo.cantidadPiezasCatalogacion(body.getMuseoId()));
		rp.setCantidadPiezasRestauracion(repo.cantidadPiezasRestaurada(body.getMuseoId()));
		
		return rp;

	}

	@PostMapping("/filtro/texto")
	@ResponseBody
	public CompletableFuture<List<Item>> filtrar(@Valid @RequestBody ItemsFiltro body) {
		//
		int min = body.getPagina() + 1;
		int max = body.getPagina() + 1 + body.getRegistros();
		String filtro = "%" + body.getTexto() + "%";
		return CompletableFuture.completedFuture(repo.filtroPalabra(body.getMuseoId(), filtro, min, max));

	}

	@PostMapping("/filtro/texto/count")
	@ResponseBody
	public CompletableFuture<Integer> countFiltrar(@Valid @RequestBody ItemsFiltro body) {
		String filtro = "%" + body.getTexto() + "%";
		return CompletableFuture.completedFuture(repo.cantidadfiltroPalabra(body.getMuseoId(), filtro));

	}

	@PostMapping("/filtro/movimiento")
	@ResponseBody
	public CompletableFuture<List<Item>> filtrarSinMovimientos(@Valid @RequestBody ItemsFiltro body) {
		int min = body.getPagina() + 1;
		int max = body.getPagina() + 1 + body.getRegistros();
		return CompletableFuture.completedFuture(
				repo.filtroMovimientos(body.getMuseoId(), body.getGrupoId(), body.getCategoriaId(), min, max));

	}

	@PostMapping("/filtro/movimiento/count")
	@ResponseBody
	public CompletableFuture<Integer> cantidadfiltrarSinMovimientos(@Valid @RequestBody ItemsFiltro body) {

		return CompletableFuture.completedFuture(
				repo.cantidadfiltroMovimientos(body.getMuseoId(), body.getGrupoId(), body.getCategoriaId()));

	}

	@PostMapping("/count")
	@ResponseBody
	public CompletableFuture<Integer> cantidad(@Valid @RequestBody ItemsFiltro body) {
		if (body.getGrupoId() != null && body.getCategoriaId() != null)
			return CompletableFuture
					.completedFuture(repo.cantidad(body.getMuseoId(), body.getGrupoId(), body.getCategoriaId()));
		else
			return CompletableFuture.completedFuture(repo.cantidadSoloMuseo(body.getMuseoId(), body.getGrupoId()));
	}

	@GetMapping("/bajas/{id}")
	@ResponseBody
	public CompletableFuture<List<ItemBaja>> itemBaja(@PathVariable("id") Long id) {

		return CompletableFuture.completedFuture(itemBaja.filtro(id));
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
	@RequestMapping(value = "/urlImagen", method = RequestMethod.POST)
	public HttpEntity getImagenRuta(@RequestBody String ruta) throws IOException {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.IMAGE_JPEG);

		byte[] foto = null;
		
		if (ruta!=null) {
			Path path = Paths.get(ruta);
			foto = Files.readAllBytes(path);
		}
		
		if (foto == null)
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity(foto, httpHeaders, HttpStatus.OK).ok(foto);
	}

	@PostMapping("/bajas")
	@ResponseBody
	public CompletableFuture<ItemBaja> guardarBaja(@Valid @RequestBody ItemBaja body) {

		Item pm = repo.getOne(body.getItemid());
		pm.setEstadoid(catalogo.getOne(748L));
		repo.save(pm);
		itemBaja.save(body);
		return CompletableFuture.completedFuture(body);
	}
	
	@PostMapping("/delete")
	@ResponseBody
	public CompletableFuture<ItemBaja> deleteItem(@Valid @RequestBody ItemBaja body) {
		Item pm = repo.getOne(body.getItemid());
		pm.setEliminado(true);
		repo.save(pm);
		return CompletableFuture.completedFuture(body);
	}

	@PostMapping("/reporteExposicion")
	@ResponseBody
	public CompletableFuture<List<ExposicionResult>> exposicion(@Valid @RequestBody ReporteExposicion[] body)
			throws JSONException {

		return CompletableFuture.completedFuture(exposicionItem(body));
	}

	public List<ExposicionResult> exposicionItem(ReporteExposicion[] body) throws JSONException {

		List<ExposicionResult> todos = new ArrayList<>();
		for (ReporteExposicion reporteExposicion : body) {
			ExposicionResult tipo = new ExposicionResult();
			tipo.setTipo(reporteExposicion.getTipo());
			
			List<Object[]> listaItem = new ArrayList<>();

			switch (reporteExposicion.getTipo().intValue()) {
			// arqueologia
			case 1:
				listaItem = repo.expocisionArqueologia(reporteExposicion.getItems());				
				break;

			// entomologia
			case 3:
				listaItem = repo.expocisionEntomologia(reporteExposicion.getItems());				
				break;
			//fotografia
			case 5:
				listaItem = repo.expocisionFotografia(reporteExposicion.getItems());
				break;
			// instrumental
			case 6:
				listaItem = repo.expocisionInstrumental(reporteExposicion.getItems());				
				break;
			// geologia
			case 7:
				listaItem = repo.expocisionGeologia(reporteExposicion.getItems());				
				break;
			// paleontologia
				case 8:
				listaItem = repo.expocisionPaleontologia(reporteExposicion.getItems());				
				break;
			// zoologia
				case 9:
				listaItem = repo.expocisionZoologia(reporteExposicion.getItems());				
				break;
			default:
				break;
			}

			tipo.setItems( listaItem);
			todos.add(tipo);
		}
		return todos;

	}
}
