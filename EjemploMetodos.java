public class EjemploMetodos {

    // 1. Creamos nuestro método personalizado para sumar
    // Recibe dos números enteros como entrada y devuelve un entero como resultado
    public static int calcularSuma(int numeroPrimero, int numeroSegundo) {
        int resultadoSuma = numeroPrimero + numeroSegundo;
        return resultadoSuma; // Devolvemos el resultado al lugar donde nos llamaron
    }

    // 2. El método principal (el motor del programa)
    public static void main(String[] args) {
        int numeroA = 15;
        int numeroB = 20;

        System.out.println("Arrancando el programa...");

        // Llamamos al método por su nombre y le pasamos los dos números
        int resultadoFinal = calcularSuma(numeroA, numeroB);

        // Mostramos el resultado que nos devolvió el método
        System.out.println("El resultado de la suma es: " + resultadoFinal);
    }
}