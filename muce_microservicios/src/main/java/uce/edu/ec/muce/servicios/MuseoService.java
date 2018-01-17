package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.MuseoRepositorio;
import uce.edu.ec.muce.modelos.Museo;




@Controller
@RequestMapping("/museo")
public class MuseoService extends AbstracService<MuseoRepositorio, Museo> {	
}
