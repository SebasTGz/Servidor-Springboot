package com.ejemplo.mi_primer_servidor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Le dice a Spring que esta clase manejará peticiones web
public class HolaController {

    @GetMapping("/bienvenida")  // Define la ruta: localhost:8080/bienvenida
    public String bienvenida() {
        return "¡Bienvenid@s! Mi primera vez en Spring Boot :D";
    }
}
