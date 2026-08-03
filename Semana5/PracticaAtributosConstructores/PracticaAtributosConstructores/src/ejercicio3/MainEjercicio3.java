package ejercicio3;
public class MainEjercicio3 {
    public static void main(String[] args) {
        
        //Datos Carros
        Vehiculo Carro1 = new Vehiculo("EIU-198", "TOYOTA", 2018, 2500000); //2 500 000
        Vehiculo Carro2 = new Vehiculo("ZSS", "BMW", 2015, 3500000);//3 500 000
        Vehiculo Carro3 = new Vehiculo("GTA-456", "MERCEDES-BENZ", 2026, 400000);//4 000 000
        
        //Atributos}
        //carro 1
        System.out.println("--- Vehiculos disponibles ---");
        System.out.println("Marca: " + Carro1.marca);
        System.out.println("Placa: " + Carro1.placa);
        System.out.println("Año de salida: " + Carro1.anio);
        System.out.println("Antiguedad: " + (2026 - Carro1.anio) + " anos");
        System.out.println("Precio: " + Carro1.precioVenta + "\n");
        
        //carro 2
        System.out.println("Marca: " + Carro2.marca);
        System.out.println("Placa: " + Carro2.placa);
        System.out.println("Año de salida: " + Carro2.anio);
        System.out.println("Antiguedad: " + (2026 - Carro2.anio) + " anos");
        System.out.println("Precio: " + Carro2.precioVenta + "\n");
        
        //carro 3
        System.out.println("Marca: " + Carro3.marca);
        System.out.println("Placa: " + Carro3.placa);
        System.out.println("Año de salida: " + Carro3.anio);
        System.out.println("Antiguedad: " + (2026 - Carro3.anio) + " anos");
        System.out.println("Precio: " + Carro3.precioVenta);                       
    }
}
