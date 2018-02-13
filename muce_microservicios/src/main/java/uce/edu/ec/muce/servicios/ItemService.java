package uce.edu.ec.muce.servicios;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import uce.edu.ec.muce.intefaces.ItemRepositorio;
import uce.edu.ec.muce.modelos.Item;
import uce.edu.ec.muce.modelos.filtros.ItemsFiltro;




@Controller
@RequestMapping("/item")
public class ItemService extends AbstracService<ItemRepositorio, Item> {	
	
	
	@PostMapping("/filtro")
	@ResponseBody
	public CompletableFuture<List<Item>> createSimple(@Valid @RequestBody ItemsFiltro body) {
		//
		return CompletableFuture.completedFuture(repo.filtro(body.getMuseoId(), body.getGrupoId(), body.getCategoriaId()));

	}
	
	@PostMapping("/filtro/movimiento")
	@ResponseBody
	public CompletableFuture<List<Item>> filtrarSinMovimientos(@Valid @RequestBody ItemsFiltro body) {
		//
		return CompletableFuture.completedFuture(repo.filtroMovimientos(body.getMuseoId(), body.getGrupoId(), body.getCategoriaId()));

	}
}
