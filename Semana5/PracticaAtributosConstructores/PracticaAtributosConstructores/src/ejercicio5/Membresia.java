package ejercicio5;
public class Membresia {
    
    String nombreCliente;
    String tipoPlan;
    int numeroMembresia;
    double mensualidad;
    boolean activa;
            
    public Membresia(String nombreCliente, String tipoPlan, int numeroMembresia, double mensualidad, boolean activa){
        this.nombreCliente = nombreCliente;
        this.numeroMembresia = numeroMembresia;
        this.tipoPlan = tipoPlan;
        this.mensualidad = mensualidad;
        this.activa = activa;
    
    }
            
    
}
