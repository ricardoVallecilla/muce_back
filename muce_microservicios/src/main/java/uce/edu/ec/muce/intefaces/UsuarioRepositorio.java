package uce.edu.ec.muce.intefaces;

import org.springframework.data.jpa.repository.JpaRepository;

import uce.edu.ec.muce.modelos.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	Usuario findOneByUsername(String username);

}
