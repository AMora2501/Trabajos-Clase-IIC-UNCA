package ejercicio5;
public class MainEjercicio5 {
    public static void main(String[] args) {
        
         Membresia cliente1 = new Membresia("Juan Carlos Bodoque", "Basico", 3131, 10000, false); //10 000
         Membresia cliente2 = new Membresia("Bakki Hanma", "Basico", 2501, 30000, true); //30 000
         Membresia cliente3 = new Membresia("Arnold Schwarzenegger", "VIP", 1947, 150000, true);//150 000
         
         //Mostrar en pantalla
         System.out.println("-- Usuarios del Gimnasio ---");
        
        //Usuario1
        System.out.println("Nombre: " + cliente1.nombreCliente);
        System.out.println("Plan: " + cliente1.tipoPlan);
        System.out.println("ID de Membresia: " + cliente1.numeroMembresia);
        System.out.println("Mensualidad: " + cliente1.mensualidad);
        
        //NT: Decidi usar if por si la condicion de true o false cambia, se actualize "sola"
        //Para que no sea todo el codigo puro print
        if (cliente1.activa == true){
            System.out.println("La membresia esta activa \n");
        
        }else{
            System.out.println("La membresia no esta activa \n");
        
        }
            
        //Usuario2
        System.out.println("Nombre: " + cliente2.nombreCliente);
        System.out.println("Plan: " + cliente2.tipoPlan);
        System.out.println("ID de Membresia: " + cliente2.numeroMembresia);
        System.out.println("Mensualidad: " + cliente2.mensualidad);
        
        if (cliente2.activa == true){
            System.out.println("La membresia esta activa \n");
            
        }else{
            System.out.println("La membresia no esta activa \n");
            
        }
            
        //usaurio3
        System.out.println("Nombre: " + cliente3.nombreCliente);
        System.out.println("Plan: " + cliente3.tipoPlan);
        System.out.println("ID de Membresia: " + cliente3.numeroMembresia);
        System.out.println("Mensualidad: " + cliente3.mensualidad); 
        
        if (cliente1.activa == true){
            System.out.println("La membresia esta activa \n");
            
        }else{
            System.out.println("La membresia no esta activa \n");
            
        }
    }
}
