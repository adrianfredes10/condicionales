import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario las horas de sueño diarias
        System.out.print("¿Cuántas horas al día duermes? ");
        int horasSueno = scanner.nextInt();

        // Pedir al usuario las horas de ejercicio diarias
        System.out.print("¿Cuántas horas al día haces ejercicio? ");
        int horasEjercicio = scanner.nextInt();

        // Pedir al usuario cuántas comidas saludables consume al día
        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int comidasSaludables = scanner.nextInt();

        // Evaluar los hábitos saludables
        String evaluacionSueno = evaluarSueno(horasSueno);
        String evaluacionEjercicio = evaluarEjercicio(horasEjercicio);
        String evaluacionComidas = evaluarComidas(comidasSaludables);

        // Mostrar la evaluación final
        System.out.println("\nEvaluación de tus hábitos saludables:");
        System.out.println(evaluacionSueno);
        System.out.println(evaluacionEjercicio);
        System.out.println(evaluacionComidas);

        // Cerrar el Scanner
        scanner.close();

        System.out.println("\n¡Sigue trabajando en tus hábitos! ¡Cada pequeño paso cuenta para una vida más sana!");
    }

    // Método para evaluar las horas de sueño
    private static String evaluarSueno(int horas) {
        if (horas >= 7 && horas <= 9) {
            return "¡Excelente! Estás durmiendo lo recomendado.";
        } else if (horas < 7) {
            return "Parece que podrías dormir un poco más para cuidar tu salud.";
        } else {
            return "¡Vaya! Tal vez estás durmiendo un poco de más.";
        }
    }

    // Método para evaluar las horas de ejercicio
    private static String evaluarEjercicio(int horas) {
        if (horas >= 1) {
            return "¡Genial! Haces suficiente ejercicio para mantenerte activo.";
        } else {
            return "Trata de incorporar un poco más de ejercicio a tu rutina diaria.";
        }
    }

    // Método para evaluar las comidas saludables
    private static String evaluarComidas(int cantidad) {
        if (cantidad >= 3) {
            return "¡Fantástico! Tus hábitos alimenticios son saludables.";
        } else {
            return "Considera aumentar el número de comidas saludables en tu día.";
        }
    }
}
