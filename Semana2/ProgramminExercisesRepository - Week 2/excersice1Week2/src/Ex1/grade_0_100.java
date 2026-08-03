package Ex1;
import java.util.Scanner;
public class grade_0_100 {

    public static void main (String[] args){
        
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.print("Por favor, ingrese una nota (0 a 100): ");
        int Note = Keyboard.nextInt();
        
        
        //salida de notas
        //Repobro
        if (Note < 60){
            System.out.println("Reprobado");
            
        //Aprobo con 60 o mas    
        }else if (Note >= 79){
            System.out.println("Aprobado");
       
        //Aprobo con 80 o mas
        }else if (Note >= 89){
            System.out.println("Muy Bien");
            
        //Aprobo con 90 o mas
        //Se hizo en la ultima linea para ahorar código
        }else{
            System.out.println("Excelente");
        }    
    }    
}