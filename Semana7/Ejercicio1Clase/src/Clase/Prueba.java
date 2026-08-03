package Clase;
public class Prueba {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ale", "1111", 30);
        Profesor profesor1 = new Profesor("asdsa", "1111", 30);
        
        System.out.println(estudiante1.getNombre());
        System.out.println(profesor1.getNombre());
    }
}
