package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uce.edu.ec.muce.modelos.Catalogo;



public interface CatalogoRepositorio extends JpaRepository<Catalogo, Long> {
	
	@Cacheable("catalogosPadres")
	@Query(value ="SELECT it.* FROM catalogo it where ctl_padre_id is null OFFSET ?1 LIMIT ?2" , nativeQuery = true) 
    List<Catalogo> catalogosPadres(int min,int max);
	
	@Cacheable("cantidadPadres")
	@Query(value ="SELECT count(ctl_id) FROM catalogo where ctl_padre_id is null " , nativeQuery = true) 
    Integer cantidadPadres();
	
	@Cacheable("findByPadreId")	
	@Query(value ="SELECT it.* FROM catalogo it where ctl_padre_id =?1 OFFSET ?2 LIMIT ?3" , nativeQuery = true) 
	List<Catalogo> findByPadreId(Long padreid,int min,int max);
	
	@Cacheable("cantidadHijos")
	@Query(value ="SELECT count(ctl_id) FROM catalogo where ctl_padre_id = ?1 " , nativeQuery = true) 
    Integer cantidadHijos(Long padreid);
	
	@Cacheable("findByListaPadreId")
	@Query("SELECT t FROM Catalogo t where t.activo=true and t.catalogopadreid.catalogoid in (?1) order by t.catalogopadreid.catalogoid,t.nombre ") 
	List<Catalogo> findByListaPadreId(Long[] padresId);

	
}
