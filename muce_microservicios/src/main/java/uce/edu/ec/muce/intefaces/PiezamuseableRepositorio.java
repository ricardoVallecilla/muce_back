package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Piezamuseable;



public interface PiezamuseableRepositorio extends JpaRepository<Piezamuseable, Long> {
	
	
	@Query(value ="SELECT periodo_id,descripcion,estado FROM periodo ", nativeQuery = true)
    List<Object[]> catalogoPeriodos();

}
