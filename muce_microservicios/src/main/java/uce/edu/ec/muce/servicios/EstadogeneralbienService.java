package uce.edu.ec.muce.servicios;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import uce.edu.ec.muce.intefaces.EstadogeneralbienRepositorio;
import uce.edu.ec.muce.modelos.Estadogeneralbien;


@Controller
@RequestMapping("/estadogeneralbien")
public class EstadogeneralbienService extends AbstracService<EstadogeneralbienRepositorio, Estadogeneralbien> {	
	
	@GetMapping("/piezaMuseable/{id}")
	@ResponseBody
	public CompletableFuture<List<Estadogeneralbien>> findByPadreId(@PathVariable("id") Long id) {

		return CompletableFuture.completedFuture(repo.filtro(id));
	}
}
