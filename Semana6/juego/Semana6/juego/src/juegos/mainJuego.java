package juegos;

import Personajes.Enemigo;
import Personajes.Heroes;
import java.util.Scanner;

public class mainJuego {

    public static void main(String[] args) {
        int OP;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del heroe: ");

        String nombre = entrada.nextLine();

        Heroes heroe1 = new Heroes(nombre, 2000, 50);
        do {
            System.out.println("-----------------------");
            System.out.println("     Batalla Campal    ");
            System.out.println("-----------------------");

            System.out.println("1. Ver estado del heroe");
            System.out.println("2. Pelear contra Vaati ");
            System.out.println("3. Pelear contra Ganondorf");
            System.out.println("0. Salir");
            System.out.println("Digite una opcion");
            OP = entrada.nextInt();

            switch (OP) {
                case 1:
                    System.out.println(heroe1.toString());
                    break;

                case 2:
                    Enemigo Vaati = new Enemigo("Vaati", 100, 30);
                    combatir(heroe1, Vaati);
                    break;

                case 3:
                    Enemigo Ganondorf = new Enemigo("Ganondorf", 100, 30);
                    combatir(heroe1, Ganondorf);
                    break;

                case 0:
                    System.out.println("Mi loco, dele pa' fuera");
                    break;

                default:
                    System.out.println("Opcion incorrecta, intente de nuevo");

            }
        } while (OP != 0);
    }

    public static void combatir(Heroes Link, Enemigo villano) {
        System.out.println("--- Batalla ---");
        System.out.println(Link.getNombre() + "VS" + villano.getNombre());

        int turno = 1;
        while (Link.estaVivo() && villano.estaVivo()) {

            //primer turno heroe
            villano.recibirDaño(Link.getAtaque());
            System.out.println("Turno: " + turno + " -Ataque: HP enemigo: "
                    + villano.getSalud());

            if (!villano.estaVivo()) {
                break;
            }

            //primer turno heroe
            Link.recibirDaño(villano.getDaño());
            System.out.println("Turno: " + turno + " -Contraataque: HP Heroe: "
                    + Link.getSalud());
            turno++;

            if (!Link.estaVivo()) {
                System.out.println("Ganaste");

            }else{
                System.out.println("Perdiste");

            }

        }
    }
}
