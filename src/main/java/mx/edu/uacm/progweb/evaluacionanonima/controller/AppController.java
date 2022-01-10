package mx.edu.uacm.progweb.evaluacionanonima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import mx.edu.uacm.progweb.evaluacionanonima.dominio.Usuario;

@Controller
public class AppController {

	@GetMapping("")
	public String login() {
		return "index";
	}
	
	@GetMapping("/registro")
	public String formularioNuevoRegistro(Model model) {
		model.addAttribute("usuario",new Usuario());
		return "registro";
	}
	
}
