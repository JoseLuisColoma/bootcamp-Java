# NBA Viewer – Proyecto Java Spring Boot + API balldontlie.io

## Descripción General

**NBA Viewer** es una aplicación web desarrollada en **Java 21** utilizando **Spring Boot 3**, **HTML5**, **CSS3** y **JavaScript (ES6)**.  
Consume la API pública de [balldontlie.io](https://www.balldontlie.io) para mostrar información de jugadores y equipos de la NBA en tiempo real.  

El objetivo del proyecto es demostrar la integración entre backend y frontend mediante buenas prácticas de arquitectura, patrones de diseño y un consumo eficiente de APIs externas con caching.

---

## Arquitectura del Proyecto

El proyecto sigue una estructura **multicapa (MVC simplificado)**:


nba_con_POO_y_API/
│
├── src/
│ ├── main/
│ │ ├── java/com/jocodev/nba/
│ │ │ ├── controller/
│ │ │ │ └── NbaController.java # Controlador REST que expone los endpoints
│ │ │ ├── model/
│ │ │ │ ├── Jugador.java # Modelo de datos para jugadores
│ │ │ │ └── Equipo.java # Modelo de datos para equipos
│ │ │ ├── service/
│ │ │ │ └── NBAService.java # Lógica de negocio y conexión con la API externa
│ │ │ ├── App.java # Launcher de consola para debug
│ │ │ └── NbaApplication.java # Clase principal de arranque Spring Boot
│ │ └── resources/
│ │ ├── static/
│ │ │ ├── index.html # Vista principal (jugadores)
│ │ │ ├── equipos.html # Vista secundaria (equipos)
│ │ │ ├── estilos.css # Estilos globales
│ │ │ └── js/
│ │ │ ├── jugadores.js # Lógica de frontend para jugadores
│ │ │ └── equipos.js # Lógica de frontend para equipos
│ │ └── application.properties # Configuración del servidor (puerto, etc.)
│ └── test/ # Tests (opcional)
│
├── pom.xml # Configuración Maven y dependencias
└── README.md

---

## Tecnologías Empleadas

**Backend:**
- Java 21
- Spring Boot 3.3.3
- Maven 4.0
- Gson (Google) para parseo de JSON
- Java HttpClient (java.net.http) para peticiones a la API
- ConcurrentHashMap para caché de resultados

**Frontend:**
- HTML5 / CSS3
- JavaScript (ES6)
- Fetch API nativa
- Diseño responsive y minimalista con estilo oscuro

**API externa:**
- [balldontlie.io](https://www.balldontlie.io) – fuente de datos de la NBA

---

## Arquitectura Lógica

[Frontend HTML + JS]
          ↓ (fetch)
[Controlador REST /api/...]
          ↓
[NBAService → API balldontlie.io]
          ↓
[Caché en memoria con ConcurrentHashMap]
          ↓
[Respuesta JSON al cliente]


El backend expone los siguientes endpoints REST:

| Método  | Endpoint          | Descripción                    | Devuelve           |
|--------:|-------------------|--------------------------------|--------------------|
| GET     | `/api/jugadores`  | Obtiene listado de jugadores   | List<Jugador>      |
| GET     | `/api/equipos`    | Obtiene listado de equipos     | List<Equipo>       |

---

## Instalación y Puesta en Marcha

### 1. Requisitos previos

- Java JDK 21 o superior
- Maven 3.9+
- IDE compatible (IntelliJ IDEA recomendado)

Verifica la instalación con:

```
java -version
mvn -version
```

2. Clonar el repositorio
git clone https://github.com/<tu_usuario>/nba_con_POO_y_API.git
cd nba_con_POO_y_API

3. Compilar el proyecto
mvn clean install

4. Ejecutar la aplicación
mvn spring-boot:run


Por defecto el servidor se levanta en el puerto 8181.
Puedes modificarlo en el archivo application.properties:

server.port=8181

5. Acceder desde el navegador

Una vez iniciado el servidor, abre en el navegador:

Jugadores: http://localhost:8181/index.html

Equipos: http://localhost:8181/equipos.html

Funcionamiento del Sistema

Al acceder a la página principal (index.html), se hace una petición fetch a /api/jugadores.

Los datos se cargan dinámicamente en una tabla HTML.

Se genera un menú desplegable con todos los equipos disponibles para aplicar un filtro dinámico.

En la segunda vista (equipos.html), se muestra el listado completo de equipos con sus atributos (abreviatura, ciudad, conferencia y división).

Todos los datos se almacenan en caché durante la ejecución para evitar sobrecargar la API externa y mejorar el rendimiento.

Ejecución en Modo Consola (opcional)

Puedes ejecutar directamente la clase App.java para probar la obtención de datos en consola:

mvn compile exec:java -Dexec.mainClass="com.jocodev.nba.App"


Esto mostrará por terminal la lista de jugadores y equipos en formato tabulado.

Mantenimiento y Extensiones Futuras

Implementar paginación para jugadores.

Añadir un filtro adicional por posición (G, F, C).

Crear un sistema de logs persistentes con Logback.

Añadir capa de persistencia con Spring Data JPA y base de datos H2 o MySQL.

Desplegar en contenedor Docker para distribución sencilla.

Licencia

Este proyecto se distribuye bajo la licencia MIT.
Puedes usarlo, modificarlo y redistribuirlo libremente citando la fuente.

Autor: José Luis Coloma