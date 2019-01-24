package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.PermisoRepositorio;
import uce.edu.ec.muce.modelos.Permiso;




@Controller
@RequestMapping("/permiso")
public class PermisoService extends AbstracService<PermisoRepositorio, Permiso> {	
}
