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
    
     
    @Query(value ="SELECT * FROM (SELECT it.*, row_number() over (ORDER BY it.itm_id ASC) line_number  FROM item it"
    		+ " where it.mus_id = ?1  and it.itm_tipo_ingreso <> ?2  and it.itm_categoria = ?3 and it.itm_estado is null  ) "
    		+ "WHERE line_number BETWEEN  ?4 AND  ?5  ORDER BY line_number" , nativeQuery = true)
	List<Item> filtroMovimientos(Long museoId,Long idprestamo,Long categoriaid,int min,int max);
    
    @Query(value ="SELECT count(itm_id)  FROM item it where it.mus_id = ?1  and it.itm_tipo_ingreso <> ?2  and it.itm_categoria = ?3 and it.itm_estado is null " , nativeQuery = true)
	int cantidadfiltroMovimientos(Long museoId,Long idprestamo,Long categoriaid);
    
    @Query(value ="SELECT * FROM (SELECT it.*, row_number() over (ORDER BY it.itm_id ASC) line_number  FROM item it"
    		+ " where it.mus_id = ?1 and  it.itm_grupo = ?2 and  it.itm_categoria = ?3) "
    		+ "WHERE line_number BETWEEN  ?4 AND  ?5  ORDER BY line_number" , nativeQuery = true) 
	List<Item> filtropaginado(Long museoId,Long grupoid,Long categoriaid,int min,int max);
    
    @Query(value ="SELECT * FROM (SELECT it.*, row_number() over (ORDER BY it.itm_id ASC) line_number  FROM item it"
    		+ " where it.mus_id = ?1 and  it.itm_grupo = ?2 ) "
    		+ "WHERE line_number BETWEEN  ?3 AND  ?4  ORDER BY line_number" , nativeQuery = true) 
	List<Item> filtropaginadoSoloMuseo(Long museoId,Long grupoid,int min,int max);
    
    @Query(value ="SELECT count(itm_id) FROM item "
    		+ " where mus_id = ?1 and  itm_grupo = ?2 and  itm_categoria = ?3 " , nativeQuery = true) 
	int cantidad(Long museoId,Long grupoid,Long categoriaid);
    
    @Query(value ="SELECT count(itm_id) FROM item where mus_id = ?1 and  itm_grupo = ?2 " , nativeQuery = true) 
	int cantidadSoloMuseo(Long museoId,Long grupoid);
    
    
    @Query(value ="SELECT * FROM (SELECT it.*, row_number() over (ORDER BY it.itm_id ASC) line_number  FROM item it"
    		+ " where it.mus_id = ?1 and  (it.itm_nombre like ?2 or it.itm_codigo_control like ?2 or it.itm_numero_serie like ?2 or it.itm_descripcion like ?2) ) "
    		+ "WHERE line_number BETWEEN  ?3 AND  ?4  ORDER BY line_number" , nativeQuery = true) 
	List<Item> filtroPalabra(Long museoId,String filtro,int min,int max);
    
    @Query(value ="SELECT count(itm_id)  FROM item it"
    		+ " where it.mus_id = ?1 and  (it.itm_nombre like ?2 or it.itm_codigo_control like ?2 or it.itm_numero_serie like ?2 or it.itm_descripcion like ?2) " , nativeQuery = true) 
	int cantidadfiltroPalabra(Long museoId,String filtro);
}
