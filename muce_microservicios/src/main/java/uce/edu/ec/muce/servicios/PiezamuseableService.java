package uce.edu.ec.muce.servicios;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import uce.edu.ec.muce.intefaces.PiezaarqueologicadetalleRepositorio;
import uce.edu.ec.muce.intefaces.PiezabotanicadetalleRepositorio;
import uce.edu.ec.muce.intefaces.PiezaentomologicadetalleRepositorio;
import uce.edu.ec.muce.intefaces.PiezafotograficadetalleRepositorio;
import uce.edu.ec.muce.intefaces.PiezageologicadetalleRepositorio;
import uce.edu.ec.muce.intefaces.PiezainstrumentaldetalleRepositorio;
import uce.edu.ec.muce.intefaces.PiezamuseableRepositorio;
import uce.edu.ec.muce.intefaces.PiezapaleontologicadetalleRepositorio;
import uce.edu.ec.muce.intefaces.PiezazoologicadetalleRepositorio;
import uce.edu.ec.muce.modelos.Piezamuseable;
import uce.edu.ec.muce.modelos.filtros.PiezaDetalle;




@Controller
@RequestMapping("/piezaMuseable")
public class PiezamuseableService extends AbstracService<PiezamuseableRepositorio, Piezamuseable> {	
	
	@Autowired
	private PiezaarqueologicadetalleRepositorio arqueologica;
	
	@Autowired
	private PiezabotanicadetalleRepositorio botanica;
	
	@Autowired
	private PiezaentomologicadetalleRepositorio entomologica;
	
	@Autowired
	private PiezafotograficadetalleRepositorio fotografica;
	
	@Autowired
	private PiezageologicadetalleRepositorio geologica;
	
	@Autowired
	private PiezainstrumentaldetalleRepositorio instrumental;
	
	@Autowired
	private PiezapaleontologicadetalleRepositorio peleontologica;
	
	@Autowired
	private PiezazoologicadetalleRepositorio zoologica;
	
	@GetMapping("/item/{id}")
	@ResponseBody
	public CompletableFuture<List<Piezamuseable>> findByPadreId(@PathVariable("id") Long id) {
		
		return CompletableFuture.completedFuture(repo.findByItemId(id));
	}
	
	
	@RequestMapping(value = "/detalle", method = RequestMethod.POST)
	@ResponseBody
    public  PiezaDetalle handleFileUpload(
    		@RequestParam("tipo") int tipo,
    		@RequestParam("file") MultipartFile file, 
    		@RequestParam("detalle") String detalleStr,
    		@RequestParam("estadoGeneral") String estadoGeneral
    		) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		PiezaDetalle detalle = mapper.readValue(detalleStr, PiezaDetalle.class);
		PiezaDetalle detalleGuardado= new PiezaDetalle() ;
		
		switch (tipo) {
		case 6:
			detalle.getPiezainstrumentaldetalle().getPiezamuseableid().setFotografia(file.getBytes());
			
			instrumental.save(detalle.getPiezainstrumentaldetalle());
			
			break;

		default:
			break;
		}

		
		return detalleGuardado;
    }
	
	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
	@RequestMapping(value = "/fotografia/{id}", method = RequestMethod.GET)
    public HttpEntity getDocument(@PathVariable Long id) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.IMAGE_JPEG);
        Piezamuseable p=repo.getOne(id);
        return new ResponseEntity(p.getFotografia(), httpHeaders, HttpStatus.OK).ok(p.getFotografia());
    }
}
