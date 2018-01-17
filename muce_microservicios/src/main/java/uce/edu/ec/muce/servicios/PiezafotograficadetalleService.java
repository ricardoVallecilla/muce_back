package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.PiezafotograficadetalleRepositorio;
import uce.edu.ec.muce.modelos.Piezafotograficadetalle;




@Controller
@RequestMapping("/fotografica")
public class PiezafotograficadetalleService extends AbstracService<PiezafotograficadetalleRepositorio, Piezafotograficadetalle> {	
}
