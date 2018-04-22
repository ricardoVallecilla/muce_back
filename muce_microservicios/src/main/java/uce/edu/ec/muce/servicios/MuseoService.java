package uce.edu.ec.muce.servicios;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
		
		if(museo.getMuseoid()!=null) {
			Museo museoUsuario=repo.getOne(museo.getMuseoid());
			Usuario custodio=museoUsuario.getCutodioId();
			if (custodio!=null) {
				custodio.setMuseoId(null);
				usuario.save(custodio);
			}
			
		}
		
		
		
		Museo museoGuardado = new Museo();	
		museoGuardado = repo.save(museo);
		Usuario custodioNuevo=museoGuardado.getCutodioId();
		custodioNuevo.setMuseoId(museoGuardado);
		usuario.save(custodioNuevo);

		return museoGuardado;
	}
}
