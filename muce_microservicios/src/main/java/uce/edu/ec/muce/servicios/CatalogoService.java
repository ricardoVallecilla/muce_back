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

import uce.edu.ec.muce.intefaces.CatalogoRepositorio;
import uce.edu.ec.muce.modelos.Catalogo;




@Controller
@RequestMapping("/catalogo")
public class CatalogoService extends AbstracService<CatalogoRepositorio, Catalogo> {	
	
	
	@GetMapping("/padres")
	@ResponseBody
	public CompletableFuture<List<Catalogo>> filtro() {
		return CompletableFuture.completedFuture(repo.catalogosPadres());
	}
	
	@GetMapping("/hijos/{id}")
	@ResponseBody
	public CompletableFuture<List<Catalogo>> findByPadreId(@PathVariable("id") Long id) {
		
		return CompletableFuture.completedFuture(repo.findByPadreId(id));
	}
	
	
	@PostMapping("/hijos/lista")
	@ResponseBody
	public CompletableFuture<List<Catalogo>> findByListaPadreId(@Valid @RequestBody Long[] body) {
		//String str = String.join(",", body);
		return CompletableFuture.completedFuture(repo.findByListaPadreId(body));

	}
}
