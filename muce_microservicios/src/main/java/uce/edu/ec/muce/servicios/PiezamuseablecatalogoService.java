package uce.edu.ec.muce.servicios;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import uce.edu.ec.muce.intefaces.PiezamuseablecatalogoRepositorio;
import uce.edu.ec.muce.modelos.Piezamuseablecatalogo;
import uce.edu.ec.muce.modelos.filtros.PiezamuseablecatalogoFiltro;



@Controller
@RequestMapping("/piezamuseablecatalogo")
public class PiezamuseablecatalogoService extends AbstracService<PiezamuseablecatalogoRepositorio, Piezamuseablecatalogo> {	
	
	
	
	@PostMapping("/piezaMuseable")
	@ResponseBody
	public CompletableFuture<List<Piezamuseablecatalogo>>  createSimple(@Valid @RequestBody PiezamuseablecatalogoFiltro body) {

		return CompletableFuture.completedFuture(repo.filtro(body.getPiezamuseableid(), body.getNombrescolumnas()));

	}
}
