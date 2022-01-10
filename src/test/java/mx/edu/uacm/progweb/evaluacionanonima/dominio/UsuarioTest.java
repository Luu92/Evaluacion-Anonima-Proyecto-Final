package mx.edu.uacm.progweb.evaluacionanonima.dominio;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import mx.edu.uacm.progweb.evaluacionanonima.app.EvaluacionAnonimaApplication;
import mx.edu.uacm.progweb.evaluacionanonima.repository.UsuarioRepository;

@SpringBootTest(classes = EvaluacionAnonimaApplication.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UsuarioTest {
	@Autowired
	private UsuarioRepository nuevoUsuarioRepository;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void debeGuardar() {
		
		System.out.println("> Entrando a debeGuardar() <");
		
		Usuario nuevoUsuario = new Usuario();
		nuevoUsuario.setNombre("Angel");
		nuevoUsuario.setApellido("Rebollo");
		nuevoUsuario.setEmail("angelrebollo@gmail.com");
		nuevoUsuario.setContrasenia("54687");
		nuevoUsuario.setStatus(true);
		
		Usuario usuarioGuardado = nuevoUsuarioRepository.save(nuevoUsuario);
		
		Usuario usuarioExistente = entityManager.find(Usuario.class, usuarioGuardado.getId());
		
		assertThat(usuarioExistente.getEmail()).isEqualTo(nuevoUsuario.getEmail());
		
		
	}

	
}
