package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.PiezabotanicadetalleRepositorio;
import uce.edu.ec.muce.modelos.Piezabotanicadetalle;




@Controller
@RequestMapping("/botanica")
public class PiezabotanicadetalleService extends AbstracService<PiezabotanicadetalleRepositorio, Piezabotanicadetalle> {	
}
