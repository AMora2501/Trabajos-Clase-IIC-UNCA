package exercise3;
import java.util.Scanner;
public class Exercise3 {

    public static void main(String[] args) {

        //Entrada con el texto
        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese el tiempo de despegue");
        int number = entry.nextInt();
        System.out.println("---------------------------");

        //variable de while
        int counter = number;

        while (counter > 0) {
            System.out.println(counter);
            counter--;

        }
        

        System.out.println("Digite el tiempo de explosion");

        int amount = entry.nextInt();
//agregar do
    }
}
