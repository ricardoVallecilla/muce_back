package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Piezafotograficadetalle;



public interface PiezafotograficadetalleRepositorio extends JpaRepository<Piezafotograficadetalle, Long> {
	
	

    
    @Query("SELECT t FROM Piezafotograficadetalle t where t.piezamuseableid.piezamuseableid = ?1 ") 
	List<Piezafotograficadetalle> findBypiezaMuseableId(Long piezamuseableid);

}
