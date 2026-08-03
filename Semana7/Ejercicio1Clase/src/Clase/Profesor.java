package Clase;
public class Profesor extends Persona{
   
    String materiaPorImpartir;

    public String getMateriaPorImpartir() {
        return materiaPorImpartir;
    }

    public void setMateriaPorImpartir(String materiaPorImpartir) {
        this.materiaPorImpartir = materiaPorImpartir;
    }
    
    public Profesor(String nombre, String cedula, int edad) {
        super(nombre, cedula, edad);
        this.materiaPorImpartir = materiaPorImpartir;
    }
    
}
