package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import uce.edu.ec.muce.modelos.Estadogeneralbien;

public interface EstadogeneralbienRepositorio extends JpaRepository<Estadogeneralbien, Long> {

	@Transactional
	@Modifying
	@Query("delete FROM Estadogeneralbien t where t.piezaCatalogoPk.piezamuseableid = ?1 ")
	void borrarEstadosByPiezaMuseable(Long peizaMueseableId);
	
	
	@Query("SELECT t FROM Estadogeneralbien t where t.piezaCatalogoPk.piezamuseableid = ?1") 
	List<Estadogeneralbien> filtro(Long peizaMueseableId);

}
