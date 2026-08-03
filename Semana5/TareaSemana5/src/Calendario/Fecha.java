package Calendario;
public class Fecha {
    
    //variables
    private int mes;
    private int dia;
    private int año;

    //constructor
    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.año = anio;
    }

    //metodo
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return año;
    }

    public void setAnio(int anio) {
        this.año = anio;
    }

    //metodo para la fecha separada
    public void mostrarFecha() {
        System.out.printf("%d/%d/%d%n", this.mes, this.dia, this.año);
    }
}
