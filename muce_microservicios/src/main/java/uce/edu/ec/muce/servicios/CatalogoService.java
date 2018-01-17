package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.CatalogoRepositorio;
import uce.edu.ec.muce.modelos.Catalogo;




@Controller
@RequestMapping("/catalogo")
public class CatalogoService extends AbstracService<CatalogoRepositorio, Catalogo> {	
}
