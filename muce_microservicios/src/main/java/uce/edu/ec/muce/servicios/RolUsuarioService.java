package uce.edu.ec.muce.servicios;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import uce.edu.ec.muce.intefaces.RolUsuarioRepositorio;
import uce.edu.ec.muce.modelos.Rol;
import uce.edu.ec.muce.modelos.RolUsuario;
import uce.edu.ec.muce.modelos.Usuario;

@Controller
@RequestMapping("/rolusuario")
public class RolUsuarioService extends AbstracService<RolUsuarioRepositorio, RolUsuario> {

	@GetMapping("/rol/{userId}")
	@ResponseBody
	public CompletableFuture<List<Rol>> findRolByUsuarioId(@PathVariable("userId") Long userId) {
		return CompletableFuture.completedFuture(repo.findRolByUsuarioId(userId));
	}
	
	@GetMapping("/usuario/{rolId}")
	@ResponseBody
	public CompletableFuture<List<Usuario>> findByPadreId(@PathVariable("rolId") Long rolId) {
		return CompletableFuture.completedFuture(repo.findUsuarioByRolId(rolId));
	}
}
