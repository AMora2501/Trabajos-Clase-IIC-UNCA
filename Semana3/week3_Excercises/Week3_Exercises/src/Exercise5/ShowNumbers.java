package Exercise5;
import java.util.Scanner;
public class ShowNumbers {
    public static void main(String[] args) {
        
        //lamar escaner y se define una variable
        Scanner keyboard = new Scanner(System.in);
        int num;

        System.out.println("=== Calculadora Factorial ===");
        
        //Solicitar el número asegurándo no ser negativo + bucle
        do {
            System.out.print("Introduce un número entero no negativo: ");
            num = keyboard.nextInt();
            
            //mostrar aviso
            if (num < 0) {
                System.out.println("El número debe ser mayor o igual a 0.\n");
            }
            
        } while (num < 0); //el bucle es para que se repita si pone algo que no sirve

        //se usa long ya que los factoriales crecen rapido
        long factorial = 1; 

        //se multiplica desde el número ingresado hasta llegar al 1
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }

        // Mostramos el resultado
        System.out.println("---------------------------------");
        System.out.println("El factorial de " + num + " (" + num + "!) es: " + factorial);
    }
}
