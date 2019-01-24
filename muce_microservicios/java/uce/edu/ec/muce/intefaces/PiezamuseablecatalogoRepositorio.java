package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import uce.edu.ec.muce.modelos.Piezamuseablecatalogo;



public interface PiezamuseablecatalogoRepositorio extends JpaRepository<Piezamuseablecatalogo, Long> {
	
	
	@Transactional
	@Modifying
	@Query("delete FROM Piezamuseablecatalogo t where t.piezacatalogoPk.piezamuseableid = ?1 ")
	void borrarCatalogosByPiezaMuseable(Long peizaMueseableId);
	
	
	@Query("SELECT t FROM Piezamuseablecatalogo t where t.piezacatalogoPk.piezamuseableid = ?1 and t.indetificadorcampo in (?2)") 
	List<Piezamuseablecatalogo> filtro(Long peizaMueseableId,String[] padresId);

}
