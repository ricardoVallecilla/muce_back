package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Piezaentomologicadetalle;



public interface PiezaentomologicadetalleRepositorio extends JpaRepository<Piezaentomologicadetalle, Long> {
	
	
	@Query("SELECT t FROM Piezaentomologicadetalle t where t.piezamuseableid.piezamuseableid = ?1 ") 
	List<Piezaentomologicadetalle> findBypiezaMuseableId(Long piezamuseableid);

}
