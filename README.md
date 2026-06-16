#  Tutorial Educativo de Programación

¡Bienvenido! Este es un espacio diseñado para cualquier persona interesada en iniciar en el maravilloso mundo de la programación. Aquí aprenderás desde los conceptos más básicos hasta el manejo de datos estructurados dentro de JAVA de forma práctica y sencilla.

---

##  Contenido del Tutorial

Para facilitar tu aprendizaje, el material está dividido en los siguientes módulos clave:

* **🔄 Ciclos (Bucles):** Aprende a automatizar tareas repitiendo bloques de código eficientemente.
* **🧩 Métodos (Funciones):** Organiza, reutiliza y dale estructura limpia a tus programas.
* **📊 Vectores y Matrices:** Domina las estructuras de datos unidimensionales y bidimensionales para almacenar información.
* **📋 Listas:** Trabaja con colecciones dinámicas de datos de forma flexible.
* **💾 Manejo de Archivos CSV:** Aprende a leer y escribir datos en archivos para conectar tus programas con el mundo real.


## INTRODUCCION
##  1. Variables y Tipos de Datos

Antes de escribir nuestras primeras líneas de código, debemos entender cómo la computadora guarda la información. 

Imagina que una **variable** es como una caja con una etiqueta pegada por fuera. El nombre de la etiqueta nos dice qué hay dentro, y el contenido es el valor que guardamos. Como en la vida real no guardarías sopa en una caja de zapatos, en programación cada "caja" tiene un **tipo de dato** específico según lo que va a contener.

---

###  Los Tipos de Datos Básicos

Para empezar a hacer nuestros primeros programas, utilizaremos principalmente cuatro tipos de cajas:

| Tipo de Dato | ¿Para qué sirve? | Ejemplo de la vida real |
| :--- | :--- | :--- |
| **`String`** (Cadena) | Guarda texto o líneas completas de palabras. | Un nombre, un mensaje de bienvenida. |
| **`int`** (Entero) | Guarda números exactos sin decimales. | La edad de una persona, el año actual. |
| **`double`** (Real) | Guarda números con puntos decimales. | El precio de un producto, calificaciones. |
| **`boolean`** (Booleano) | Solo puede tener dos estados: `true` (verdadero) o `false` (falso). | Si el usuario inició sesión o no. |

---

###  ¿Cómo declarar variables? (Crear nuestras cajas)

Para crear una variable, primero le decimos a la computadora el **tipo de dato**, luego le asignamos un **nombre descriptivo** (para saber qué guarda), y finalmente usamos el signo `=` para meter el valor dentro.

Aquí tienes cómo se ve en código real:

```java
// 1. Guardando un texto descriptivo
String textoPrincipal = "¡Bienvenido a tu primer programa!";

// 2. Guardando números enteros y decimales
int edadUsuario = 19;
double precioTotal = 45.50;

// 3. Guardando un estado (verdadero o falso)
boolean estaRegistrado = true;
```
### ⌨️ 2. Entrada y Salida de Datos (Interactuar con el usuario)

Hasta ahora, hemos creado variables con valores fijos. Pero un verdadero programa necesita interactuar con las personas: mostrarles mensajes en la pantalla (Salida) y leer lo que escriben desde sus teclados (Entrada).

---
### ⌨️ 2. Entrada y Salida de Datos (Interactuar con el usuario)

Hasta ahora, hemos creado variables con valores fijos. Pero un verdadero programa necesita interactuar con las personas: mostrarles mensajes en la pantalla (Salida) y leer lo que escriben desde sus teclados (Entrada).

---

### 🖥️ 1. Salida de Datos (Mostrar mensajes)
Para mostrarle información al usuario en la pantalla, utilizamos la instrucción `System.out.println()`. Todo lo que coloques dentro de los paréntesis entre comillas se imprimirá en la consola.

```java
System.out.println("Hola, este texto aparecerá en la pantalla.");

```
Ejemplo: Tu primer programa interactivo
Vamos a juntar todo lo que hemos aprendido en un solo lugar. Puedes revisar y descargar el código fuente completo directamente aquí: 📄 elPrimerPrograma.java.

Este programa le preguntará al usuario su nombre y su edad, guardará las respuestas en variables limpias y descriptivas, y luego mostrará un saludo personalizado.

