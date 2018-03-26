package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import uce.edu.ec.muce.modelos.MovimientoPieza;



public interface MovimientoPiezaRepositorio extends JpaRepository<MovimientoPieza, Long> {
	
	

	@Transactional
	@Modifying
	@Query("delete FROM MovimientoPieza t where t.movimientopiezaPK.movimientoid = ?1 ")
	void borrarCatalogosByPiezaMuseable(Long movimientoid);
	
	
	@Query("SELECT t FROM MovimientoPieza t where t.movimientopiezaPK.movimientoid = ?1") 
	List<MovimientoPieza> filtro(Long movimientoid);

}
