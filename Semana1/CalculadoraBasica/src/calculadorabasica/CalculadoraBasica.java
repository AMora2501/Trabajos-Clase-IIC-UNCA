package calculadorabasica; //Si
import java.util.Scanner; //Read input

public class CalculadoraBasica {
    public static void main(String[] args) {

        char operator;
        Double Num1, Num2, result;
        

        //Crea un objeto para que Scanner lea la entrada de texto
        Scanner input = new Scanner(System.in);
        
        //Introducir numero 1
        System.out.println("Enter first number \n");
            Num1 = input.nextDouble();
        
        //Escoger operador
        System.out.println("Choose an operator: +, -, *, or / \n");
            operator = input.next().charAt(0);
        
        //Introducir numero 2
        System.out.println("Enter second number \n");
            Num2 = input.nextDouble();

    switch (operator) {

      //Add | Summar
      case '+':
        result = Num1 + Num2;
            System.out.println(Num1 + " + " + Num2 + " = " + result);
        break;

      //Subtrac | Restar
      case '-':
        result = Num1 - Num2;
            System.out.println(Num1 + " - " + Num2 + " = " + result);
        break;

      //Multiply | Multiplicar
      case '*':
        result = Num1 * Num2;
            System.out.println(Num1 + " * " + Num2 + " = " + result);
        break;

      //Split | Dividir
      case '/':
        result = Num1 / Num2;
            System.out.println(Num1 + " / " + Num2 + " = " + result);
        break;
        
        //Show Syntax Error | Mostrar error 
      default:
            System.out.println("Syntax Error");
        break;
        
    } //End Switch | Fin del switch

    input.close();
  } //End Static void 
} //End public class
