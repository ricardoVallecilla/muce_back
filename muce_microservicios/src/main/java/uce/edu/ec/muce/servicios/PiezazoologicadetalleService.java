package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.PiezazoologicadetalleRepositorio;
import uce.edu.ec.muce.modelos.Piezazoologicadetalle;




@Controller
@RequestMapping("/zoologica")
public class PiezazoologicadetalleService extends AbstracService<PiezazoologicadetalleRepositorio, Piezazoologicadetalle> {	
}
