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
	
	
	@GetMapping("/padres/{first}/{rows}")
	@ResponseBody
	public CompletableFuture<List<Catalogo>> filtro(@PathVariable("first") int first,@PathVariable("rows") int rows) {
		int min=first+1;
		int max=first+rows;
		return CompletableFuture.completedFuture(repo.catalogosPadres(min,max));
	}
	
	
	@GetMapping("/padres/count")
	@ResponseBody
	public CompletableFuture<Integer> countPadres() {
		
		return CompletableFuture.completedFuture(repo.cantidadPadres());
	}
	
	@GetMapping("/hijos/count/{padreid}")
	@ResponseBody
	public CompletableFuture<Integer> countHijos(@PathVariable("padreid") Long padreid) {
		
		return CompletableFuture.completedFuture(repo.cantidadHijos(padreid));
	}
	
	@GetMapping("/hijos/{id}/{first}/{rows}")
	@ResponseBody
	public CompletableFuture<List<Catalogo>> findByPadreId(@PathVariable("id") Long id,@PathVariable("first") int first,@PathVariable("rows") int rows) {
		int min=first+1;
		int max=first+rows;
		return CompletableFuture.completedFuture(repo.findByPadreId(id,min,max));
	}
	
	
	@PostMapping("/hijos/lista")
	@ResponseBody
	public CompletableFuture<List<Catalogo>> findByListaPadreId(@Valid @RequestBody Long[] body) {
		//String str = String.join(",", body);
		return CompletableFuture.completedFuture(repo.findByListaPadreId(body));

	}
}
