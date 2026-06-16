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

### Ventajas de usar Métodos:

Reutilización: Si en el método main necesitáramos sumar otros números más adelante, ya no tenemos que volver a escribir la lógica de la suma; basta con escribir calcularSuma(50, 80);.

Lectura Fácil: Tu código se lee casi como un libro en español. Cualquiera que mire el main entenderá de inmediato que la línea calcularSuma(numeroA, numeroB) está haciendo una suma, sin necesidad de ver los signos matemáticos de fondo.

## 📊 5. Vectores y Matrices (Arreglos) - Guardando colecciones de datos

Imagina que una variable común es un casillero individual en una escuela. Solo sirve para guardar las cosas de un estudiante. 

Un **Vector** (o arreglo unidimensional) es como un pasillo largo lleno de casilleros numerados, uno al lado del otro. Todos los casilleros pertenecen a la misma fila y guardan el mismo tipo de cosas. Una **Matrix** (o arreglo bidimensional) es un paso más allá: es como un edificio entero de casilleros organizado en múltiples filas y columnas (como una hoja de cálculo de Excel).



---

###  Vectores (Arreglos de una sola dimensión)

Un vector te permite almacenar una lista de datos del mismo tipo bajo un único nombre. Para identificar cada dato dentro de la lista, utilizamos un número de posición llamado **Índice**.

**¡Regla fundamental de la programación!**
> En la informática, los índices **siempre empiezan a contar desde el número 0**, no desde el 1. El primer casillero es el `[0]`, el segundo es el `[1]`, y así sucesivamente.

#### Ejemplo práctico con Vectores:
Vamos a crear un vector que almacene las notas de un estudiante en tres exámenes distintos y luego calcularemos su promedio usando nombres descriptivos y un ciclo `for`.

Puedes revisar el código completo aquí: [📄 EjemploVectores.java](EjemploVectores.java)

```java
public class EjemploVectores {
    public static void main(String[] args) {
        // 1. Declaramos un vector de tipo double para guardar 3 notas
        double[] notasExamenes = new double[3];

        // 2. Guardamos datos en cada posición (índice)
        notasExamenes[0] = 8.5; // Primera nota
        notasExamenes[1] = 9.0; // Segunda nota
        notasExamenes[2] = 7.5; // Tercera nota

        double sumaNotas = 0;

        // 3. Usamos un ciclo for para recorrer el vector automáticamente
        // notasExamenes.length nos dice cuántos elementos tiene el vector (en este caso, 3)
        for (int posicion = 0; posicion < notasExamenes.length; posicion++) {
            sumaNotas = sumaNotas + notasExamenes[posicion];
        }

        // 4. Calculamos y mostramos el promedio final
        double promedioFinal = sumaNotas / notasExamenes.length;
        System.out.println("El promedio final del estudiante es: " + promedioFinal);
    }
}
````
## Matrices (Arreglos bidimensionales)
Una matriz es una estructura de datos organizada en filas y columnas. Para poder encontrar o guardar un dato dentro de ella, ya no nos basta con un solo índice; ahora necesitamos dos coordenadas: [fila] y [columna].

Para recorrer por completo una matriz y pasar por cada uno de sus casilleros, el truco estándar en programación es utilizar dos ciclos for anidados (un ciclo dentro de otro). El ciclo de afuera se encarga de cambiar de fila, mientras que el ciclo de adentro recorre todas las columnas de esa fila.

## Ejemplo práctico con Matrices:
Imagina una tienda que registra las ventas de 2 productos diferentes a lo largo de 3 meses. Vamos a organizar estos datos en una matriz de 2 filas y 3 columnas para calcular el total de ventas.

Puedes revisar el código completo aquí: [📄 EjemploMatrices.java](EjemploMatrices.java)
```java
public class EjemploMatrices {
    public static void main(String[] args) {
        // Declaramos una matriz de 2 filas (productos) y 3 columnas (meses)
        int[][] matrizVentas = new int[2][3];

        // Fila 0: Ventas del Producto A en los meses 1, 2 y 3
        matrizVentas[0][0] = 120; 
        matrizVentas[0][1] = 150; 
        matrizVentas[0][2] = 130; 

        // Fila 1: Ventas del Producto B en los meses 1, 2 y 3
        matrizVentas[1][0] = 80;  
        matrizVentas[1][1] = 95;  
        matrizVentas[1][2] = 110; 

        int ventasTotales = 0;

        System.out.println("Procesando la matriz de ventas...");

        // Ciclo externo: Recorre las Filas (Productos)
        for (int fila = 0; fila < 2; fila++) {
            
            // Ciclo interno: Recorre las Columnas (Meses) de la fila actual
            for (int columna = 0; columna < 3; columna++) {
                ventasTotales = ventasTotales + matrizVentas[fila][columna];
            }
        }

        System.out.println("El dinero total recaudado en las ventas es: " + ventasTotales);
    }
}
```
### Consejo de Código Limpio para Arreglos:
Cuando uses variables para controlar los ciclos que recorren tus vectores o matrices, evita usar nombres confusos o genéricos de una sola letra como i o j. Cambiarlos por palabras descriptivas como posicion, fila o columna hará que cualquiera que lea tu código entienda de inmediato qué coordenada del arreglo se está analizando en esa línea.

##  Listas (Colecciones Dinámicas de Datos)

Imagina que estás haciendo una lista de compras en una hoja de papel. Si recuerdas un producto nuevo, simplemente lo escribes al final. Si ya no quieres comprar algo, lo tachas y la lista se reduce. No tuviste que comprar una hoja de un tamaño exacto antes de salir de casa.

Eso es exactamente una **Lista (`ArrayList`)** en programación. A diferencia de los vectores tradicionales que tienen un tamaño fijo, las listas son dinámicas: pueden crecer y achicarse de forma flexible mientras el programa se está ejecutando.

---

### Las Herramientas Clave de una Lista

En Java, para manipular los elementos de una lista, no usamos corchetes `[]` como en los vectores. En su lugar, utilizamos métodos especiales muy intuitivos:

* **`.add(elemento)`**: Agrega un nuevo elemento al final de la lista.
* **`.get(índice)`**: Te permite leer el elemento que está en una posición específica (recuerda que seguimos contando desde el 0).
* **`.size()`**: Te devuelve el tamaño actual de la lista (cuántos elementos hay guardados).
* **`.remove(índice)`**: Elimina por completo el elemento de esa posición y reorganiza la lista automáticamente.

---

### Ejemplo Práctico: Sistema de Registro de Alumnos

Para ver el poder de las listas, vamos a crear un programa que simule el registro de estudiantes en un curso. No sabemos cuántos alumnos se van a inscribir hoy, así que una lista dinámica es la solución perfecta.

Puedes revisar el código fuente completo aquí: [📄 EjemploListas.java](EjemploListas.java)

```java
import java.util.ArrayList; // Necesario para poder usar listas dinámicas

public class EjemploListas {
    public static void main(String[] args) {
        
        // 1. Creamos una lista dinámica diseñada exclusivamente para guardar textos (String)
        ArrayList<String> listaAlumnos = new ArrayList<>();

        System.out.println("--- Registrando alumnos nuevos ---");

        // 2. Agregamos elementos de forma dinámica con .add()
        listaAlumnos.add("Mateo Buenaño");
        listaAlumnos.add("Juan Pérez");
        listaAlumnos.add("María Rivera");

        // 3. Revisamos el tamaño de la lista con .size()
        System.out.println("El número total de alumnos inscritos es: " + listaAlumnos.size());

        // 4. Mostramos el alumno de una posición específica usando .get()
        System.out.println("El primer alumno de la lista es: " + listaAlumnos.get(0));

        System.out.println("\n--- Lista Completa de Alumnos ---");
```
## Vector o lista ?? Cual usar
Usa un Vector si sabes el número exacto de elementos de antemano y este nunca va a cambiar (por ejemplo: los 7 días de la semana, los 12 meses del año).

Usa una Lista si el número de elementos es totalmente desconocido o variable (por ejemplo: los productos de un carrito de compras, los usuarios conectados a un juego).

## Manejo de Archivos CSV (Guardar datos permanentemente)

Imagina que juegas a un videojuego, pasas varios niveles difícilmente, pero el juego no tiene la opción de "Guardar Partida". Al apagar la consola, perderías todo tu progreso. Sería frustrante, ¿verdad?

En programación ocurre lo mismo. Para evitar que la información se borre al cerrar la aplicación, aprendemos a **escribir y leer archivos**. En este tutorial utilizaremos el formato **CSV** (*Comma-Separated Values*). Un archivo CSV es un simple documento de texto donde cada fila representa un registro y las columnas están separadas por un carácter especial, comúnmente una coma (`,`) o un punto y coma (`;`).

---

### Escritura de Datos (Guardar información)

Para crear un archivo y escribir texto dentro de él en Java de forma limpia y eficiente, combinamos dos herramientas: `FileWriter` (para abrir el archivo) y `PrintWriter` (para escribir renglón por renglón).

####  Ejemplo Práctico: Guardar una lista de alumnos en un CSV
Vamos a automatizar el guardado de datos simulando un registro permanente.

Puedes revisar el código fuente completo aquí: [📄 GuardarCSV.java](GuardarCSV.java)

```java
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class GuardarCSV {
    public static void main(String[] args) {
        // Nombre del archivo que vamos a crear en la computadora
        String nombreArchivo = "alumnos Registrados.csv";

        // Usamos try-with-resources para asegurarnos de que el archivo se cierre correctamente al terminar
        try (FileWriter archivoEscritura = new FileWriter(nombreArchivo);
             PrintWriter escritorTexto = new PrintWriter(archivoEscritura)) {

            // 1. Escribimos la cabecera (los títulos de las columnas)
            escritorTexto.println("Nombre;Edad;Estado");

            // 2. Escribimos filas de datos simulados usando punto y coma como separador
            escritorTexto.println("Mateo Buenaño;19;Activo");
            escritorTexto.println("Juan Pérez;21;Inactivo");
            escritorTexto.println("María Rivera;20;Activo");

            System.out.println("¡Los datos se han guardado con éxito en " + nombreArchivo + "!");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al intentar guardar el archivo.");
        }
    }
}
```
### Estructura de nuestro archivo CSV de ejemplo

Para que entiendas exactamente cómo se almacena la información, vamos a trabajar con un archivo llamado `alumnosRegistrados.csv`. 

Si abres este archivo con un **Bloc de Notas** (texto plano), verás que la primera línea representa los encabezados (las columnas) y las líneas siguientes son los datos de los estudiantes, separados estrictamente por un punto y coma (`;`):

```text
Nombre;Edad;Estado
Mateo Buenaño;19;Activo
Juan Pérez;21;Inactivo
María Rivera;20;Activo
## Lectura de Datos (Recuperar información)
Para volver a traer los datos guardados en el archivo CSV hacia nuestro programa, utilizamos la herramienta BufferedReader. Esta lee el archivo línea por línea, y luego usamos la función .split(";") para separar el texto cada vez que encuentre un punto y coma, recuperando los datos originales de forma limpia.
```
### Ejemplo Práctico: Leer y mostrar el contenido del CSV
Vamos a abrir el archivo que creamos en el paso anterior y mostrarlo de forma organizada por consola.

Puedes revisar el código fuente completo aquí: [📄 LeerCSV.java](LeerCSV.java)

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerCSV {
    public static void main(String[] args) {
        String nombreArchivo = "alumnos Registrados.csv";
        String lineaTexto;

        try (FileReader archivoLectura = new FileReader(nombreArchivo);
             BufferedReader lectorLineas = new BufferedReader(archivoLectura)) {

            System.out.println("--- Leyendo datos desde el archivo CSV --- \n");

            // Leemos línea por línea hasta que el archivo se quede vacío (null)
            while ((lineaTexto = lectorLineas.readLine()) != null) {
                
                // El truco mágico: .split separa la línea en un vector de textos usando el ";"
                String[] datosSeparados = lineaTexto.split(";");
                
                // Si la estructura es correcta, mostramos los datos limpios
                System.out.println("Nombre: " + datosSeparados[0] + " | Edad: " + datosSeparados[1] + " | Estado: " + datosSeparados[2]);
            }

        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo. Asegúrate de haber ejecutado primero el programa de escritura.");
        }
    }
}
```
## Buenas Prácticas del Manejo de Archivos:
1. Atrapa los errores (try - catch): Trabajar con archivos depende de cosas externas al código (como que el disco duro esté lleno o que borren el archivo manualmente). Siempre usa estructuras que controlen estos problemas sin romper el programa repentinamente.

2. Cierra siempre los archivos: Si no cierras un archivo después de usarlo, se quedará "bloqueado" en la memoria del sistema operativo y ningún otro programa (como Excel) podrá abrirlo. Al usar la estructura try (...) que pusimos en los ejemplos, Java se encarga de cerrarlos automáticamente por ti de forma segura.

##  Conclusión y Próximos Pasos

¡Felicidades por llegar hasta el final de esta guía! 

Si lograste comprender y replicar los ejemplos de este tutorial, has construido las bases fundamentales que utiliza cualquier desarrollador de software en el mundo real. Aprendiste a:
*  Pensar de forma lógica y estructurada con **Variables** y **Tipos de Datos**.
*  Crear programas interactivos controlando la **Entrada y Salida de datos**.
*  Automatizar tareas pesadas mediante el uso inteligente de **Ciclos (`while` y `for`)**.
*  Escribir código organizado, modular y limpio usando **Métodos**.
*  Manipular colecciones de información complejas con **Vectores, Matrices y Listas**.
*  Conectar tus aplicaciones con el mundo exterior guardando datos permanentes en archivos **CSV**.

###  ¿Hacia dónde ir ahora?

El camino del aprendizaje en la programación nunca se detiene. Ahora que dominas los pilares de la lógica, te sugerimos explorar los siguientes niveles:

**Programación Orientada a Objetos (POO):** Aprende a modelar elementos del mundo real (como un `Alumno`, un coche o un producto) dentro de tu código usando clases, atributos y objetos.
**Conexión a Bases de Datos Relacionales:** Da el salto de los archivos CSV a sistemas de almacenamiento más potentes y profesionales como MySQL o PostgreSQL.
**Algoritmos Avanzados y Estructuras de Datos:** Investiga cómo ordenar y buscar información de la manera más rápida y eficiente posible dentro de tus programas.

> 💡 **Recuerda:**
La programación no se aprende solo leyendo, se aprende **escribiendo código**. No tengas miedo de romper tus programas, experimentar con cambios en las variables y proponer tus propios retos. ¡La persistencia es la clave del éxito!
