public class TablaMultiplicar {
    public static void main(String[] args) {
        int numeroTabla = 5; // El número del cual queremos la tabla

        System.out.println("=== TABLA DEL " + numeroTabla + " ===");

        // El ciclo empieza en 1, llega hasta 10, y avanza de 1 en 1
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            
            // Calculamos el resultado en cada vuelta
            int resultadoOperacion = numeroTabla * multiplicador;
            
            // Mostramos la operación completa en la pantalla
            System.out.println(numeroTabla + " x " + multiplicador + " = " + resultadoOperacion);
        }

        System.out.println("=========================");
    }
}