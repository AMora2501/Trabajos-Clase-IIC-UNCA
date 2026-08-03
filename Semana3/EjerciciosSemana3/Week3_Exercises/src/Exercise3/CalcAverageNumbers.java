package Exercise3;
import java.util.Scanner;
public class CalcAverageNumbers {
    public static void main(String[] args) {
        
        //meter numero
        Scanner keyboard = new Scanner(System.in);
        
        //variables
        double num;          //numero
        double addition = 0; //Suma
        double counter = 0;  //Contador

        System.out.println("=== calculadora de media numerica ===");
        System.out.println("Introduzcae numeros positivos.\n Para terminar, introduzca un número negativo.");
        System.out.println("-------------------------------------------------------------------------");

        //Solicitar el primer número
        System.out.print("Introduzca un número: ");
        num = keyboard.nextDouble();

        
        //ejecutar bucle mientras sea positivo
        while (num >= 0) {
            addition += num;  //Acumula el número
            counter++;        //Incrementar contador en 1

            //pedir el siguiente número 
            System.out.print("Introduzca otro número: ");
            num = keyboard.nextInt();
        }


        //calcular media de números
        System.out.println("\n--- Resultado ---");
        if (counter > 0) {
            
            //Final y datos 
            double average = addition;
            System.out.println("Cantidad de números positivos: " + counter);
            System.out.println("Suma total: " + addition);
            System.out.println("La media de los números ingresados es: " + average);
            
            
        } else { //no hay positivos
            System.out.println("No se ingresó ningún número positivo para calcular la media.");
        }
    }
}