package Model;
public class CuentaBancaria {

    //Atributos
    public String cliente;
    public String IBAN;
    public double saldo;

    //Constructor
    public CuentaBancaria(String IBAN, String cliente, double saldo) {
        this.IBAN = IBAN;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    //Sobrecarga
    public CuentaBancaria(String IBAN, double saldo) {
        this.IBAN = IBAN;
        this.saldo = saldo;
    }

    //Metodos
    
    //imprimir datos de usuario
    public void imprimirDatos() {
        System.out.println("Bienvenido");
        System.out.println("Banco Central");
        System.out.println("Cliente:" + this.cliente);
        System.out.println("Cuenta: " + this.IBAN);
        System.out.println("Saldo: " + this.saldo + "\n");

    }
    
    public void imprimirDatos(double saldoAnterior, double movimiento) {
        System.out.println("Bienvenido");
        System.out.println("Banco Central");
        System.out.println("Cliente:" + this.cliente);
        System.out.println("Cuenta: " + this.IBAN);
        System.out.println("Saldo anterior " + saldoAnterior);
        System.out.println("Movimiento " + movimiento);
        System.out.println("Saldo: " + this.saldo + "\n");

    }
        //Retornar Numero de Cuenta
        public String getNumeroCuenta() {
            return this.IBAN;

        }

        //Retornar Saldo en cuenta
        public double getSaldo() {
            return this.saldo;

        }

        //Mostrar cliente / titular
        public String titular() {
            return this.cliente;

        }
    
    
    //Depositar plata
    public void depositar(double montoDeposito) {
        //Depositar monto
        if (montoDeposito > 0 && montoDeposito < 5000000) {
            double saldoAnterior = saldo;
            saldo = saldo + montoDeposito;
            imprimirDatos(saldoAnterior, montoDeposito);

        } else { //Mostrar Error de TRansaccion
            System.err.println("Error, Transaccion no realizada");

        }
    }

    //Sacar plata
    public void sacarMonto(double montoRetiro) {
        //Depositar monto
        if (montoRetiro < saldo) {
            double saldoAnterior = saldo;
            saldo = saldo - montoRetiro;
            imprimirDatos(saldoAnterior, montoRetiro);

        } else { //Mostrar Error de TRansaccion
            System.err.println("Monto insuficiente");

        }
    }


}
