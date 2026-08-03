package Exercise7;
import java.util.Scanner;
public class salesRecord {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //variables
        int tSales = 0; //Ventas totales
        double accumulatedAmount = 0.0; //monto acumulado
        int higherSales = 0; //ventas mayores
        double saleAmount; //monto venta

        System.out.println("=== Registro de Ventas ===");
        System.out.println("Introduzca los montos de las ventas. \n Digite 0 para finalizar.");
        System.out.println("-----------------------------------------------------------");

        //solicitar la primera venta
        System.out.print("Ingrese el monto de la venta: $");
        saleAmount = keyboard.nextDouble();

        //El bucle se ejecuta mientras no se digite 0
        while (saleAmount != 0) {
            
            //Validar que el monto no sea negativo
            if (saleAmount < 0) {
                System.out.println("El monto de la venta no puede ser negativo.\n");
                
            } else {
                
                // Si el monto es válido se procesan los datos
                accumulatedAmount += saleAmount;
                tSales++;

                //verificr si la venta superó los 50.000
                if (saleAmount > 50000) {
                    higherSales++;
                }
                
                System.out.println("-> Venta registrada con exito.\n");
            }

            //solicitar la siguiente venta
            System.out.print("Ingrese el monto de la siguiente venta: $");
            saleAmount = keyboard.nextDouble();
        }

        //mostrar los resultados finales
        System.out.println("\n==============================================");
        System.out.println("               Ciere de Caja                 ");
        System.out.println("==============================================");
        System.out.println("Numero total de ventas realizadas: " + tSales);
        System.out.printf("Monto total acumulado: " + accumulatedAmount);

        //calcular promedio solo si hubo al menos una venta
        if (tSales > 0) {
            double averageAmount = accumulatedAmount / tSales;
            System.out.printf("\n Monto promedio de las ventas: ", averageAmount);
            
        //por si no se vendio nada    
        } else {
            System.out.println("\nMonto promedio de las ventas: $0.00 (No hubo ventas)");
            
        }
        
        //por si supero los 50k
        System.out.println("\nVentas que superaron los $50.000: " + higherSales);
        System.out.println("==============================================");

    }
}
