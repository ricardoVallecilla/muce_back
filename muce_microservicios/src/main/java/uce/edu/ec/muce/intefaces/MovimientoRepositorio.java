package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uce.edu.ec.muce.modelos.Movimiento;



public interface MovimientoRepositorio extends JpaRepository<Movimiento, Long> {
	
	
	 
	@Query(value ="SELECT * FROM (SELECT it.*, row_number() over (ORDER BY it.mvm_fecha_movimiento desc) line_number  FROM Movimiento it "
    		+ "where it.mvm_museo_id = ?1 or it.mvm_museo_receptor_id=?1 ) "
    		+ "WHERE line_number BETWEEN  ?2 AND  ?3  ORDER BY line_number" , nativeQuery = true) 
	List<Movimiento> movimientosMuseoId(Long museoid,int min,int max);
	
	@Query(value ="SELECT count(mvm_id) FROM Movimiento where mvm_id = ?1 or mvm_museo_receptor_id=?1  ", nativeQuery = true) 
	int cantidadMovimientosMuseoId(Long museoid);

	@Query("SELECT t FROM Movimiento t where t.museoreceptorid = ?1 and t.confirmacion is null order by t.fechamovimiento desc ") 
	List<Movimiento> movimientosPendientesMuseoId(Long museoid);
	
	
	@Query("SELECT t FROM Movimiento t where t.museoreceptorid = ?1 and t.tipomovimientoid.catalogoid=?2 and t.movimientorelacionadoid is null and t.confirmacion is not null order by t.fechamovimiento desc ") 
	List<Movimiento> pendientesDevolucionInterna(Long museoid,Long tipoid);
	
	
	@Query("SELECT t FROM Movimiento t where t.museoid = ?1 and t.tipomovimientoid.catalogoid=?2 and t.movimientorelacionadoid is null  order by t.fechamovimiento desc ") 
	List<Movimiento> pendientesIngreso(Long museoid,Long tipoid);
	
	@Query("SELECT t FROM Movimiento t , MovimientoPieza mp  where t.movimientoid = mp.movimientopiezaPK.movimientoid and mp.movimientopiezaPK.itemid  = ?1  order by t.fechamovimiento desc ") 
	List<Movimiento> movimientosItemId(Long itemid);
	
	@Cacheable("pendientesGeneral")
	@Query("SELECT t FROM Movimiento t where (t.museoid = ?1  or t.museoreceptorid=?1) and t.tipomovimientoid.catalogoid in (?2) and t.movimientorelacionadoid is null  order by t.fechamovimiento desc ") 
	List<Movimiento> pendientesGeneral(Long museoid,Long[] estaos);
	
}
