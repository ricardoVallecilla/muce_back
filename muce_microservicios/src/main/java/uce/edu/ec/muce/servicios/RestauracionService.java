package uce.edu.ec.muce.servicios;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.transaction.Transactional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import uce.edu.ec.muce.intefaces.RestauracionRepositorio;
import uce.edu.ec.muce.modelos.Restauracion;

@Controller
@RequestMapping("/restauracion")
public class RestauracionService extends AbstracService<RestauracionRepositorio, Restauracion> {
	
	@RequestMapping(value = "/file", method = RequestMethod.POST)
	@ResponseBody
	@Transactional
	public Restauracion saveRestauracionFile(@RequestParam("restauracion") String restauracionStr) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		Restauracion restauracion = mapper.readValue(restauracionStr, Restauracion.class);
		
		Restauracion guardado = new Restauracion();	
		guardado = repo.save(restauracion);
		return guardado;
	}
	
	@GetMapping("/lista/{id}")
	@ResponseBody
	public CompletableFuture<List<Restauracion>> restauracionByItem(@PathVariable("id") Long id) {
		return CompletableFuture.completedFuture(repo.getRestauracionByItem(id));
	}
	
	@GetMapping("/last/{id}")
	@ResponseBody
	public CompletableFuture<Restauracion> lastRestauracion(@PathVariable("id") Long id) {
		return CompletableFuture.completedFuture(repo.getLastRestauracionByItem(id));
	} 
	
//	@GetMapping("/{id}")
//	@ResponseBody
//	public CompletableFuture<Restauracion> restauracionById(@PathVariable("id") Long id) {
//		return CompletableFuture.completedFuture(repo.getRestauracionById(id));
//	} 
	
}
