# Spring Security JWT

Este es un proyecto de ejemplo que muestra cómo implementar la autenticación basada en tokens JWT (JSON Web Tokens) en una aplicación web utilizando Spring Security en Spring Boot.

## Descripción

El proyecto utiliza Spring Boot para crear una aplicación web segura que autentica a los usuarios y genera tokens JWT para su autenticación posterior. Utiliza una combinación de Spring Security y la biblioteca JJWT para manejar la autenticación y autorización de los usuarios.

## Funcionalidades

- Registro y autenticación de usuarios.
- Generación de tokens JWT para usuarios autenticados.
- Protección de rutas y recursos utilizando Spring Security.
- Validación de tokens JWT para autorizar solicitudes.

## Requisitos

- Java JDK 8 o superior
- Maven (para compilar y ejecutar la aplicación)
- Postman u otro cliente HTTP para probar las API

## Instalación y Ejecución del Proyecto

Sigue estos pasos para instalar y ejecutar el proyecto:

1. Clona el repositorio: `https://github.com/AlejandroEsteveMaza/spring-security-jwt.git`
2. Navega al directorio del proyecto: `cd tu-repo`
3. Construye el proyecto usando Maven: `mvn clean install`
4. Ejecuta el proyecto: `mvn spring-boot:run`
5. Prueba la API Rest usando Postman u otra aplicación en http://localhost:8080.


## Configuración

La configuración principal se encuentra en el archivo `application.properties`, donde puedes modificar la configuración de la base de datos, la duración de los tokens JWT, etc.

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún problema o deseas agregar nuevas características, no dudes en abrir un issue o enviar una pull request.

## Autor

Este proyecto fue creado por Alejandro Esteve Maza.

