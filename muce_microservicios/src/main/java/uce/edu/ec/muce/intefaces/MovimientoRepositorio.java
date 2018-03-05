package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Movimiento;



public interface MovimientoRepositorio extends JpaRepository<Movimiento, Long> {
	
	
	@Query("SELECT t FROM Movimiento t where (t.museoid = ?1 or t.museoreceptorid=?1) order by t.fechamovimiento desc ") 
	List<Movimiento> movimientosMuseoId(Long museoid);

	@Query("SELECT t FROM Movimiento t where t.museoreceptorid = ?1 and t.confirmacion is null order by t.fechamovimiento desc ") 
	List<Movimiento> movimientosPendientesMuseoId(Long museoid);
	
	
	@Query("SELECT t FROM Movimiento t where t.museoreceptorid = ?1 and t.tipomovimientoid.catalogoid=?2 and t.movimientorelacionadoid is null and t.confirmacion is not null order by t.fechamovimiento desc ") 
	List<Movimiento> pendientesDevolucionInterna(Long museoid,Long tipoid);
	
	
	@Query("SELECT t FROM Movimiento t where t.museoid = ?1 and t.tipomovimientoid.catalogoid=?2 and t.movimientorelacionadoid is null  order by t.fechamovimiento desc ") 
	List<Movimiento> pendientesIngreso(Long museoid,Long tipoid);
	
	@Query("SELECT t FROM Movimiento t , MovimientoPieza mp  where t.movimientoid = mp.movimientopiezaPK.movimientoid and mp.movimientopiezaPK.itemid  = ?1  order by t.fechamovimiento desc ") 
	List<Movimiento> movimientosItemId(Long itemid);
	
}
