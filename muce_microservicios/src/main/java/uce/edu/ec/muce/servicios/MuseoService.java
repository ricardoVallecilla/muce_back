package uce.edu.ec.muce.servicios;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import uce.edu.ec.muce.intefaces.MuseoRepositorio;
import uce.edu.ec.muce.modelos.Museo;
import uce.edu.ec.muce.modelos.Piezainstrumentaldetalle;

@Controller
@RequestMapping("/museo")
public class MuseoService extends AbstracService<MuseoRepositorio, Museo> {	
	
	@RequestMapping(value = "/file", method = RequestMethod.POST)
	@ResponseBody
	@Transactional
	public Museo saveMuseoFile(@RequestParam(value="file", required=false) MultipartFile file,
							   @RequestParam("museo") String museoStr) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		Museo museo = mapper.readValue(museoStr, Museo.class);
		Museo museoGuardado = new Museo();
		
		if (file != null)
			museo.setLogo(file.getBytes());
		else
			museo.setLogo(museo.getLogo());
			
		museoGuardado = repo.save(museo);
		return museoGuardado;
	}
}
