package uce.edu.ec.muce.servicios;

import java.util.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import uce.edu.ec.muce.intefaces.ItemRepositorio;
import uce.edu.ec.muce.intefaces.MovimientoPiezaRepositorio;
import uce.edu.ec.muce.intefaces.MovimientoRepositorio;
import uce.edu.ec.muce.modelos.Item;
import uce.edu.ec.muce.modelos.Movimiento;
import uce.edu.ec.muce.modelos.MovimientoPieza;
import uce.edu.ec.muce.modelos.filtros.MovimientoPiezaIngreso;

@Controller
@RequestMapping("/movimiento")
public class MovimientoService extends AbstracService<MovimientoRepositorio, Movimiento> {

	@Autowired
	private MovimientoPiezaRepositorio movimientopieza;

	@Autowired
	private ItemRepositorio item;

	@PostMapping("/piezas")
	@ResponseBody
	public CompletableFuture<Movimiento> createSimple(@Valid @RequestBody MovimientoPiezaIngreso body) {

		Movimiento m = repo.save(body.getMovimiento());
		if (m.getMovimientorelacionadoid() != null) {
			Movimiento relacionado = repo.getOne(m.getMovimientorelacionadoid());
			relacionado.setMovimientorelacionadoid(m.getMovimientoid());
			repo.save(relacionado);
		}
		movimientopieza.borrarCatalogosByPiezaMuseable(m.getMovimientoid());
		Set<MovimientoPieza> spnnuevo = new HashSet<MovimientoPieza>();
		;
		Set<MovimientoPieza> sp = body.getPiezas();
		List<Long> listaItemsid = new ArrayList<>();

		for (MovimientoPieza movimientoPieza : sp) {
			movimientoPieza.getmovimientopiezaPK().setMovimientoid(m.getMovimientoid());
			spnnuevo.add(movimientoPieza);
			listaItemsid.add(movimientoPieza.getmovimientopiezaPK().getItemid());
		}

		movimientopieza.save(spnnuevo);
		if (body.getNuevoestadositem() != null) {
			Set<Item> listaItemsActualizada = new HashSet<Item>();
			;
			Set<Item> items = item.listaItem(listaItemsid.toArray(new Long[listaItemsid.size()]));
			for (Item item : items) {
				item.setEstadoid(body.getNuevoestadositem());
				listaItemsActualizada.add(item);
			}
			item.save(listaItemsActualizada);
		}

		return CompletableFuture.completedFuture(m);

	}

	@PostMapping("/devolucion/piezas")
	@ResponseBody
	public CompletableFuture<Movimiento> crearDevolucion(@Valid @RequestBody MovimientoPiezaIngreso body) {

		Movimiento m = repo.save(body.getMovimiento());
		if (m.getMovimientorelacionadoid() != null) {
			Movimiento relacionado = repo.getOne(m.getMovimientorelacionadoid());
			relacionado.setMovimientorelacionadoid(m.getMovimientoid());
			repo.save(relacionado);
		}
		movimientopieza.borrarCatalogosByPiezaMuseable(m.getMovimientoid());
		Set<MovimientoPieza> spnnuevo = new HashSet<MovimientoPieza>();
		;
		Set<MovimientoPieza> sp = body.getPiezas();
		List<Long> listaItemsid = new ArrayList<>();

		for (MovimientoPieza movimientoPieza : sp) {
			movimientoPieza.getmovimientopiezaPK().setMovimientoid(m.getMovimientoid());
			spnnuevo.add(movimientoPieza);
			listaItemsid.add(movimientoPieza.getmovimientopiezaPK().getItemid());
		}

		movimientopieza.save(spnnuevo);

		Set<Item> listaItemsActualizada = new HashSet<Item>();
		
		Set<Item> items = item.listaItem(listaItemsid.toArray(new Long[listaItemsid.size()]));
		for (Item item : items) {
			item.setEstadoid(null);
			listaItemsActualizada.add(item);
		}
		item.save(listaItemsActualizada);

		return CompletableFuture.completedFuture(m);

	}

	@GetMapping("/museo/{id}/{first}/{rows}")
	@ResponseBody
	public CompletableFuture<List<Movimiento>> movimientosMuseoId(@PathVariable("id") Long id,@PathVariable("first") int first,@PathVariable("rows") int rows) {
		return CompletableFuture.completedFuture(repo.movimientosMuseoId(id,first,rows));

	}
	@GetMapping("/museo/count/{id}")
	@ResponseBody
	public CompletableFuture<Integer> countMovimientosMuseoId(@PathVariable("id") Long id) {
		return CompletableFuture.completedFuture(repo.cantidadMovimientosMuseoId(id));

	}
	
	@GetMapping("/pieza/movimientos/{id}")
	@ResponseBody
	public CompletableFuture<List<Movimiento>> movimientosItemId(@PathVariable("id") Long id) {
		return CompletableFuture.completedFuture(repo.movimientosItemId(id));

	}

	@GetMapping("/pendientesDevolucionInterna/{museoid}/{tipoid}")
	@ResponseBody
	public CompletableFuture<List<Movimiento>> pendientesDevolucion(@PathVariable("museoid") Long museoid,
			@PathVariable("tipoid") Long tipoid) {
		return CompletableFuture.completedFuture(repo.pendientesDevolucionInterna(museoid, tipoid));

	}

	@GetMapping("/pendientesIngreso/{museoid}/{tipoid}")
	@ResponseBody
	public CompletableFuture<List<Movimiento>> pendientesIngreso(@PathVariable("museoid") Long museoid,
			@PathVariable("tipoid") Long tipoid) {
		return CompletableFuture.completedFuture(repo.pendientesIngreso(museoid, tipoid));

	}

	@GetMapping("/confirmar/{id}")
	@ResponseBody
	public CompletableFuture<Movimiento> confirmar(@PathVariable("id") Long id) {

		Movimiento m = repo.findOne(id);
		m.setConfirmacion(true);
		m.setFechaconfirmacion(new Date());
		return CompletableFuture.completedFuture(repo.save(m));

	}

	@GetMapping("/confirmar/piezas/{id}")
	@ResponseBody
	public CompletableFuture<Movimiento> confirmarPiezas(@PathVariable("id") Long id) {

		Movimiento m = repo.findOne(id);
		m.setConfirmacion(true);
		m.setFechaconfirmacion(new Date());
		List<MovimientoPieza> piezas = movimientopieza.filtro(id);
		for (MovimientoPieza movimientoPieza : piezas) {
			Item i = item.getOne(movimientoPieza.getmovimientopiezaPK().getItemid());
			i.setEstadoid(null);
			item.save(i);
		}
		return CompletableFuture.completedFuture(repo.save(m));

	}

	@GetMapping("/museo/pendientes/{id}")
	@ResponseBody
	public CompletableFuture<List<Movimiento>> movimientosPendientesMuseoId(@PathVariable("id") Long id) {
		return CompletableFuture.completedFuture(repo.movimientosPendientesMuseoId(id));

	}

	@GetMapping("/piezas/{id}")
	@ResponseBody
	public CompletableFuture<Set<Item>> piezasMovimientoId(@PathVariable("id") Long id) {

		List<Long> itemsids = new ArrayList<>();
		List<MovimientoPieza> mv = movimientopieza.filtro(id);
		for (MovimientoPieza movimientoPieza : mv) {
			itemsids.add(movimientoPieza.getmovimientopiezaPK().getItemid());
		}

		return CompletableFuture.completedFuture(item.listaItem(itemsids.toArray(new Long[itemsids.size()])));

	}

}
