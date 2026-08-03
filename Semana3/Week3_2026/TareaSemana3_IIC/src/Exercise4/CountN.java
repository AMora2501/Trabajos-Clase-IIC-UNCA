package Exercise4;
import java.util.Scanner;
public class CountN {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num; 

        System.out.println("=== Contador ===");
        
        //validamos si es un número positivo
        do {
            System.out.print("Introduzca un número entero positivo: ");
            num = keyboard.nextInt();
            
            if (num <= 0) {
                System.out.println("El número debe ser mayor que 0.\n");
            }
            
        } while (num <= 0); //repetir hasta que sea positivo

        //mostrar hasta cuanto va a contar
        System.out.println("\nContando desde 1 hasta " + num + ":");
        System.out.println("---------------------------------");

        //Bucle para llegar hasta el numero dicho y avanza de 1 en 1
        for (int i = 1; i <= num; i++) {
            
            //Imprimir el número seguido de un espacio para que salgan en línea
            System.out.print(i + " ");
            
        }
        
        //apenas termina de contar
        System.out.println("\n---------------------------------");
        System.out.println("¡Conteo finalizado!");
    }
}
