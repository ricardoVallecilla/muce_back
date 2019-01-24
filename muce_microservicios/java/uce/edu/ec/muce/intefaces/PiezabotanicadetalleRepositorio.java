package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Piezabotanicadetalle;



public interface PiezabotanicadetalleRepositorio extends JpaRepository<Piezabotanicadetalle, Long> {
	
	
	@Query("SELECT t FROM Piezabotanicadetalle t where t.piezamuseableid.piezamuseableid = ?1 ") 
	List<Piezabotanicadetalle> findBypiezaMuseableId(Long piezamuseableid);

}
