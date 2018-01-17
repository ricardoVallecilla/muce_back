package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.RolRepositorio;
import uce.edu.ec.muce.modelos.Rol;




@Controller
@RequestMapping("/rol")
public class RolService extends AbstracService<RolRepositorio, Rol> {	
}
