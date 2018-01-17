package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.PiezaentomologicadetalleRepositorio;
import uce.edu.ec.muce.modelos.Piezaentomologicadetalle;




@Controller
@RequestMapping("/entomologica")
public class PiezaentomologogicadetalleService extends AbstracService<PiezaentomologicadetalleRepositorio, Piezaentomologicadetalle> {	
}
