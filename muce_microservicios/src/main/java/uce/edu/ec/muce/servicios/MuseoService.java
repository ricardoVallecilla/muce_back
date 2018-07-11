package uce.edu.ec.muce.servicios;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;

import uce.edu.ec.muce.intefaces.MuseoRepositorio;
import uce.edu.ec.muce.intefaces.UsuarioRepositorio;
import uce.edu.ec.muce.modelos.Museo;
import uce.edu.ec.muce.modelos.Usuario;

@Controller
@RequestMapping("/museo")
public class MuseoService extends AbstracService<MuseoRepositorio, Museo> {	
	
	@Autowired
	private UsuarioRepositorio usuario;
	
	@RequestMapping(value = "/file", method = RequestMethod.POST)
	@ResponseBody
	@Transactional
	public Museo saveMuseoFile(@RequestParam("museo") String museoStr) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		Museo museo = mapper.readValue(museoStr, Museo.class);
		
		System.out.println(museoStr);
		
		if(museo.getMuseoid()!=null) {
			Museo museoUsuario=repo.getOne(museo.getMuseoid());
			
			if (museoUsuario.getCutodioId() != null) {
				Usuario custodio=usuario.getOne(museoUsuario.getCutodioId().getId());
				custodio.setMuseoId(null);
				usuario.save(custodio);
			} 
			
			if (museoUsuario.getCoordinadorId() != null) {
				Usuario coordinador = usuario.getOne(museoUsuario.getCoordinadorId().getId());
				coordinador.setMuseoId(null);
				usuario.save(coordinador);
			}
			
			if (museoUsuario.getAdministrativoId() != null) {
				Usuario administrador = usuario.getOne(museoUsuario.getAdministrativoId().getId());
				administrador.setMuseoId(null);
				usuario.save(administrador);
			}
			
			if (museoUsuario.getTecnologiaId() != null) {
				Usuario tecnologico = usuario.getOne(museoUsuario.getTecnologiaId().getId());
				tecnologico.setMuseoId(null);
				usuario.save(tecnologico);
			}
			
		}		
		
		Museo museoGuardado = new Museo();	
		museoGuardado = repo.save(museo);
		
		if (museoGuardado.getCutodioId() != null) {
			Usuario custodioNuevo = usuario.getOne(museoGuardado.getCutodioId().getId()) ;
			custodioNuevo.setMuseoId(museoGuardado);
			usuario.save(custodioNuevo);
		}
		
		if (museoGuardado.getCoordinadorId() != null) {
			Usuario coordinadorNuevo = usuario.getOne(museoGuardado.getCoordinadorId().getId()) ;
			coordinadorNuevo.setMuseoId(museoGuardado);
			usuario.save(coordinadorNuevo);
		}
		
		if (museoGuardado.getAdministrativoId() != null) {
			Usuario administradorNuevo = usuario.getOne(museoGuardado.getAdministrativoId().getId()) ;
			administradorNuevo.setMuseoId(museoGuardado);
			usuario.save(administradorNuevo);
		}
		
		if (museoGuardado.getTecnologiaId() != null) {
			Usuario tecnologicoNuevo = usuario.getOne(museoGuardado.getTecnologiaId().getId()) ;
			tecnologicoNuevo.setMuseoId(museoGuardado);
			usuario.save(tecnologicoNuevo);
		}
		
		return museoGuardado;
	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public void deleteById(@PathVariable("id") Long id) {
		
		Museo museoUsuario=repo.getOne(id);
		
		if (museoUsuario.getCutodioId() != null) {
			Usuario custodio=usuario.getOne(museoUsuario.getCutodioId().getId());
			custodio.setMuseoId(null);
			usuario.save(custodio);
		} 
		
		if (museoUsuario.getCoordinadorId() != null) {
			Usuario coordinador = usuario.getOne(museoUsuario.getCoordinadorId().getId());
			coordinador.setMuseoId(null);
			usuario.save(coordinador);
		}
		
		if (museoUsuario.getAdministrativoId() != null) {
			Usuario administrador = usuario.getOne(museoUsuario.getAdministrativoId().getId());
			administrador.setMuseoId(null);
			usuario.save(administrador);
		}
		
		if (museoUsuario.getTecnologiaId() != null) {
			Usuario tecnologico = usuario.getOne(museoUsuario.getTecnologiaId().getId());
			tecnologico.setMuseoId(null);
			usuario.save(tecnologico);
		}
		
		repo.delete(id);
	}
}
