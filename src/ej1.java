import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar las opciones de géneros al usuario
        System.out.println("Bienvenido al Sistema de Recomendación de Películas");
        System.out.println("Por favor, elige tu género de película favorito:");
        System.out.println("1. Acción");
        System.out.println("2. Comedia");
        System.out.println("3. Drama");
        System.out.println("4. Ciencia ficción");

        // Leer la elección del usuario
        int opcion = scanner.nextInt();

        // Variable para almacenar la recomendación de película
        String recomendacion;

        // Evaluar la elección del usuario y asignar la recomendación
        switch (opcion) {
            case 1:
                recomendacion = "Te recomendamos ver 'Mad Max: Fury Road'.";
                break;
            case 2:
                recomendacion = "Te recomendamos ver 'The Hangover'.";
                break;
            case 3:
                recomendacion = "Te recomendamos ver 'La La Land'.";
                break;
            case 4:
                recomendacion = "Te recomendamos ver 'Inception'.";
                break;
            default:
                recomendacion = "Opción no válida. Por favor, selecciona un número entre 1 y 4.";
                break;
        }

        // Mostrar la recomendación o mensaje de error
        System.out.println(recomendacion);

        // Cerrar el Scanner
        scanner.close();
    }
}
