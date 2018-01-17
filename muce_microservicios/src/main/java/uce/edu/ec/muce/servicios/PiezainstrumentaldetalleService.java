package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.PiezainstrumentaldetalleRepositorio;
import uce.edu.ec.muce.modelos.Piezainstrumentaldetalle;




@Controller
@RequestMapping("/instrumental")
public class PiezainstrumentaldetalleService extends AbstracService<PiezainstrumentaldetalleRepositorio, Piezainstrumentaldetalle> {	
}
