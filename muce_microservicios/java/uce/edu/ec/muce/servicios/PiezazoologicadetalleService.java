package uce.edu.ec.muce.servicios;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import uce.edu.ec.muce.intefaces.PiezazoologicadetalleRepositorio;
import uce.edu.ec.muce.modelos.Piezazoologicadetalle;




@Controller
@RequestMapping("/zoologica")
public class PiezazoologicadetalleService extends AbstracService<PiezazoologicadetalleRepositorio, Piezazoologicadetalle> {	
	
	@GetMapping("/piezaMuseable/{id}")
	@ResponseBody
	public CompletableFuture<List<Piezazoologicadetalle>> findByPadreId(@PathVariable("id") Long id) {
		
		return CompletableFuture.completedFuture(repo.findBypiezaMuseableId(id));
	}
}
