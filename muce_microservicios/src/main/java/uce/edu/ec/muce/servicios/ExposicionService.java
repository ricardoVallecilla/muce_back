package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.ExposicionRepositorio;
import uce.edu.ec.muce.modelos.Exposicion;




@Controller
@RequestMapping("/exposicion")
public class ExposicionService extends AbstracService<ExposicionRepositorio, Exposicion> {	
}
