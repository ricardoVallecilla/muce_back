package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Piezainstrumentaldetalle;



public interface PiezainstrumentaldetalleRepositorio extends JpaRepository<Piezainstrumentaldetalle, Long> {
	
	
	@Query("SELECT t FROM Piezainstrumentaldetalle t where t.piezamuseableid.piezamuseableid = ?1 ") 
	List<Piezainstrumentaldetalle> findBypiezaMuseableId(Long piezamuseableid);
}
