package com.example.mywebapp.repository;

import com.example.mywebapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para manejar las operaciones de base de datos relacionadas con las tareas.
 * Extiende JpaRepository para obtener automáticamente los métodos CRUD básicos.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Los métodos básicos CRUD se heredan automáticamente de JpaRepository
    // Podemos agregar métodos personalizados aquí si es necesario
} 