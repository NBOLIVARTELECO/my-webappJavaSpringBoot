package com.example.mywebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para manejar las solicitudes HTTP de la aplicación web.
 * Esta clase está anotada con @RestController, lo que la convierte en un controlador
 * que maneja solicitudes REST y automáticamente serializa los objetos de retorno a JSON/XML.
 */
@RestController
public class MyController {

    /**
     * Maneja las solicitudes GET a la raíz del contexto (por ejemplo, http://localhost:8080/).
     *
     * @return Un String que contiene el mensaje de saludo.
     */
    @GetMapping("/")
    public String sayHello() {
        // Retorna un mensaje simple cuando se accede a la URL raíz.
        return "¡Hola desde tu aplicación web Spring Boot!";
    }
} 