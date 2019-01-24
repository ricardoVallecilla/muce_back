package uce.edu.ec.muce.intefaces;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Item;



public interface ItemRepositorio extends JpaRepository<Item, Long> {
	
	

    
    @Query("SELECT t FROM Item t where t.museoid.museoid = ?1 and  t.grupoid.catalogoid = ?2 and  t.categoriaid.catalogoid = ?3 AND t.eliminado IS NULL") 
	List<Item> filtro(Long museoId,Long grupoid,Long categoriaid);
    
    @Query("SELECT t FROM Item t where t.museoid.museoid = ?1 and  t.grupoid.catalogoid = ?2 AND t.eliminado IS NULL order by t.categoriaid.nombre") 
	List<Item> filtroSoloMuseo(Long museoId,Long grupoid);
    
    @Query("SELECT t FROM Item t where  t.itemid in (?1) AND t.eliminado IS NULL") 
	Set<Item> listaItem(Long[] itemsId);
    
     
    @Query(value ="SELECT * FROM (SELECT it.*, row_number() over (ORDER BY it.itm_id ASC) line_number  FROM item it"
    		+ " where it.mus_id = ?1  and it.itm_tipo_ingreso <> ?2  and it.itm_categoria = ?3 and it.itm_estado is null  ) "
    		+ "WHERE line_number BETWEEN  ?4 AND  ?5  ORDER BY line_number" , nativeQuery = true)
	List<Item> filtroMovimientos(Long museoId,Long idprestamo,Long categoriaid,int min,int max);
    
    @Query(value ="SELECT count(itm_id)  FROM item it where it.mus_id = ?1  and it.itm_tipo_ingreso <> ?2  and it.itm_categoria = ?3 and it.itm_estado is null " , nativeQuery = true)
	int cantidadfiltroMovimientos(Long museoId,Long idprestamo,Long categoriaid);
    
    @Query(value ="SELECT * FROM (SELECT it.*, row_number() over (ORDER BY it.itm_id ASC) line_number  FROM item it"
    		+ " where it.mus_id = ?1 and  it.itm_grupo = ?2 and  it.itm_categoria = ?3 AND it.itm_eliminado IS NULL) "
    		+ "WHERE line_number BETWEEN  ?4 AND  ?5  ORDER BY line_number" , nativeQuery = true) 
	List<Item> filtropaginado(Long museoId,Long grupoid,Long categoriaid,int min,int max);
    
    @Query(value ="SELECT * FROM (SELECT it.*, row_number() over (ORDER BY it.itm_id ASC) line_number  FROM item it"
    		+ " where it.mus_id = ?1 and  it.itm_grupo = ?2 AND it.itm_eliminado IS NULL) "
    		+ "WHERE line_number BETWEEN  ?3 AND  ?4 ORDER BY line_number" , nativeQuery = true) 
	List<Item> filtropaginadoSoloMuseo(Long museoId,Long grupoid,int min,int max);
    
    @Query(value ="SELECT count(itm_id) FROM item "
    		+ " where mus_id = ?1 and  itm_grupo = ?2 and  itm_categoria = ?3 AND itm_eliminado IS NULL" , nativeQuery = true) 
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
    
    
    @Query(value ="select I.ITM_NOMBRE,M.MSB_RUTA_FOTOGRAFIA,A.ARQ_CATEGORIA_MORFOFUNCIONAL,A.ARQ_PERIODO_HISTORICO,A.ARQ_CRONOLOGIA, \n" + 
    		"A.ARQ_CULTURA,A.ARQ_FASE,A.ARQ_ALTO,A.ARQ_LARGO,A.ARQ_ANCHO,A.ARQ_DIAMETRO,A.ARQ_ESPESOR,A.ARQ_PESO \n" + 
    		"from ITEM I LEFT join MUSEABLE M ON M.ITM_ID =I.ITM_ID LEFT JOIN ARQUEOLOGIA A ON A.MSB_ID=M.MSB_ID WHERE I.ITM_ID IN ?1 " , nativeQuery = true)
    List<Object[]> expocisionArqueologia(Long[] items);
    
    
    @Query(value ="select I.ITM_NOMBRE,M.MSB_RUTA_FOTOGRAFIA,A.ENT_NOMBRE_CIENTIFICO,A.ENT_NOMBRE_COMUN,A.ENT_AUTOR,\n" + 
    		"A.ENT_CLASE,A.ENT_PUBLICADO \n" + 
    		"from ITEM I LEFT join MUSEABLE M ON M.ITM_ID =I.ITM_ID LEFT JOIN ENTOMOLOGIA A ON A.MSB_ID=M.MSB_ID WHERE I.ITM_ID IN ?1 " , nativeQuery = true)
    List<Object[]> expocisionEntomologia(Long[] items);
    
    @Query(value ="select I.ITM_NOMBRE,M.MSB_RUTA_FOTOGRAFIA,A.INS_INVENTOR,A.INS_FABRICANTE,A.INS_LUGAR_FABRICACION, \n" + 
    		"A.INS_FECHA_FABRICACION,A.INS_ALTO,A.INS_LARGO,A.INS_PROFUNDIDAD,A.INS_DIAMETRO,A.INS_ESPESOR,A.INS_PESO \n" + 
    		"from ITEM I LEFT join MUSEABLE M ON M.ITM_ID =I.ITM_ID LEFT JOIN INSTRUMENTAL A ON A.MSB_ID=M.MSB_ID WHERE I.ITM_ID IN  ?1 " , nativeQuery = true)
    List<Object[]> expocisionInstrumental(Long[] items);
    
    @Query(value ="select I.ITM_NOMBRE,M.MSB_RUTA_FOTOGRAFIA,A.FTG_TITULO,A.FTG_TEMATICA,A.FTG_PROCEDIMIENTO, \n" + 
    		"A.FTG_AUTOR,A.FTG_SIGLO_ANO,A.FTG_ALTO,A.FTG_LARGO from ITEM I LEFT  \n" + 
    		"join MUSEABLE M ON M.ITM_ID =I.ITM_ID LEFT JOIN FOTOGRAFIA A ON A.MSB_ID=M.MSB_ID WHERE I.ITM_ID  IN  ?1 " , nativeQuery = true)
    List<Object[]> expocisionFotografia(Long[] items);
    
    @Query(value ="select I.ITM_NOMBRE,M.MSB_RUTA_FOTOGRAFIA from ITEM I LEFT \r\n" + 
    		"join MUSEABLE M ON M.ITM_ID =I.ITM_ID LEFT JOIN GEOLOGIA A ON A.MSB_ID=M.MSB_ID WHERE I.ITM_ID IN  ?1 " , nativeQuery = true)
    List<Object[]> expocisionGeologia(Long[] items);
    
    @Query(value ="select I.ITM_NOMBRE,M.MSB_RUTA_FOTOGRAFIA ,A.PLN_NOMBRE_CIENTIFICO,A.PLN_NOMBRE_COMUN,A.PLN_CLASE,A.PLN_ERA \n" + 
    		"from ITEM I LEFT join MUSEABLE M ON M.ITM_ID =I.ITM_ID \r\n" + 
    		"LEFT JOIN PALEONTOLOGIA A ON A.MSB_ID=M.MSB_ID WHERE I.ITM_ID IN   ?1 " , nativeQuery = true)
    List<Object[]> expocisionPaleontologia(Long[] items);
    
    
    @Query(value ="select I.ITM_NOMBRE,M.MSB_RUTA_FOTOGRAFIA ,A.ZLG_NOMBRE_CIENTIFICO,A.ZLG_NOMBRE_COMUN,A.ZLG_AUTOR  \n" + 
    		"from ITEM I LEFT join MUSEABLE M ON M.ITM_ID =I.ITM_ID  \n" + 
    		"LEFT JOIN ZOOLOGIA A ON A.MSB_ID=M.MSB_ID WHERE I.ITM_ID IN  ?1 " , nativeQuery = true)
    List<Object[]> expocisionZoologia(Long[] items);
    
    @Query(value ="select C.CTL_NOMBRE,count(I.ITM_ID) from ITEM I JOIN CATALOGO C ON I.ITM_CATEGORIA=C.CTL_ID  where MUS_ID= ?1 and ITM_GRUPO= ?2 \n" + 
    		"GROUP BY CTL_NOMBRE" , nativeQuery = true)
    List<Object[]> cantidadPiezas(Long museoid,Long grupoid);
    
    @Query(value ="select EXTRACT(YEAR FROM M.MSB_FECHA_REGISTRO_INVENTARIO) ANIO,count (M.MSB_FECHA_REGISTRO_INVENTARIO) CANTIDAD \n" + 
    		"from ITEM I JOIN MUSEABLE M ON I.ITM_ID=M.ITM_ID \n" + 
    		"WHERE I.MUS_ID= ?1 AND MSB_FECHA_REGISTRO_INVENTARIO IS NOT NULL \n" + 
    		"group by EXTRACT(YEAR FROM M.MSB_FECHA_REGISTRO_INVENTARIO) " , nativeQuery = true)
    List<Object[]> cantidadPiezasInventario(Long museoid);
    
    @Query(value ="select EXTRACT(YEAR FROM M.MSB_FECHA_REGISTRO_CATALOGADO) ANIO,count (M.MSB_FECHA_REGISTRO_CATALOGADO) CANTIDAD \n" + 
    		"from ITEM I JOIN MUSEABLE M ON I.ITM_ID=M.ITM_ID  \n" + 
    		"WHERE I.MUS_ID=?1 AND MSB_FECHA_REGISTRO_CATALOGADO IS NOT NULL  \n" + 
    		"group by EXTRACT(YEAR FROM M.MSB_FECHA_REGISTRO_CATALOGADO) " , nativeQuery = true)
    List<Object[]> cantidadPiezasCatalogacion(Long museoid);
    
    @Query(value ="select count(*) from( SELECT DISTINCT I.ITM_ID FROM ITEM I JOIN RESTAURACION R ON I.ITM_ID=R.ITM_ID WHERE I.MUS_ID= ?1)" , nativeQuery = true)
    Long cantidadPiezasRestaurada(Long museoid);
    
    
    
}