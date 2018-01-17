package uce.edu.ec.muce.servicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uce.edu.ec.muce.intefaces.ItemRepositorio;
import uce.edu.ec.muce.modelos.Item;




@Controller
@RequestMapping("/item")
public class ItemService extends AbstracService<ItemRepositorio, Item> {	
}
