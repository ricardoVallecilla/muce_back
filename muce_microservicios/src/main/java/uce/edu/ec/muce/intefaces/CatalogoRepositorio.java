package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uce.edu.ec.muce.modelos.Catalogo;



public interface CatalogoRepositorio extends JpaRepository<Catalogo, Long> {
	
	@Cacheable("catalogosPadres")
	@Query(value ="SELECT * FROM (SELECT it.*, row_number() over (ORDER BY it.nombre ASC) line_number  FROM catalogo it"
	    		+ " where CATALOGOPADREID is null ) "
	    		+ "WHERE line_number BETWEEN  ?1 AND  ?2  ORDER BY line_number" , nativeQuery = true) 
    List<Catalogo> catalogosPadres(int min,int max);
	
	@Cacheable("cantidadPadres")
	@Query(value ="SELECT count(catalogoid) FROM catalogo where CATALOGOPADREID is null " , nativeQuery = true) 
    Integer cantidadPadres();
	
	@Cacheable("findByPadreId")	
	@Query(value ="SELECT * FROM (SELECT it.*, row_number() over (ORDER BY it.nombre ASC) line_number  FROM catalogo it"
    		+ " where CATALOGOPADREID =?1 ) "
    		+ "WHERE line_number BETWEEN  ?2 AND  ?3  ORDER BY line_number" , nativeQuery = true) 
	List<Catalogo> findByPadreId(Long padreid,int min,int max);
	
	@Cacheable("cantidadHijos")
	@Query(value ="SELECT count(catalogoid) FROM catalogo where CATALOGOPADREID = ?1 " , nativeQuery = true) 
    Integer cantidadHijos(Long padreid);
	
	@Cacheable("findByListaPadreId")
	@Query("SELECT t FROM Catalogo t where t.activo=1 and t.catalogopadreid.catalogoid in (?1) order by t.catalogopadreid.catalogoid,t.nombre ") 
	List<Catalogo> findByListaPadreId(Long[] padresId);

	
}
