import java.util.Scanner; // Necesario para que Scanner funcione

public class elPrimerPrograma {
    public static void main(String[] args) {
        // Creamos nuestra herramienta para leer el teclado
        Scanner teclado = new Scanner(System.in);

        // 1. Pedir y guardar el nombre (Texto)
        System.out.println("Por favor, ingresa tu nombre:");
        String nombreUsuario = teclado.nextLine();

        // 2. Pedir y guardar la edad (Número entero)
        System.out.println("Ahora, ingresa tu edad:");
        int edadUsuario = teclado.nextInt();

        // 3. Mostrar el resultado final combinando las variables
        System.out.println("¡Hola " + nombreUsuario + "! Es un gusto saludarte. Veo que tienes " + edadUsuario + " años.");
    }
}