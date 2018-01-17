package uce.edu.ec.muce.seguridad;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	Usuario findOneByUsername(String username);

}
