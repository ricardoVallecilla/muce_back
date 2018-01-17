package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.MovimientoRepositorio;
import uce.edu.ec.muce.modelos.Movimiento;




@Controller
@RequestMapping("/movimiento")
public class MovimientoService extends AbstracService<MovimientoRepositorio, Movimiento> {	
}
