package Ex3;
import java.util.Scanner;
public class accessValidSystem {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //credenciales
        String user = "admin"; //variable del usuario y credencial del mismo
        String password = "admin123"; //variable de la contraseña y la misma


        //pedir datos 
        System.out.print("Ingrese su usuario: ");
        String ingressUser = keyboard.next(); //variable que define el usuario

        System.out.print("Ingrese su contraseña: ");
        String ingressPass = keyboard.next(); //variable que define el usuario

        //validar datos
        if (ingressUser.equals(user) && ingressPass.equals(password)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        
    }//main
}    //Public class
