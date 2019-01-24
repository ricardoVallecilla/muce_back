package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Piezaartedetalle;

public interface PiezaartedetalleRepositorio extends JpaRepository<Piezaartedetalle, Long>{

	@Query("SELECT t FROM Piezaartedetalle t where t.piezamuseableid.piezamuseableid = ?1 ") 
	List<Piezaartedetalle> findBypiezaMuseableId(Long piezamuseableid);
}
