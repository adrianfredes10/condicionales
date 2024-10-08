import java.util.Scanner;

public class ej7 {

    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opciones de estados de ánimo
        System.out.println("¿Cuál es tu estado de ánimo? (feliz, triste, enérgico, relajado)");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        // Variable para almacenar la recomendación
        String recomendacion;

        // Determinar la recomendación basada en el estado de ánimo
        switch (estadoAnimo) {
            case "feliz":
                recomendacion = "¡Genial! Te recomiendo salir a pasear o disfrutar de un buen café con amigos.";
                break;
            case "triste":
                recomendacion = "Lo siento. Podrías ver una película que te haga reír o escuchar música alegre.";
                break;
            case "energético":
                recomendacion = "¡Perfecto! ¿Qué tal si haces ejercicio? Una buena sesión de entrenamiento te vendría bien.";
                break;
            case "relajado":
                recomendacion = "Maravilloso. Te recomiendo meditar o leer un libro interesante.";
                break;
            default:
                recomendacion = "Estado de ánimo no válido. Por favor, elige entre 'feliz', 'triste', 'energético' o 'relajado'.";
                break;
        }

        // Mostrar la recomendación
        System.out.println(recomendacion);

        // Cerrar el Scanner
        scanner.close();
    }
}
