package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Movimiento;



public interface MovimientoRepositorio extends JpaRepository<Movimiento, Long> {
	
	
	@Query("SELECT t FROM Movimiento t where t.museoid = ?1 order by t.fechamovimiento desc ") 
	List<Movimiento> movimientosMuseoId(Long museoid);

}
