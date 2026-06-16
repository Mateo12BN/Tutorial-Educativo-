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