package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.PiezapaleontologicadetalleRepositorio;
import uce.edu.ec.muce.modelos.Piezapaleontologicadetalle;




@Controller
@RequestMapping("/paleontologica")
public class PiezapaleontologicadetalleService extends AbstracService<PiezapaleontologicadetalleRepositorio, Piezapaleontologicadetalle> {	
}
