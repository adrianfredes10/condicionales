import java.util.Random;
import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Opciones del juego
        String[] opciones = {"piedra", "papel", "tijera"};

        // Pedir al usuario que elija una opción
        System.out.println("Elige entre piedra, papel o tijera:");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        // Validar la elección del usuario
        if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijera")) {
            System.out.println("Opción no válida. Por favor elige 'piedra', 'papel' o 'tijera'.");
            scanner.close();
            return; // Salir del programa si la opción no es válida
        }

        // Elegir una opción al azar para la computadora
        Random random = new Random();
        String eleccionComputadora = opciones[random.nextInt(opciones.length)];

        // Mostrar las elecciones
        System.out.println("Tu elección: " + eleccionUsuario);
        System.out.println("Elección de la computadora: " + eleccionComputadora);

        // Determinar el ganador
        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("¡Es un empate!");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste! La computadora gana.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
