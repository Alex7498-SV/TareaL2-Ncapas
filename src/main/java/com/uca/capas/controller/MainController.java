package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;


@Controller
public class MainController {

	@GetMapping("/Login")
	public String enviarForm(Usuario usuario) {
		
		return "Login";
	}
	
	@PostMapping("/Validacion")
	public String procesarForm(Usuario usuario) {
		
		if(usuario.getPassword().equals("admin") && usuario.getUsuario().equals("admin")){
			return "mostrarMensajeV";
		}
		else {
			return "mostrarMensajeF";
		}
	}
}
