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