import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar las opciones de géneros de libros al usuario
        System.out.println("Bienvenido al Sistema de Recomendación de Libros");
        System.out.println("Por favor, elige tu género de libro favorito:");
        System.out.println("1. Fantasía");
        System.out.println("2. Misterio");
        System.out.println("3. Romance");
        System.out.println("4. Ciencia ficción");

        // Leer la elección del usuario
        int opcion = scanner.nextInt();

        // Variable para almacenar la recomendación de libro
        String recomendacion;

        // Evaluar la elección del usuario y asignar la recomendación
        switch (opcion) {
            case 1:
                recomendacion = "Te recomendamos leer 'El Señor de los Anillos' de J.R.R. Tolkien.";
                break;
            case 2:
                recomendacion = "Te recomendamos leer 'Sherlock Holmes' de Arthur Conan Doyle.";
                break;
            case 3:
                recomendacion = "Te recomendamos leer 'Orgullo y Prejuicio' de Jane Austen.";
                break;
            case 4:
                recomendacion = "Te recomendamos leer 'Dune' de Frank Herbert.";
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
