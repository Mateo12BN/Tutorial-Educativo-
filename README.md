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
###  Entrada y Salida de Datos (Interactuar con el usuario)

Hasta ahora, hemos creado variables con valores fijos. Pero un verdadero programa necesita interactuar con las personas: mostrarles mensajes en la pantalla (Salida) y leer lo que escriben desde sus teclados (Entrada).

---
###  Entrada y Salida de Datos (Interactuar con el usuario)

Hasta ahora, hemos creado variables con valores fijos. Pero un verdadero programa necesita interactuar con las personas: mostrarles mensajes en la pantalla (Salida) y leer lo que escriben desde sus teclados (Entrada).

---

### Salida de Datos (Mostrar mensajes)
Para mostrarle información al usuario en la pantalla, utilizamos la instrucción `System.out.println()`. Todo lo que coloques dentro de los paréntesis entre comillas se imprimirá en la consola.

```java
System.out.println("Hola, este texto aparecerá en la pantalla.");

```
Ejemplo: Tu primer programa interactivo
Vamos a juntar todo lo que hemos aprendido en un solo lugar y descargar el código fuente completo directamente aquí: [📄 elPrimerPrograma.java](elPrimerPrograma.java)

Este programa le preguntará al usuario su nombre y su edad, guardará las respuestas en variables limpias y descriptivas, y luego mostrará un saludo personalizado.

## Ciclos o Bucles (Automatizar tareas repetitivas)

Ahora podemos empezar a hablar de ciclos para entenderlo de mejor manera imagina que tu profesor te pide como castigo escribir en la pantalla *"Debo usar variables con nombres descriptivos"* unas 100 veces. Copiar y pegar la línea `System.out.println()` cien veces sería aburrido y una mala práctica.

Para eso existen los **ciclos (bucles)**: estructuras que nos permiten repetir un bloque de código tantas veces como necesitemos de forma automática.

---

###  El Ciclo `while` (Repetir mientras se cumpla una condición)

Piensa en el ciclo `while` como un condicional `if` que se repite una y otra vez. El programa evalúa una condición: si es verdadera (`true`), ejecuta el código de adentro y vuelve a revisar. Se detendrá únicamente cuando la condición se vuelva falsa (`false`).



####  Ejemplo práctico con `while`:
Vamos a crear un contador simple que imprima los números del 1 al 5.

```java
public class EjemploWhile {
    public static void main(String[] args) {
        int contadorNumero = 1; // 1. Inicialización: ¿Dónde empezamos?

        // Mientras el contador sea menor o igual a 5, el ciclo continuará
        while (contadorNumero <= 5) { // 2. Condición: ¿Hasta dónde llegamos?
            System.out.println("El número actual es: " + contadorNumero);
            
            contadorNumero++; // 3. Incremento: Sumamos 1 para avanzar (evita un ciclo infinito)
        }
        
        System.out.println("¡Ciclo terminado!");
    }
}
```
Aqui se encuentra un ejemplo practico de como deberias hacer un ciclo for en un ejemplo Practico como lo es la tabla de multiplicar del 5: [📄 TablaMultiplicar.java](TablaMultiplicar.java) 

##  Métodos (Funciones) - Organiza y reutiliza tu código

Imagina que estás construyendo una casa con bloques de Lego. En lugar de fabricar cada bloque desde cero cada vez que lo necesitas, usas bloques que ya vienen listos y los repites por toda la construcción.

En programación, un **método** (o función) es un bloque de código que realiza una tarea específica y al cual le asignamos un nombre. Cuando queremos que el programa ejecute esa tarea, simplemente lo llamamos por su nombre. Esto nos ayuda a evitar copiar y pegar el mismo código una y otra vez, logrando un **Código Limpio**.

---

### Estructura básica de un método
Para crear un método en Java, necesitamos definir algunas cosas importantes:

```java
public static tipoDeRetorno nombreDelMetodo(tipoDeDato parametro) {
    // Aquí va el código que realiza la tarea
    return valor; 
}
```
tipoDeRetorno: Es el tipo de caja (dato) que el método nos devolverá al terminar su trabajo (int, String, double, etc.). Si el método solo hace una acción (como imprimir un mensaje) y no devuelve ningún valor, usamos la palabra void (vacío).

nombreDelMetodo: Un nombre descriptivo en verbo que explique qué hace (ej. calcularSuma, mostrarSaludo).

parámetros (Opcional): Son los datos de entrada que el método necesita para poder trabajar (las materias primas).
-----
Ejemplo Práctico: Una calculadora organizada
Vamos a crear un programa que tenga un método especial para sumar dos números. Así, el método main se mantendrá limpio y ordenado, delegando el trabajo matemático a nuestro nuevo método.

Puedes ver el archivo de código fuente completo aquí: [📄 EjemploMetodos.java](EjemploMetodos.java) 
