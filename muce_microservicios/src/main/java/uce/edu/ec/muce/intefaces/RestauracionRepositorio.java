package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Restauracion;

public interface RestauracionRepositorio extends JpaRepository<Restauracion, Long> {
	
	@Query("SELECT t FROM Restauracion t where t.itemid.itemid = ?1 ")
	List<Restauracion> getRestauracionByItem(Long itemid);
	
	@Query("SELECT t FROM Restauracion t where t.id = (SELECT max(t.id) FROM Restauracion t where t.itemid.itemid = ?1) ")
	Restauracion getLastRestauracionByItem(Long itemid);
	
	@Query("SELECT t FROM Restauracion t where t.id = ?1 ")
	Restauracion getRestauracionById(Long id);
}
