package Calendario;
public class pruebaFecha {
    public static void main(String[] args) {

        //crear objeto
        Fecha fechaCalendario = new Fecha(6, 22, 2026);
        
        System.out.print("La fecha actual asignada es: ");
        fechaCalendario.mostrarFecha();

        System.out.println("\n--- Modificando los valores con los metodos establecer ---");

        //cambiar valores de manera independiente
        fechaCalendario.setMes(12);
        fechaCalendario.setDia(25);
        fechaCalendario.setAnio(2027);

        //comprobar nueva fecha
        System.out.println("Nuevo mes obtenido: " + fechaCalendario.getMes());
        System.out.print("La fecha final actualizada es: ");
        fechaCalendario.mostrarFecha();
    }
}
