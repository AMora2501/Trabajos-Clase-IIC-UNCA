package GitPK;
import java.util.Scanner;
public class Exercise1 {
    public static void main (String[] args){
        
        
      //Variables  
        int num = 12; //numeros enteros
        double weigth = 180.5; //numeros con decimales
        boolean state = true;
        char letter = 'h'; //un solo dato
        long largeNumber = 1323213213L; //numeros grandes + 2M
        String name = "Alejandro"; //Cadena de caracteres
        
        //Mostrar
        System.out.println(num++);
        System.out.println(num);
        
        int a = 3;
        int b = 2;
        int c = 1;
        
        a += b; //a = a = a + b 
        c = ++c;
        
        //Cumplir condicion
        
        
        if (num > 18){
        
        }
        
        
        double Note = 85;
        if (Note >= 70){
            System.out.println("La persona aprobo");
            
        }else {
            System.out.println("La persona reprobo");
        }
        
        //Condicional de 3 notas o mas
        if (Note > 90){
            System.out.println("Nota Exelente");
            
            
        }else if (Note > 70){
            System.out.println("Aprobo Bien");
       
        }else if (Note > 60){
            System.out.println("Reprobo pero puede hacer ampliación");
            
        }else{
            System.out.println("Reprobo");
        }
        
        
        //mas de una opcion
        System.out.println("1. ingresa");
        System.out.println("2. modificar");
        System.out.println("3. imprimir");
        System.out.println("4. salir");
        String OP;
        
        //Objeto de entrada
        Scanner keybord = new Scanner(System.in);
        OP = keybord.nextLine();
        
        switch (OP) {
            
        //Opcion 1
            case "1":
                System.out.println("El usuario esta ingresando");
                
        //Opcion 2
            case "2":
                System.out.println("El usario esta haciendo cambios");
                
        //Opcion 3
            case "3":
                System.out.println("El usario esta imprimiendo");
                
        //Opcion 4
            case "4":
                System.out.println("El usario esta saliendo");
                
                break; //"Quebrar programa
                
        //Salida de error
            default:
                System.out.println("Dato incorrecto");        }
    }
}
