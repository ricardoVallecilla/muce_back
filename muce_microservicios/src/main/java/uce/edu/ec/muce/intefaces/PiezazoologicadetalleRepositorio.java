package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import uce.edu.ec.muce.modelos.Piezazoologicadetalle;



public interface PiezazoologicadetalleRepositorio extends JpaRepository<Piezazoologicadetalle, Long> {
	
	
	

    @Query("SELECT t FROM Piezazoologicadetalle t where t.piezamuseableid.piezamuseableid = ?1 ") 
	List<Piezazoologicadetalle> findBypiezaMuseableId(Long piezamuseableid);
    
}
