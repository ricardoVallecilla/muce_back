package uce.edu.ec.muce.seguridad;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RolUsuarioRepositorio extends JpaRepository<RolUsuario, Long> {

	@Query("SELECT ru FROM RolUsuario ru where ru.usrId.id = ?1")
	List<RolUsuario> findRolUsuarioByUsuarioId(Long userId);
}
