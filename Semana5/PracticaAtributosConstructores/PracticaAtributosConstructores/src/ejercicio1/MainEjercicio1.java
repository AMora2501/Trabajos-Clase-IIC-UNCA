package ejercicio1;
public class MainEjercicio1 {
    public static void main(String[] args) { 
 
        //Objetos solicitados con datos diferentes 
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, true);
        Libro libro2= new Libro("El Alquimista", "Paulo Coelho", 1988, false); 
        Libro libro3 = new Libro("Don Quijote", "Miguel de Cervantes", 1605, true);
        
        
        //Atributos de cada objeto 
        //Libro 1
        System.out.println("--- Libro 1 ---"); 
        System.out.println("Título: " + libro1.titulo); 
        System.out.println("Autor: " + libro1.autor); 
        System.out.println("Año de Publicación: " + libro1.anioPublicacion); 
        System.out.println("Disponible: " + libro1.disponible + "\n"); 
        
        //Libro 2
        System.out.println("--- Libro 2 ---"); 
        System.out.println("Título: " + libro2.titulo); 
        System.out.println("Autor: " + libro2.autor); 
        System.out.println("Año de Publicación: " + libro2.anioPublicacion); 
        System.out.println("Disponible: " + libro2.disponible + "\n"); 
        
        //Libro 3
        System.out.println("--- Libro 3 ---"); 
        System.out.println("Título: " + libro3.titulo); 
        System.out.println("Autor: " + libro3.autor); 
        System.out.println("Año de Publicación: " + libro3.anioPublicacion); 
        System.out.println("Disponible: " + libro3.disponible);
}
}