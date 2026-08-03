package Ex4;
import java.util.Scanner;
public class UniCareerSelector {
    
        public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Mostrar carreras
        System.out.println("SISTEMA DE ADMISIÓN UNIVERSITARIA ");
        System.out.println("1. Ingeniería");
        System.out.println("2. Psicología");
        System.out.println("3. Administración");
        System.out.print("Seleccione el número de la carrera: ");
        int OP = keyboard.nextInt();

        //Pedir el promedio del colegio
        System.out.print("Ingrese su promedio de secundaria: ");
        double average = keyboard.nextDouble();

        System.out.println("----------------------------------------");

        //Evaluar las carrera + promedio 
        switch (OP) {
            case 1: // Inge
                
                System.out.println("Carrera seleccionada: Ingeniería");
                if (average >= 85) {
                    System.out.println("Cumple con el requisito de ingreso.");
                    
                }else {
                    System.out.println("No cumple con el requisito para esta carrera (Mínimo 85).");
                    
                }
                break;

            case 2: // Psico
                System.out.println("Carrera seleccionada: Psicología");
                
                if (average >= 80) {
                    System.out.println("Cumple con el requisito de ingreso.");
                    
                }else {
                    System.out.println("No cumple con el requisito para esta carrera (Mínimo 80).");
                    
                }
                break;

            case 3: // Admin
                System.out.println("Carrera seleccionada: Administración");
                
                if (average >= 75) {
                    System.out.println("¡Felicidades! Cumple con el requisito de ingreso.");
                    
                }else {
                    System.out.println("No cumple con el requisito para esta carrera (Mínimo 75).");
                    
                }
                break;

            default: // Mostrar error
                System.out.println("Error: Opción de carrera no válida.");
                break;
                
        }//switch
    } //main
} // class

