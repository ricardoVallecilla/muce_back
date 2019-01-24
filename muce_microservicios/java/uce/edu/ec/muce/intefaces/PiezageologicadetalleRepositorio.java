package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Piezageologicadetalle;



public interface PiezageologicadetalleRepositorio extends JpaRepository<Piezageologicadetalle, Long> {
	
	
	 @Query("SELECT t FROM Piezageologicadetalle t where t.piezamuseableid.piezamuseableid = ?1 ") 
		List<Piezageologicadetalle> findBypiezaMuseableId(Long piezamuseableid);
}
