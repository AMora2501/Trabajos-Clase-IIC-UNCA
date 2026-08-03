package Views;
import Model.Auto;
public class Start {
    public static void main(String[] args) {
        
        //crear nuestro primer objeto
        //nombreDeLaClase nombre objeto = new nombreDeLaClase
        Auto Car1 = new Auto();
        Auto Car2 = new Auto();
        
       /*
        Auto Car3 = new Auto();
        Auto Car4 = new Auto();
        Auto Car5 = new Auto();
        Auto Car6 = new Auto();
        Auto Car7 = new Auto();
        Auto car8 = new Auto();
        */
        
        //El punto (.) es un mensaje (va a buscar lo que tiene el modelo adentro)
        Car1.model = "Supra";
        Car1.brand = "Toyota";
        
        Car2.model = "Eclipse";
        Car2.brand = "Mitsubishi";
    }
}
