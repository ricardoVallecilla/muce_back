package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.ItemBaja;



public interface ItemBajaRepositorio extends JpaRepository<ItemBaja, Long> {
	
	

	
	
	
	@Query("SELECT t FROM ItemBaja t where t.itemid = ?1") 
	List<ItemBaja> filtro(Long itemid);

}
