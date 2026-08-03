package Personajes;

public class Heroes {

    //Var
    String nombre;
    int vida;
    int ataque;

    //Constructor
    public Heroes(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public Heroes() {
        this.nombre = "Heroe generico";
        this.vida = -100;
        this.ataque = 10;
    }

    public Heroes(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.ataque = 32;
    }

    //metodos
    //nivel de encapsulamiento - tipo de metodo - nombre de metodo
    public boolean estaVivo() {
        //boolean vivo = vida > 0;
        //return ;
        return this.vida > 0;
    }

    public void recibirDaño(int daño) {
        System.out.println("-----------------------");
        vida = vida = daño;
//      vida -= daño;

        if (vida < 0) {
            vida = 0;
        }
    }

    public void curarVida(int curacion) {
        System.out.println("+++++++++++++++++++++++");
        vida += curacion;

        if (vida > 100) {
            vida = 100;
        }

        System.out.println(nombre + "recupera salud y tiene ahora: " + vida);
    }

    @Override
    public String toString() {
        String retorno = "Nombre: " + nombre + "\nVida ♥: " + vida + "\nAtaque ⚔: " + ataque;
        return retorno;

    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getSalud(){
        return vida;
    }
    
    
    public int getAtaque(){
        return ataque;
    }
    
}
