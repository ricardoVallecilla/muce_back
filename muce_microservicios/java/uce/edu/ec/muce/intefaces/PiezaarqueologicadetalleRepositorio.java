package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Piezaarqueologicadetalle;



public interface PiezaarqueologicadetalleRepositorio extends JpaRepository<Piezaarqueologicadetalle, Long> {
	
	
	@Query("SELECT t FROM Piezaarqueologicadetalle t where t.piezamuseableid.piezamuseableid = ?1 ") 
	List<Piezaarqueologicadetalle> findBypiezaMuseableId(Long piezamuseableid);

}
