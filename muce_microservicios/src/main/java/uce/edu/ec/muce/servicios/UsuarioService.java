package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.UsuarioRepositorio;
import uce.edu.ec.muce.modelos.Usuario;



@Controller
@RequestMapping("/usuario")
public class UsuarioService extends AbstracService<UsuarioRepositorio, Usuario> {	
}
