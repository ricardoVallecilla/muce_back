package uce.edu.ec.muce.servicios;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import uce.edu.ec.muce.intefaces.EstadogeneralbienRepositorio;
import uce.edu.ec.muce.intefaces.RolUsuarioRepositorio;
import uce.edu.ec.muce.modelos.Rol;
import uce.edu.ec.muce.modelos.RolUsuario;
import uce.edu.ec.muce.modelos.Usuario;

@Controller
@RequestMapping("/rolusuario")
public class RolUsuarioService extends AbstracService<RolUsuarioRepositorio, RolUsuario> {
	
	@Autowired
	private UsuarioService usuarioService;

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
	
	@PostMapping("/asignar")
	@ResponseBody
	@Transactional
	public String asignarRolUsuario(@RequestParam("roles") String rolesStr, @RequestParam("idUser") Long idUser) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		List<RolUsuario> roles = mapper.readValue(rolesStr, new TypeReference<List<RolUsuario>>(){});
		
		//elimino todos los roles del usuario
		List<RolUsuario> rolesEliminar = repo.findRolUsuarioByUsuarioId(idUser);
		for (RolUsuario eliminar : rolesEliminar) {
			repo.delete(eliminar.getId());
		}
		
		Usuario usuario = new Usuario();
		usuario = usuarioService.findId(idUser);
		
		//creo los nuevos registros
		for (RolUsuario asignar : roles) {
			usuario.setRoles(null);
			asignar.setUsrId(usuario);
			repo.save(asignar);
		}
		
		return "{\"respuesta\":\"ok\"}";
	}
}
