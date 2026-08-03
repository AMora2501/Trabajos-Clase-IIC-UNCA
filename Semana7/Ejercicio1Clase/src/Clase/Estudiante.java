package Clase;
public class Estudiante extends Persona{
    
    //Atributo
    String materiasRecibir;
    String Seccion;
    int anoEstudiante;
    
    //contructor
    public Estudiante(String nombre, String cedula, int edad) {
        super(nombre, cedula, edad);
        this.materiasRecibir = materiasRecibir;
        this.Seccion = Seccion;
        this.anoEstudiante = anoEstudiante;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public int getAnoEstudiante() {
        return anoEstudiante;
    }

    public void setAnoEstudiante(int anoEstudiante) {
        this.anoEstudiante = anoEstudiante;
    }

    public String getMateriasRecibir() {
        return materiasRecibir;
    }

    public void setMateriasRecibir(String materiasRecibir) {
        this.materiasRecibir = materiasRecibir;
    }
}
