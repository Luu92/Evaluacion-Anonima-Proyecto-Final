package mx.edu.uacm.progweb.evaluacionanonima.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class EvaluacionAnonimaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvaluacionAnonimaApplication.class, args);
	}

}
