# Gestor de Tareas - Aplicación Web Spring Boot

Esta es una aplicación web simple para gestionar tareas, desarrollada con Spring Boot y MySQL. Está diseñada para ser fácil de entender y modificar, perfecta para principiantes en Spring Boot.

## 🚀 Características

- Crear nuevas tareas con título y descripción
- Marcar tareas como completadas
- Eliminar tareas
- Interfaz web amigable con Bootstrap
- Almacenamiento persistente en MySQL

## 🛠️ Tecnologías Utilizadas

- **Java 21**: Lenguaje de programación principal
- **Spring Boot 3.2.3**: Framework para desarrollo web
- **Spring Data JPA**: Para manejo de base de datos
- **MySQL**: Base de datos para almacenamiento persistente
- **Thymeleaf**: Motor de plantillas para las vistas
- **Bootstrap 5**: Framework CSS para el diseño
- **Maven**: Gestor de dependencias y construcción

## 📁 Estructura del Proyecto

```
my-webapp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/mywebapp/
│   │   │       ├── MyWebAppApplication.java    # Punto de entrada de la aplicación
│   │   │       ├── controller/                 # Controladores (manejan las peticiones web)
│   │   │       │   ├── HomeController.java     # Controlador de la página principal
│   │   │       │   └── TaskController.java     # Controlador de las tareas
│   │   │       ├── model/                      # Modelos (representan los datos)
│   │   │       │   └── Task.java              # Modelo de tarea
│   │   │       └── repository/                 # Repositorios (acceso a la base de datos)
│   │   │           └── TaskRepository.java     # Repositorio de tareas
│   │   └── resources/
│   │       ├── application.properties          # Configuración de la aplicación
│   │       └── templates/                      # Plantillas HTML
│   │           └── tasks.html                  # Vista principal de tareas
│   └── test/                                   # Pruebas unitarias
└── pom.xml                                     # Configuración de Maven
```

## 📝 Explicación de los Archivos Principales

### 1. MyWebAppApplication.java
Este es el punto de entrada de la aplicación. Contiene el método `main` que inicia todo. Spring Boot usa esta clase para configurar automáticamente la aplicación.

### 2. Task.java (Modelo)
```java
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean completed;
    // ... otros campos y métodos
}
```
- `@Entity`: Indica que esta clase representa una tabla en la base de datos
- `@Id`: Marca el campo como clave primaria
- `@GeneratedValue`: Configura la generación automática del ID

### 3. TaskController.java (Controlador)
```java
@Controller
@RequestMapping("/tasks")
public class TaskController {
    // ... métodos para manejar las peticiones web
}
```
- `@Controller`: Indica que esta clase maneja peticiones web
- `@RequestMapping("/tasks")`: Define la ruta base para todas las operaciones de tareas
- Métodos principales:
  - `listTasks()`: Muestra todas las tareas
  - `createTask()`: Crea una nueva tarea
  - `toggleTask()`: Marca/desmarca una tarea como completada
  - `deleteTask()`: Elimina una tarea

### 4. TaskRepository.java (Repositorio)
```java
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Los métodos CRUD básicos se heredan automáticamente
}
```
- `@Repository`: Indica que esta interfaz maneja el acceso a datos
- Extiende `JpaRepository` para obtener automáticamente métodos como:
  - `save()`: Guardar una tarea
  - `findAll()`: Obtener todas las tareas
  - `findById()`: Buscar una tarea por ID
  - `deleteById()`: Eliminar una tarea

### 5. tasks.html (Vista)
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
    <!-- ... estructura HTML ... -->
</html>
```
- Usa Thymeleaf para mostrar datos dinámicos
- Incluye formularios para crear y gestionar tareas
- Utiliza Bootstrap para el diseño

### 6. application.properties (Configuración)
```properties
# Configuración de MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=root
spring.datasource.password=
```
- Configura la conexión a la base de datos
- Define el puerto del servidor
- Configura otras propiedades de Spring Boot

## 🚀 Cómo Ejecutar la Aplicación

1. **Requisitos Previos**:
   - Java 21 instalado
   - Maven instalado
   - MySQL (XAMPP) instalado y corriendo

2. **Configuración de la Base de Datos**:
   - Asegúrate de que MySQL esté corriendo en XAMPP
   - La base de datos `taskdb` se creará automáticamente

3. **Ejecutar la Aplicación**:
   ```bash
   mvn spring-boot:run
   ```

4. **Acceder a la Aplicación**:
   - Abre tu navegador
   - Ve a `http://localhost:8080`

## 🔧 Personalización

### Agregar Nuevos Campos a una Tarea
1. Modifica `Task.java` para agregar el nuevo campo
2. Actualiza `tasks.html` para mostrar el nuevo campo
3. La base de datos se actualizará automáticamente

### Cambiar el Diseño
1. Modifica `tasks.html`
2. Puedes usar clases de Bootstrap o agregar CSS personalizado

## 📚 Recursos Adicionales

- [Documentación de Spring Boot](https://spring.io/projects/spring-boot)
- [Guía de Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)
- [Documentación de Bootstrap](https://getbootstrap.com/docs/5.3/getting-started/introduction/)
- [Tutorial de Spring Data JPA](https://spring.io/projects/spring-data-jpa)

## 🤝 Contribuir

Siéntete libre de:
- Reportar problemas
- Sugerir mejoras
- Enviar pull requests

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. 