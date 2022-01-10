package mx.edu.uacm.progweb.evaluacionanonima.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.uacm.progweb.evaluacionanonima.dominio.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
}
