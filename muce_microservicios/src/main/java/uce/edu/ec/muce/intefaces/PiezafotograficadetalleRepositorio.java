package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Piezafotograficadetalle;



public interface PiezafotograficadetalleRepositorio extends JpaRepository<Piezafotograficadetalle, Long> {
	
	
	@Query(value ="SELECT periodo_id,descripcion,estado FROM periodo ", nativeQuery = true)
    List<Object[]> catalogoPeriodos();
    
    @Query("SELECT t FROM Piezafotograficadetalle t where t.piezamuseableid.piezamuseableid = ?1 ") 
	List<Piezafotograficadetalle> findBypiezaMuseableId(Long piezamuseableid);

}
