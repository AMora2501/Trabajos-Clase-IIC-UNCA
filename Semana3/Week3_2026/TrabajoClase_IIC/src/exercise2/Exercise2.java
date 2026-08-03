package exercise2;
import java.util.Scanner;
public class Exercise2 {
    //Mains methods
    public static void main(String[] args) {
        
        //Ciclo mientras / while
        int counter = 6;
        
        while (counter <= 5){
            System.out.println(counter);
            counter += 1;
        }
        
        do{
            System.out.println(counter);
            counter += 1;
        } while(counter <= 5);
             
        //Entrada con el texto
        Scanner entry = new Scanner(System.in);
        int number = entry.nextInt();
        
        
    }
}
