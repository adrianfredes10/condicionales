import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su peso en kilogramos
        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        // Pedir al usuario que ingrese su altura en metros
        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Mostrar el IMC calculado
        System.out.printf("Tu Índice de Masa Corporal (IMC) es: %.2f%n", imc);

        // Determinar la categoría del IMC y la recomendación
        String recomendacion;
        if (imc < 18.5) {
            recomendacion = "Bajo peso. Es recomendable consultar a un profesional de la salud.";
        } else if (imc >= 18.5 && imc < 24.9) {
            recomendacion = "Peso normal. ¡Sigue así!";
        } else if (imc >= 25 && imc < 29.9) {
            recomendacion = "Sobrepeso. Considera llevar una dieta equilibrada y hacer ejercicio.";
        } else {
            recomendacion = "Obesidad. Es recomendable consultar a un profesional de la salud.";
        }

        // Mostrar la recomendación
        System.out.println(recomendacion);

        // Cerrar el Scanner
        scanner.close();
    }
}
