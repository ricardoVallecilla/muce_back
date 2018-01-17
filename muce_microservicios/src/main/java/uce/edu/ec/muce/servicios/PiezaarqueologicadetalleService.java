package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.PiezaarqueologicadetalleRepositorio;
import uce.edu.ec.muce.modelos.Piezaarqueologicadetalle;




@Controller
@RequestMapping("/arquelogica")
public class PiezaarqueologicadetalleService extends AbstracService<PiezaarqueologicadetalleRepositorio, Piezaarqueologicadetalle> {	
}
