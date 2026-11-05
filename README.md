# Kata 3 - Transformación de datos a JSON

## Objetivo de la entrega
Construir una aplicación que lee un dataset CSV de videojuegos, transforma cada fila en un objeto de dominio (`VideoGame`) separando responsabilidades, y genera una salida JSON estructurada con metadatos.

## Estructura de la entrega y clases principales
* **`model.VideoGame`**: Entidad inmutable (Record) que representa un videojuego válido.
* **`io.VideoGameLoader` / `CsvVideoGameLoader`**: Interfaz y lector que procesa el CSV y gestiona errores con `Optional`.
* **`io.VideoGameSerializer` / `GsonVideoGameSerializer`**: Interfaz y conversor a JSON que inyecta metadatos.
* **`Main`**: Conecta los componentes leyendo del archivo y escribiendo la salida JSON.

## Cómo compilar y ejecutar
1. Clonar el repositorio: `git clone https://github.com/[TU_USUARIO]/kata3.git`
2. Compilar con Maven o desde IntelliJ.
3. Ejecutar la clase `Main`.

## Dependencias y versión de JDK
* **JDK**: OpenJDK 27
* **Gestor**: Maven
* **Dependencia JSON**: Gson (com.google.code.gson:gson:2.10.1)

## Proceso de Repetición Deliberada
La kata se ha repetido en 3 ramas para consolidar la estructura:
* **`develop1`**: Lectura inicial, gestión de errores en `CsvVideoGameLoader` y salida por consola.
* **`develop2`**: Variación pequeña añadiendo escritura a un fichero (`videojuegos_salida.json`).
* **`develop3`**: Preparación final, README y grabación del vídeo.

## Vídeo explicativo
[AÑADIR_ENLACE_AQUI]