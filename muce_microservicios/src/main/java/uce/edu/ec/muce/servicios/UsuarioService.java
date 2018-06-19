package uce.edu.ec.muce.servicios;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import uce.edu.ec.muce.intefaces.UsuarioRepositorio;
import uce.edu.ec.muce.modelos.Usuario;



@Controller
@RequestMapping("/usuario")
public class UsuarioService extends AbstracService<UsuarioRepositorio, Usuario> {
	
	@GetMapping("/rol/{id}")
	@ResponseBody
	public CompletableFuture<List<Usuario>> findByRolId(@PathVariable("id") Long id) {
		
		return CompletableFuture.completedFuture(repo.byRolId(id));
	}
}
