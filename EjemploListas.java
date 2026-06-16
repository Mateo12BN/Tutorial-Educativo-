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

        // 5. Usamos un ciclo for para recorrer la lista por completo
        // Nota cómo usamos 'posicion < listaAlumnos.size()' para saber cuándo detenernos
        for (int posicion = 0; posicion < listaAlumnos.size(); posicion++) {
            System.out.println("Posición " + posicion + ": " + listaAlumnos.get(posicion));
        }

        // 6. Eliminar un elemento con .remove()
        System.out.println("\nUn alumno se dio de baja. Eliminando al alumno de la posición 1...");
        listaAlumnos.remove(1); // Elimina a "Juan Pérez"

        // Comprobamos cómo se reorganizó la lista de forma automática
        System.out.println("Ahora la posición 1 pertenece a: " + listaAlumnos.get(1)); // Ahora es María
    }
}