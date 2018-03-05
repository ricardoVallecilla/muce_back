package uce.edu.ec.muce.intefaces;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Item;



public interface ItemRepositorio extends JpaRepository<Item, Long> {
	
	

    
    @Query("SELECT t FROM Item t where t.museoid.museoid = ?1 and  t.grupoid.catalogoid = ?2 and  t.categoriaid.catalogoid = ?3") 
	List<Item> filtro(Long museoId,Long grupoid,Long categoriaid);
    
    @Query("SELECT t FROM Item t where t.museoid.museoid = ?1 order by t.categoriaid.nombre") 
	List<Item> filtroSoloMuseo(Long museoId);
    
    @Query("SELECT t FROM Item t where  t.itemid in (?1)") 
	Set<Item> listaItem(Long[] itemsId);
    
    @Query("SELECT t FROM Item t where t.museoid.museoid = ?1  and t.tipoingreso.catalogoid <> ?2  and t.categoriaid.catalogoid = ?3 and t.estadoid is null  ") 
	List<Item> filtroMovimientos(Long museoId,Long idprestamo,Long categoriaid);
}
