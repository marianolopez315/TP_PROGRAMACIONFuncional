# Trabajo Práctico - Programación Funcional (Java Streams)

Este repositorio contiene la resolución del Trabajo Práctico de **Programación III** de la **UTN (Universidad Tecnológica Nacional)**.

[cite_start]El objetivo principal es aplicar los conceptos de la Programación Funcional en Java utilizando el API de Streams, expresiones Lambda y Collectors para procesar colecciones de datos de forma declarativa[cite: 9].

## 🛠️ Tecnologías Utilizadas

* **Java** (JDK 11 o superior)
* **Gradle** (Gestor de dependencias y build)
* **Lombok** (Para reducir código boilerplate)
* **IntelliJ IDEA** (Como IDE de desarrollo)

## 🚀 Instrucciones de Ejecución

Para clonar y ejecutar este proyecto, seguí estos pasos:

### 1. Prerrequisitos

* Tener instalado un **JDK** (Java Development Kit) 11 o superior.
* Tener **IntelliJ IDEA** instalado.

### 2. Configuración en IntelliJ IDEA

1.  **Clonar o descargar** el repositorio en tu máquina local.
2.  Abrir IntelliJ IDEA y seleccionar **"Open"**.
3.  Navegar hasta la carpeta raíz del proyecto (donde se encuentra el archivo `build.gradle`) y seleccionarla. IntelliJ detectará automáticamente que es un proyecto Gradle.
4.  **¡IMPORTANTE: Habilitar Lombok!** Este proyecto usa Lombok y requiere un paso manual en IntelliJ:
    * Ir a `File` $\rightarrow$ `Settings` (o `IntelliJ IDEA` $\rightarrow$ `Preferences...` en Mac).
    * Navegar a `Build, Execution, Deployment` $\rightarrow$ `Compiler` $\rightarrow$ `Annotation Processors`.
    * Asegurarse de que la casilla **"Enable annotation processing"** esté **marcada**.
5.  **Sincronizar Gradle:** Esperar a que IntelliJ descargue las dependencias (Lombok). Si no lo hace automáticamente, buscar el ícono de Gradle (elefante) en la barra lateral derecha y hacer clic en el botón de "Recargar" (Reload All Gradle Projects).

### 3. Ejecución

Todos los ejercicios se ejecutan desde una única clase `Main`.

* Navegá a `src/main/java/org/example/Main.java`.
* Hacé clic derecho en el archivo y seleccioná **"Run 'Main.main()'"**.
* Los resultados de todos los casos prácticos se imprimirán en la consola.

## 📋 Contenido del Trabajo Práctico

El `Main.java` contiene la resolución de los 4 casos prácticos propuestos:

### [cite_start]Caso Práctico 1: Alumno [cite: 17]

[cite_start]Dada una lista de `Alumno` (nombre, nota, curso)[cite: 18]:
* [cite_start]Se obtienen los nombres de alumnos aprobados ($\geq$ 7) en mayúsculas y ordenados[cite: 19].
* [cite_start]Se calcula el promedio general de notas[cite: 20].
* [cite_start]Se agrupan los alumnos por curso[cite: 21].
* [cite_start]Se obtienen los 3 alumnos con las mejores notas[cite: 22].

### [cite_start]Caso Práctico 2: Producto [cite: 27]

[cite_start]Dada una lista de `Producto` (nombre, categoria, precio, stock)[cite: 28]:
* [cite_start]Se listan productos con precio > 100, ordenados por precio descendente[cite: 29].
* [cite_start]Se agrupan productos por categoría y se calcula el stock total de cada una[cite: 30].
* [cite_start]Se genera un `String` con "nombre:precio" de cada producto, separado por `;`[cite: 31, 32].
* [cite_start]Se calcula el precio promedio general y el promedio por categoría[cite: 33].

### [cite_start]Caso Práctico 3: Libro [cite: 46]

[cite_start]Dada una lista de `Libro` (titulo, autor, paginas, precio)[cite: 47]:
* [cite_start]Se listan los títulos de libros con más de 300 páginas, ordenados alfabéticamente[cite: 48].
* [cite_start]Se calcula el promedio de páginas de todos los libros[cite: 49].
* [cite_start]Se agrupan los libros por autor y se cuenta cuántos libros tiene cada uno[cite: 50].
* [cite_start]Se obtiene el libro más caro de la lista[cite: 51].

### [cite_start]Caso Práctico 4: Empleado [cite: 56]

[cite_start]Dada una lista de `Empleado` (nombre, departamento, salario, edad)[cite: 57]:
* [cite_start]Se obtiene la lista de empleados con salario > 2000, ordenados por salario descendente[cite: 62].
* [cite_start]Se calcula el salario promedio general[cite: 63].
* [cite_start]Se agrupan los empleados por departamento y se calcula la suma de salarios de cada uno[cite: 64].
* [cite_start]Se obtienen los nombres de los 2 empleados más jóvenes[cite: 65].
