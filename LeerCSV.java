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