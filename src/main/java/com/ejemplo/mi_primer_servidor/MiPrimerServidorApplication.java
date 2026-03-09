package com.ejemplo.mi_primer_servidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
public class MiPrimerServidorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPrimerServidorApplication.class, args);
	}

	@Bean
    public ApplicationListener<ContextRefreshedEvent> onStartup() {
        return event -> {
            System.out.println("==========================================");
            System.out.println("  Servidor listo en:");
            System.out.println("  http://localhost:8080/bienvenida");
            System.out.println("==========================================");
        };
	}
}
