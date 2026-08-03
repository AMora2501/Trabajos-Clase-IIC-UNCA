package Encargado;
public class Encargado {

    //variables
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    //constructor
    public Encargado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;

        //ver si el salario es positivo, si no, es 0
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
            
        } else {
            this.salarioMensual = 0.0;
            
        }
    }

    //Métodos
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    //establecer que el salario sea mayor que 0
    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    //calcular salario anual
    public double getSalarioAnual() {
        return this.salarioMensual * 12;
    }
}
