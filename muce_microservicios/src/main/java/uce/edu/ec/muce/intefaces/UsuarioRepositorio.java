package uce.edu.ec.muce.intefaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import uce.edu.ec.muce.modelos.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	
	Usuario findOneByUsername(String username);

	@Query("SELECT u FROM Usuario u where id = ?1") 
	List<Usuario> byRolId(Long rolId);
}
