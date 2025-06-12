package com.example.mywebapp.controller;

import com.example.mywebapp.model.Task;
import com.example.mywebapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador que maneja las peticiones HTTP relacionadas con las tareas.
 * Proporciona endpoints para listar, crear, actualizar y eliminar tareas.
 */
@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    /**
     * Muestra la lista de todas las tareas.
     * @param model El modelo que se pasará a la vista
     * @return La vista a mostrar
     */
    @GetMapping
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskRepository.findAll());
        model.addAttribute("newTask", new Task());
        return "tasks";
    }

    /**
     * Crea una nueva tarea.
     * @param task La tarea a crear
     * @return Redirecciona a la lista de tareas
     */
    @PostMapping
    public String createTask(@ModelAttribute Task task) {
        taskRepository.save(task);
        return "redirect:/tasks";
    }

    /**
     * Actualiza el estado de una tarea.
     * @param id El ID de la tarea a actualizar
     * @return Redirecciona a la lista de tareas
     */
    @PostMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task Id:" + id));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
        return "redirect:/tasks";
    }

    /**
     * Elimina una tarea.
     * @param id El ID de la tarea a eliminar
     * @return Redirecciona a la lista de tareas
     */
    @PostMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
        return "redirect:/tasks";
    }
} 