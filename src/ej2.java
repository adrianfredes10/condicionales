import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el precio del producto
        System.out.print("Ingresa el precio del producto: ");
        double precio = scanner.nextDouble();

        // Mostrar las opciones de categoría al usuario
        System.out.println("Selecciona la categoría del cliente:");
        System.out.println("1. Estudiante (10% de descuento)");
        System.out.println("2. Adulto (5% de descuento)");
        System.out.println("3. Jubilado (15% de descuento)");

        // Leer la categoría del usuario
        int categoria = scanner.nextInt();

        // Variable para almacenar el porcentaje de descuento
        double descuento;

        // Evaluar la categoría del usuario y asignar el descuento correspondiente
        switch (categoria) {
            case 1:
                descuento = 0.10; // 10% de descuento para estudiantes
                break;
            case 2:
                descuento = 0.05; // 5% de descuento para adultos
                break;
            case 3:
                descuento = 0.15; // 15% de descuento para jubilados
                break;
            default:
                System.out.println("Categoría no válida. Por favor, selecciona un número entre 1 y 3.");
                scanner.close();
                return; // Salir del programa si la opción no es válida
        }

        // Calcular el precio final después del descuento
        double descuentoAplicado = precio * descuento;
        double precioFinal = precio - descuentoAplicado;

        // Mostrar el precio final después del descuento
        System.out.println("El precio final después del descuento es: $" + precioFinal);

        // Cerrar el Scanner
        scanner.close();
    }
}
