# 📦 Repo-DataBase

Este repositorio contiene una aplicación desarrollada con **Spring Boot** que gestiona entidades como **usuarios**, **tareas** y **registros históricos**. Está orientada a servir como base para sistemas de seguimiento de actividades o tareas.

## 🚀 Características

- CRUD completo para las entidades:
  - `Usuario`
  - `Tarea`
  - `Historial`
- Uso de Spring Data JPA para persistencia en base de datos
- Arquitectura MVC con separación por paquetes (`model`, `repository`, `service`)
- Proyecto gestionado con Maven
- API RESTful para acceder a las funcionalidades principales

## 🛠️ Tecnologías utilizadas

- Java 17+
- Spring Boot 3.4.5
- Spring Web
- Spring Data JPA
- H2 o MySQL (configurable)
- Maven

## 🗂️ Estructura del proyecto

```
src/
 └── main/
     ├── java/
     │   └── umg.programacionIII/
     │       ├── model/         # Clases de entidad: Usuario, Tarea, Historial
     │       ├── repository/    # Interfaces de acceso a datos (JpaRepository)
     │       └── service/       # Lógica de negocio
     └── resources/
         └── application.properties  # Configuración general
```

## ⚙️ Requisitos previos

- JDK 17 o superior
- Maven 3.8+
- (Opcional) Base de datos como MySQL, PostgreSQL o H2
