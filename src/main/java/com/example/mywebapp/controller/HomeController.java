package com.example.mywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador para manejar la página de inicio.
 * Redirige a la página de tareas.
 */
@Controller
public class HomeController {

    /**
     * Redirige la ruta raíz a la página de tareas.
     * @return Redirección a /tasks
     */
    @GetMapping("/")
    public String home() {
        return "redirect:/tasks";
    }
} 