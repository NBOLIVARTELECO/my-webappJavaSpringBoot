# Proyecto Spring Boot - My WebApp

Este es un proyecto Spring Boot básico, generado con Spring Initializr, configurado como una aplicación web con Maven y Java 21.

## Tecnologías Utilizadas

*   **Spring Boot**: Framework para facilitar la creación de aplicaciones Spring.
*   **Maven**: Herramienta de construcción y gestión de dependencias.
*   **Java 21**: Versión LTS (Long Term Support) de Java.
*   **Spring Web**: Módulo de Spring para construir aplicaciones web, incluyendo RESTful APIs.

## Estructura del Proyecto

La estructura del proyecto sigue las convenciones de Maven y Spring Boot:

```
my-webapp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── mywebapp/
│   │   │               └── MyWebAppApplication.java
│   │   │               └── controller/
│   │   │                   └── MyController.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │       └── templates/
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── mywebapp/
│                       └── MyWebAppApplicationTests.java
├── pom.xml
└── README.md
```

*   `src/main/java`: Contiene el código fuente Java de la aplicación.
*   `src/main/resources`: Contiene archivos de configuración, recursos estáticos y plantillas.
*   `src/test/java`: Contiene los tests de la aplicación.
*   `pom.xml`: Archivo de configuración de Maven, define las dependencias y la forma de construir el proyecto.
*   `MyWebAppApplication.java`: Clase principal de la aplicación Spring Boot.
*   `MyController.java`: Un controlador REST simple para manejar solicitudes HTTP.

## Cómo Ejecutar la Aplicación

Para ejecutar este proyecto, asegúrate de tener Maven y Java 21 (o superior) instalados en tu sistema.

1.  **Navega al directorio raíz del proyecto:**

    ```bash
    cd my-webapp
    ```

2.  **Compila y empaqueta la aplicación usando Maven:**

    ```bash
    mvn clean install
    ```

    Esto creará un archivo JAR ejecutable en el directorio `target/`.

3.  **Ejecuta la aplicación:**

    ```bash
    java -jar target/my-webapp-0.0.1-SNAPSHOT.jar
    ```

    Alternativamente, puedes usar el plugin de Spring Boot para Maven:

    ```bash
    mvn spring-boot:run
    ```

    La aplicación se iniciará en `http://localhost:8080`.

## Endpoints de la API

Una vez que la aplicación esté en funcionamiento, puedes acceder a los siguientes endpoints:

*   **`GET /`**: Retorna un saludo simple.

    Ejemplo: `http://localhost:8080/`

## Configuración

El archivo `src/main/resources/application.properties` se puede usar para configurar la aplicación, por ejemplo, el puerto del servidor, la configuración de la base de datos, etc.

## Desarrollo

Puedes importar este proyecto en tu IDE favorito (como IntelliJ IDEA, Eclipse o VS Code) como un proyecto Maven existente.

---
Generado por tu asistente de código. 