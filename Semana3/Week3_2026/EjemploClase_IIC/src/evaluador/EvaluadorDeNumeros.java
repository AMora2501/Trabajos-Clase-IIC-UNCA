/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluador;

import java.util.Scanner;

public class EvaluadorDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        
        //entrada para el numero + variable
        Scanner keyboard = new Scanner(String.class.cast(System.in));
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
