package Ex2;
import java.util.Scanner;
public class telephoneCalc {
    public static void main (String[] args){
        
        //Objeto de entrada
        Scanner keybord = new Scanner(System.in);
        
    
        //ingresar dia y tiempo
        System.out.println("Ingrese el dia de la semana (Con mayusculas al inicio)");
        String day = keybord.nextLine();
        
        System.out.print("Ingrese el tiempo hablado: ");
        int minutes = keybord.nextInt();
        
        int PxM = 0; //PxM = Price per Minute
        boolean validDay = true;
           
        
        switch (day) {
            
            //Día entre semana
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
                PxM = 50;
                break;

            //Fines de semana
            case "Sabado":
            case "Sábado":
                PxM = 30;
                break;
                
            case "Domingo":
                PxM = 20;
                break;
                
            default:
                validDay = false;
                break;
                
        }//Switch 
        
        if (validDay){
            int TotalAmount = minutes * PxM;
            System.out.println("El monto total a pagar es: $" + TotalAmount);
            
        } else {
            System.out.println("Error: El dia ingresado no es valido.");
        }
        
    }//main
}//public class
