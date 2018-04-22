package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import uce.edu.ec.muce.modelos.Piezapaleontologicadetalle;



public interface PiezapaleontologicadetalleRepositorio extends JpaRepository<Piezapaleontologicadetalle, Long> {
	
	
	

    @Query("SELECT t FROM Piezapaleontologicadetalle t where t.piezamuseableid.piezamuseableid = ?1 ") 
	List<Piezapaleontologicadetalle> findBypiezaMuseableId(Long piezamuseableid);
}
