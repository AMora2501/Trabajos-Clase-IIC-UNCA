package Vista;
import Model.CuentaBancaria;
public class Inicio {
    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria("CR1111111111111111", "Alejandro", 2000.0);
        //CuentaBancaria c2 = new CuentaBancaria("CR1111111111111111", 2000.0);

        /*
        System.out.println("Nombre del usario: " + c1.cliente);
        System.out.println("Numero de cuenta: " + c1.IBAN);
        System.out.println("Saldo: " + c1.saldo);
        */

       //Cliente 1       
        c1.depositar(2000);
        c1.sacarMonto(3000);
        String numerocuenta = c1.getNumeroCuenta();
        System.out.println("El valor retornado es: " + numerocuenta);

        //Cliente 2
        /*c2.depositar(2000);
        c2.sacarMonto(4000); 
        System.out.println("El valor retornado es: " + numerocuenta);
        */
    }
}
