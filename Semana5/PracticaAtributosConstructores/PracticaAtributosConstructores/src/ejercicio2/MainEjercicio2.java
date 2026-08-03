package ejercicio2;
public class MainEjercicio2 {
    public static void main(String[] args) { 
        
     //Objetos solicitados con datos diferentes 
        Empleado empleado1 = new Empleado("Alejandro Mora Barboza", "1-1111-1111", "Gerente de Area", 750000);
        Empleado empleado2 = new Empleado("Fabricio Mora Barboza", "1-2222-2222", "Jefe de Piso", 600000);
     
        //Atributos
        System.out.println("--- Empleado 1 ---"); 
        System.out.println("Nombre: " + empleado1.nombre); 
        System.out.println("Cedula: " + empleado1.cedula); 
        System.out.println("Puesto: " + empleado1.puesto); 
        System.out.println("Salario: " + empleado1.salarioMensual + "\n"); 
        
        System.out.println("--- Empleado 2 ---"); 
        System.out.println("Nombre: " + empleado2.nombre); 
        System.out.println("Cedula: " + empleado2.cedula); 
        System.out.println("Puesto: " + empleado2.puesto); 
        System.out.println("Salario: " + empleado2.salarioMensual); 

    }
}
