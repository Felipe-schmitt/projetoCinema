package com.cinema.projetocine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entities.Cliente;

@SpringBootApplication
public class ProjetocineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetocineApplication.class, args);

		Cliente.cadastraCliente();
		Cliente.listarCliente();
	}

}
