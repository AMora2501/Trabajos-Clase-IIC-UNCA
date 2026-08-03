package calculadora2;
public class Libreria {
    
    private String cadena;
    private double resultado;
    private double suma;
    private double resta;
    private double multiplicacion;
    private double division;
    
    public libreria(){
        cadena = "";
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
  
    }
    
    public void multiplicación(String cadena){
        this.resultado = Double.parseDouble(cadena)
            multiplicacion = true;
            this.cadena = "";
    }
    
    public void division(String cadena){
        this.resultado = Double.parseDouble(cadena)
            division = true;
            this.cadena = "";
    }
    
}
