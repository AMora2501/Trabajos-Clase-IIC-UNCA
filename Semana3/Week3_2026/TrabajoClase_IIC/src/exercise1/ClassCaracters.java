package exercise1;
public class ClassCaracters {
    
    //methods
    public static void main(String[] args) {
        
        //tipos de datos primitivos
        int number = 12;
        double age = 18;
        boolean state = true;
        
        //no primitivo
        String name = "Alejandro";
        String correo = "alejandro@gmail.es";
        
     /* convierte la variable en un string y se puede llamar indefinidiamente a los metodos de string*/   
        System.out.println(name.length(/*se le puede definir una variable*/));
        
        System.out.println("la letra esta en la posicion " + name.indexOf("o")); //indexOff devuelve la posición de lo que pide
        //isEmpty necesita tener 0 para estar vacio
        if (!name.isEmpty()){ // ! Es negacion
            System.out.println("El nombre si hay nombre");
            
        }else {
            System.out.println("no hay un nombre ");
        }
        //isBlank si esta vacio o hay espacios maraca que esta vacio
                if (name.isBlank()){ // ! Es negacion
            System.out.println("Esta vacio");
            
        }else {
            System.out.println("Hay un nombre ");
        }
                
                
        //equals = compara la informacion que quiero, si es igual o no, da true solo si es igual o si ignora mayusculas
        System.out.println(name.equalsIgnoreCase("aLejANdrO"));
        
        System.out.println(correo.contains("@"));//contains verifica que tenga algo
        System.out.println(name.toUpperCase()); //toUpperCase pone todo mayuscula
        System.out.println(name.toUpperCase());
       
        System.out.println(name.trim());//trim quita los espacios en blanco al final de un texto
        
       
       String example = "Texto";
       String example2 = "texto ";
       
       
       System.out.println(example.equals(example2.trim()));
       System.out.println(example.equals(example2));
       
       //Estructuras iterativas
       
       
       
       
       
       
    }
}
