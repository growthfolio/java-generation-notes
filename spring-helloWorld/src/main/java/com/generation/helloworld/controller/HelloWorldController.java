package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}	
	
	@GetMapping("/bsms")
	public String bsm() {
		return "Persistencia\r\n"
				+ "	  Mentalidade de Crescimento,\r\n"
				+ "	  Responsabilidade Pessoal,\r\n"
				+ "	  Orientação ao Futuro,\r\n"
				+ "	  Proatividade,\r\n"
				+ "	  Comunicação,\r\n"
				+ "	  Trabalho em equipe,\r\n"
				+ "	  Orientação ao detalhe.";
	}	
	
	@GetMapping("/objetivos")
	public String objetivos() {
	    return "  *Objetivos da semana: Melhorar habilidade em Java,  Aprender Spring Boot,  Praticar desenvolvimento web com Spring ";
	}
	        
	        
}
