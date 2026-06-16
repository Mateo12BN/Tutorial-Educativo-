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