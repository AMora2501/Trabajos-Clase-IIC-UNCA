package ejercicio2;
public class Empleado {
    
    //Variables
    String nombre;
    String cedula;
    String puesto;
    
    double salarioMensual;
    
    //Constructor
     public Empleado(String nombre, String cedula, String puesto, double salarioMensual){ 
        this.nombre = nombre; 
        this.cedula = cedula;
        this.puesto = puesto; 
        this.salarioMensual = salarioMensual;
    }
}