package Excerise1;
import java.util.Scanner;
public class NegativeOrPositive {

    public static void main (String[] args){
        
        //entrada para el numero + variable
        Scanner keyboard = new Scanner(System.in);
        int number;

        System.out.println("--- Evaluador de Números ---");

        do {
            System.out.print("Introduzca un número entero: ");
            number = keyboard.nextInt();

            //Verificar si positivo o negativo
            //positivo
            if (number > 0) {
                System.out.println("El número " + number + " es positivo.\n");
                
            //negativo
            } else if (number < 0) {
                System.out.println("El número " + number + " es negativo.\n");
                
            }
            
        //bucle para repetir
        } while (number != 0);
        
        //salir
        System.out.println("Hasta luego");
    }
}
