package ejercicio4;
public class MainEjercicio4 {
    public static void main(String[] args) {
        
        //NT: Revisar bien si esto eran los atributos
        Pelicula pelicula1 = new Pelicula("Interstelar", "Sci-fi", 169, 8.7);
        Pelicula pelicula2 = new Pelicula("Akira", "Anime", 124, 8.0);
        Pelicula pelicula3 = new Pelicula("Space Jam", "Humor", 131, 6.7);
        
        //Mostrar en pantalla
        System.out.println("-- Catalogo de Peliculas ---");
        
        //Peli1
        System.out.println("Pelicula: " + pelicula1.titulo);
        System.out.println("Generos: " + pelicula1.genero);
        System.out.println("Duracion: " + (pelicula1.duracionMinutos / 60) + " horas y "
                + (pelicula1.duracionMinutos % 60 ) + " minutos");
        
        System.out.println("Calificacion: " + pelicula1.calificacion + "\n");
        
        //Peli1
        System.out.println("Pelicula: " + pelicula2.titulo);
        System.out.println("Generos: " + pelicula2.genero);
        System.out.println("Duracion: " + (pelicula2.duracionMinutos / 60) + " horas y " 
                + (pelicula2.duracionMinutos % 60 )+ " minutos");
        
        System.out.println("Calificacion: " + pelicula2.calificacion + "\n");
        
        //Peli1
        System.out.println("Pelicula: " + pelicula3.titulo);
        System.out.println("Generos: " + pelicula3.genero);
        System.out.println("Duracion: " + (pelicula3.duracionMinutos / 60) + " horas y " 
                + (pelicula3.duracionMinutos % 60 )+ " minutos");
        
        System.out.println("Calificacion: " + pelicula3.calificacion);
        
    }
}
