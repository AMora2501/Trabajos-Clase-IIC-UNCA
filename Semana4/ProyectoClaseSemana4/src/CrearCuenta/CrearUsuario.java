package CrearCuenta;
import DatosCuenta.Cuenta;
import java.util.Scanner;
public class CrearUsuario {
    public static void main(String[] args) {
       Cuenta prueba = new Cuenta();
       
       prueba.UserID = "Ale";
       prueba.Password = 1234;
       prueba.Money = 5000;
       

       Scanner keyboard = new Scanner(System.in);
       
       System.out.println("Para ingresar a la cuenta ingrese un usuario");
       System.out.println("\n Ingrese Usuario: ");
       prueba = keyboard.next();

        
    }   
}
