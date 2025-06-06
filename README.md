# 📦 Repo-DataBase

Aplicación Spring Boot para gestionar usuarios, tareas y registrar historial de acciones. Implementa estructuras de datos personalizadas y ofrece funcionalidades CRUD completas.

## 🚀 Características

- **Gestión completa (CRUD) para:**
  - Usuarios
  - Tareas (incluyendo búsqueda por estado y eliminación por descripción)
  - Historial de acciones

- **Estructuras de datos personalizadas:**
  - Implementa `Lista` y `Opcional` desde la dependencia Repo-Tools
  - Uso de nodos y listas enlazadas para manejar colecciones

- **Persistencia y arquitectura:**
  - Uso de Spring Data JPA para acceso a datos
  - Arquitectura en capas (model, repository, service)
  - API RESTful

## 🛠️ Tecnologías utilizadas

- Java 17+
- Spring Boot 3.4.5
- Spring Web
- Spring Data JPA
- MySQL
- RabbitMQ
- Jakarta Validation API
- Maven

## 🗂️ Estructura del proyecto

src/ └── main/ ├── java/ │ └── umg.programacionIII/ │ ├── model/ # Entidades: Usuario, Tarea, Historial │ ├── repository/ # Interfaces de acceso a datos │ └── service/ # Lógica de negocio └── resources/ └── application.properties # Configuración

## ⚙️ Requisitos previos

- JDK 17 o superior
- Maven 3.8+
- MySQL
- RabbitMQ (opcional según configuración)
- Dependencia local: Repo-Tools (contiene estructuras de datos personalizadas)
