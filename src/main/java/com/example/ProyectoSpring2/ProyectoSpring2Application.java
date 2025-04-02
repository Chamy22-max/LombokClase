package com.example.ProyectoSpring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class ProyectoSpring2Application {

	public static void main(String[] args) {
		loadEnv(); // Cargar las variables de entorno

		SpringApplication.run(ProyectoSpring2Application.class, args);
	}


	private static void loadEnv() {
		Dotenv dotenv = Dotenv.load();

		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
	}
}
