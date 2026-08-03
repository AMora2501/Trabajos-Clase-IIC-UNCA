package Exercise6;
import java.util.Scanner;
public class studentStatistics {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Variables para acumular los totales
        int sumAges = 0;
        double sumHeights = 0.0;

        // Contadores para las condiciones específicas
        int adutls = 0; //mayores de 18
        int tall = 0;   //mayores de 1.75

        System.out.println("=== Registro de Estadísticas de Alumnos ===");

        //se repite 5 veces el bucle
        for (int i = 1; i <= 5; i++) {
            //se piden los datos
            System.out.println("Datos del Alumno #" + i + ":");

            //se pide edad
            System.out.print(" -> Edad: ");
            int age = keyboard.nextInt();

            //se pide altura
            System.out.print(" -> Estatura en metros: ");
            double height = keyboard.nextDouble();
            System.out.println(); // Salto de línea para separar

            //se acumulan datos para los promedios
            sumAges += age;
            sumHeights += height;

            // 2. Evaluamos si es mayor de 18 años
            if (age > 18) {
                adutls++;
            }

            // 3. Evaluamos si mide más de 1.75 metros
            if (height > 1.75) {
                tall++;
            }
        }

        //Calcular la media
        double mediumAge = (double) sumAges / 5;
        double mediumHeight = sumHeights / 5;

        //Mostrar los resultados
        System.out.println("==============================================");
        System.out.println("             RESULTADOS FINALES               ");
        System.out.println("==============================================");
        System.out.printf("• Edad media de los alumnos: %.2f años.%n", mediumAge);
        System.out.printf("• Altura media de los alumnos: %.2f metros.%n", mediumHeight);
        System.out.println("• Alumnos mayores de 18 años: " + adutls);
        System.out.println("• Alumnos que miden más de 1.75 m: " + tall);

        keyboard.close();
    }
}
