package cap2;
import java.util.Scanner; //Se usa para introducir el texto

class Cap2{
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    //Crea un objeto para que Scanner lea la entrada de texto
    Scanner input = new Scanner(System.in);

    //Escoger operador
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    //Introducir numeros
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}
