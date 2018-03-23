package uce.edu.ec.muce.servicios;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import uce.edu.ec.muce.intefaces.ItemRepositorio;
import uce.edu.ec.muce.modelos.Item;
import uce.edu.ec.muce.modelos.Piezamuseable;
import uce.edu.ec.muce.modelos.filtros.ItemsFiltro;




@Controller
@RequestMapping("/item")
public class ItemService extends AbstracService<ItemRepositorio, Item> {	
	
	
	@PostMapping("/filtro")
	@ResponseBody
	public CompletableFuture<List<Item>> createSimple(@Valid @RequestBody ItemsFiltro body) {
		//
		int min= body.getPagina()+1;
		int max= body.getPagina()+1+body.getRegistros();
		if (body.getGrupoId()!=null && body.getCategoriaId()!=null ) {
			//return CompletableFuture.completedFuture(repo.filtro(body.getMuseoId(), body.getGrupoId(), body.getCategoriaId()));
					
			return CompletableFuture.completedFuture(repo.filtropaginado(body.getMuseoId(), body.getGrupoId(), body.getCategoriaId(),min,max));
		}else {
			return CompletableFuture.completedFuture(repo.filtropaginadoSoloMuseo(body.getMuseoId(), body.getGrupoId(),min,max));
		}
		
		

	}
	
	@PostMapping("/filtro/movimiento")
	@ResponseBody
	public CompletableFuture<List<Item>> filtrarSinMovimientos(@Valid @RequestBody ItemsFiltro body) {
		//
		return CompletableFuture.completedFuture(repo.filtroMovimientos(body.getMuseoId(), body.getGrupoId(), body.getCategoriaId()));

	}
	
	
	@PostMapping("/count")
	@ResponseBody
	public CompletableFuture<Integer> cantidad(@Valid @RequestBody ItemsFiltro body) {
		if (body.getGrupoId()!=null && body.getCategoriaId()!=null ) 
		return CompletableFuture.completedFuture(repo.cantidad(body.getMuseoId(), body.getGrupoId(), body.getCategoriaId()));
		else
			return CompletableFuture.completedFuture(repo.cantidadSoloMuseo(body.getMuseoId(), body.getGrupoId()));	
	}
}
