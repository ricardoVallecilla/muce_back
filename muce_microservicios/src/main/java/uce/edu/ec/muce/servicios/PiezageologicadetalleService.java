package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.PiezageologicadetalleRepositorio;
import uce.edu.ec.muce.modelos.Piezageologicadetalle;




@Controller
@RequestMapping("/geologica")
public class PiezageologicadetalleService extends AbstracService<PiezageologicadetalleRepositorio, Piezageologicadetalle> {	
}
