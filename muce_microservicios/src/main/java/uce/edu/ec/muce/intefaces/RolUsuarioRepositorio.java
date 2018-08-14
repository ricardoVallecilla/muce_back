package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Rol;
import uce.edu.ec.muce.modelos.RolUsuario;
import uce.edu.ec.muce.modelos.Usuario;

public interface RolUsuarioRepositorio extends JpaRepository<RolUsuario, Long> {

	@Query("SELECT ru.rolId FROM RolUsuario ru where ru.usrId.id = ?1")
	List<Rol> findRolByUsuarioId(Long userId);
	
	@Query("SELECT ru.usrId FROM RolUsuario ru where ru.rolId.rolid = ?1")
	List<Usuario> findUsuarioByRolId(Long rolId);
	
	@Query("SELECT ru FROM RolUsuario ru where ru.usrId.id = ?1")
	List<RolUsuario> findRolUsuarioByUsuarioId(Long usrId);
}
