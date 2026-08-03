package Exercise2;
import java.util.Scanner;
public class Guessing_Game {
    public static void main(String[] args) {
        
        //scanner para meter el numero a adivinar
        Scanner keyboard = new Scanner(System.in);
        
        //variables
        int SNumber; //Secret number / numero secreto
        int attemp; //variable de intentos

        System.out.println("=== Adivinar numero ===");
        
        //La "J" es para referirme al jugador, mas que nada lo puse en costumbre a los juegos de pelea
        //el J1 pone el número a adivinar
        System.out.print("Jugador 1, introduce el número secreto: ");
        SNumber = keyboard.nextInt();
        
        //"Limpiar pantalla" (no lo limpia solo mete lineas en blanco para que no se vea el numero
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }

        //Aviso para el J2 
        System.out.println("El número ha sido ocultado.");
        System.out.println("Turno del Jugador 2");
        System.out.println("-------------------------------------");

        //meter respuestas
        do {
            System.out.print("Introduzca su intento: ");
            attemp = keyboard.nextInt();

            if (attemp < SNumber) {
                System.out.println("El número secreto es MAYOR que " + attemp + ". Vuelve a intentarlo \n");
            } else if (attemp > SNumber) {
                System.out.println("El número secreto es MENOR que " + attemp + ". Vuelve a intentarlo \n");
            } else {
                System.out.println("Has acertado, el número secreto era: " + SNumber);
            }

            //Repetir mientas no gane
        } while (attemp != SNumber);
    }
}
