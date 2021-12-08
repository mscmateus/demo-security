package com.mballem.curso.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mballem.curso.security.service.EmailService;

@SpringBootApplication
public class DemoSecurityApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoSecurityApplication.class, args);
	}
	
	@Autowired
	EmailService service;
	
	@Override
	public void run(String... args) throws Exception {
		service.enviarPedidoDeConfirmacaoDeCadastro("msc.mateussc@gmail.com", "9852pol");
	}
}
