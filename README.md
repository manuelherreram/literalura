# LiterAlura

Bienvenido a **LiterAlura**, un emocionante desafío de programación donde construirás tu propio catálogo de libros. Aprenderás a realizar solicitudes a una API de libros, manipular datos JSON, guardarlos en una base de datos y, finalmente, filtrar y mostrar los libros y autores de interés.

## Objetivo

El objetivo principal es desarrollar un Catálogo de Libros que ofrezca interacción textual (vía consola) con los usuarios, proporcionando al menos 5 opciones de interacción. Los libros se buscarán a través de una API específica. La información sobre la API y las opciones de interacción con el usuario se detallará en la columna "Backlog"/"Listo para iniciar".

## Pasos para completar este desafío

A continuación, se detallan los pasos para completar este desafío. Esta información estará disponible en la sección adyacente:

1. **Configuración del Ambiente Java**
2. **Creación del Proyecto**
3. **Consumo de la API**
4. **Análisis de la Respuesta JSON**
5. **Inserción y consulta en la base de datos**
6. **Exhibición de resultados a los usuarios**

### Configuración del Ambiente Java

Para este desafío, asegúrate de contar con los siguientes programas, archivos y versiones:

- **Java JDK**: versión 17 en adelante - [Descargar Java LTS](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Maven**: versión 4 en adelante - [Descargar Maven](https://maven.apache.org/download.cgi)
- **Spring**: versión 3.2.3 - [Spring Initializr](https://start.spring.io/)
- **Postgres**: versión 16 en adelante - [PostgreSQL: Downloads](https://www.postgresql.org/download/)
- **IDE IntelliJ IDEA** (opcional) - [Descargar IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

### Configuración al crear el proyecto en Spring Initializr

- **Java**: versión 17 en adelante
- **Maven**: Initializr utiliza la versión 4
- **Spring Boot**: versión 3.2.3
- **Proyecto**: JAR

### Dependencias para agregar al crear el proyecto en Spring Initializr

- Spring Data JPA
- Postgres Driver

### API Gutendex

La API Gutendex es un catálogo de información de más de 70,000 libros presentes en Project Gutenberg (biblioteca en línea y gratuita).

En este paso crucial, es fundamental comprender mejor la API de los libros, revisar su documentación y aprender cómo realizar las consultas en la API. En este desafío no es necesario obtener una clave de acceso, solo realizar consultas como se describe en el sitio web oficial.

- **Enlace de API**: [Gutendex](https://gutendex.com)
- **Repositorio de API**: [GitHub - garethbjohnson/gutendex](https://github.com/garethbjohnson/gutendex)

*Dejamos el código oficial (el repositorio) de la API si tienes curiosidad sobre cómo se hizo.*

## Contribuciones

Si deseas contribuir a este proyecto, por favor, sigue los siguientes pasos:

1. Realiza un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza los cambios y commitea (`git commit -am 'Agregar nueva funcionalidad'`).
4. Sube los cambios a tu repositorio (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más detalles.

---

¡Buena suerte y disfruta del desafío de construir tu propio catálogo de libros con LiterAlura!
