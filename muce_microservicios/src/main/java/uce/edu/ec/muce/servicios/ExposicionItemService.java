package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.ExposicionitemRepositorio;
import uce.edu.ec.muce.modelos.Exposicionitem;




@Controller
@RequestMapping("/exposicionItem")
public class ExposicionItemService extends AbstracService<ExposicionitemRepositorio, Exposicionitem> {	
}
