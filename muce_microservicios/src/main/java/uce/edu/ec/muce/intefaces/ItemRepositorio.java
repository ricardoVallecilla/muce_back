package uce.edu.ec.muce.intefaces;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Item;



public interface ItemRepositorio extends JpaRepository<Item, Long> {
	
	

    
    @Query("SELECT t FROM Item t where t.museoid.museoid = ?1 and  t.grupoid.catalogoid = ?2 and  t.categoriaid.catalogoid = ?3") 
	List<Item> filtro(Long museoId,Long grupoid,Long categoriaid);
    
    @Query("SELECT t FROM Item t where t.museoid.museoid = ?1 and  t.grupoid.catalogoid = ?2 order by t.categoriaid.nombre") 
	List<Item> filtroSoloMuseo(Long museoId,Long grupoid);
    
    @Query("SELECT t FROM Item t where  t.itemid in (?1)") 
	Set<Item> listaItem(Long[] itemsId);
    
    @Query("SELECT t FROM Item t where t.museoid.museoid = ?1  and t.tipoingreso.catalogoid <> ?2  and t.categoriaid.catalogoid = ?3 and t.estadoid is null  ") 
	List<Item> filtroMovimientos(Long museoId,Long idprestamo,Long categoriaid);
    
    @Query(value ="SELECT * FROM (SELECT it.*, row_number() over (ORDER BY it.itemid ASC) line_number  FROM item it"
    		+ " where it.museoid = ?1 and  it.grupoid = ?2 and  it.categoriaid = ?3) "
    		+ "WHERE line_number BETWEEN  ?4 AND  ?5  ORDER BY line_number" , nativeQuery = true) 
	List<Item> filtropaginado(Long museoId,Long grupoid,Long categoriaid,int min,int max);
    
    @Query(value ="SELECT * FROM (SELECT it.*, row_number() over (ORDER BY it.itemid ASC) line_number  FROM item it"
    		+ " where it.museoid = ?1 and  it.grupoid = ?2 ) "
    		+ "WHERE line_number BETWEEN  ?3 AND  ?4  ORDER BY line_number" , nativeQuery = true) 
	List<Item> filtropaginadoSoloMuseo(Long museoId,Long grupoid,int min,int max);
    
    @Query(value ="SELECT count(itemid) FROM item "
    		+ " where museoid = ?1 and  grupoid = ?2 and  categoriaid = ?3 " , nativeQuery = true) 
	int cantidad(Long museoId,Long grupoid,Long categoriaid);
    
    @Query(value ="SELECT count(itemid) FROM item "
    		+ " where museoid = ?1 and  grupoid = ?2 " , nativeQuery = true) 
	int cantidadSoloMuseo(Long museoId,Long grupoid);
}
