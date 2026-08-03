package ejercicio1;
public class Libro {
    
    //Variables
    String titulo;
    String autor;
    
    int anioPublicacion;
    
    boolean disponible;
    
    //Constructor
     public Libro(String titulo, String autor, int anioPublicacion, boolean disponible){ 
        this.titulo = titulo; 
        this.autor = autor; 
        
        this.anioPublicacion = anioPublicacion; 
        this.disponible = disponible;
    }
}
