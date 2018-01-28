package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uce.edu.ec.muce.modelos.Catalogo;



public interface CatalogoRepositorio extends JpaRepository<Catalogo, Long> {
	
	@Cacheable("catalogosPadres")
	@Query(value ="SELECT * FROM catalogo where CATALOGOPADREID is null ORDER BY NOMBRE", nativeQuery = true)
    List<Catalogo> catalogosPadres();
	
	@Cacheable("findByPadreId")
	@Query("SELECT t FROM Catalogo t where t.catalogopadreid.catalogoid = ?1 ORDER BY NOMBRE") 
	List<Catalogo> findByPadreId(Long personaId);
	
	@Cacheable("findByListaPadreId")
	@Query("SELECT t FROM Catalogo t where t.catalogopadreid.catalogoid in (?1) ") 
	List<Catalogo> findByListaPadreId(Long[] padresId);

	
}
