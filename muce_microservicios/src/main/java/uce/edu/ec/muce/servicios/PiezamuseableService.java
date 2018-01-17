package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.PiezamuseableRepositorio;
import uce.edu.ec.muce.modelos.Piezamuseable;




@Controller
@RequestMapping("/piezaMuseable")
public class PiezamuseableService extends AbstracService<PiezamuseableRepositorio, Piezamuseable> {	
}
