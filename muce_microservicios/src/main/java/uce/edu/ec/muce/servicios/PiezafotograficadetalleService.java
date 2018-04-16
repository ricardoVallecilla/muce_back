package uce.edu.ec.muce.servicios;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import uce.edu.ec.muce.intefaces.PiezafotograficadetalleRepositorio;
import uce.edu.ec.muce.modelos.Piezafotograficadetalle;




@Controller
@RequestMapping("/fotografica")
public class PiezafotograficadetalleService extends AbstracService<PiezafotograficadetalleRepositorio, Piezafotograficadetalle> {	

	@GetMapping("/piezaMuseable/{id}")
	@ResponseBody
	public CompletableFuture<List<Piezafotograficadetalle>> findByPadreId(@PathVariable("id") Long id) {
		
		return CompletableFuture.completedFuture(repo.findBypiezaMuseableId(id));
	}
}
