package Encargado;
public class Principal {
    public static void main(String[] args) {

        //crear objetos
        Encargado empleado1 = new Encargado("Juan", "Perez", 450000.0);
        Encargado empleado2 = new Encargado("Maria", "Alvarado", 600000.0);

        //mostrar salario anual
        System.out.println("--- Salario Anual Inicial ---");

        //salario juan
        System.out.printf("%s %s - Salario Anual: $%.2f%n",
                empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.getSalarioAnual());

        //salario maria
        System.out.printf("%s %s - Salario Anual: $%.2f%n",
                empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.getSalarioAnual());

        //aumento
        empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.10);
        empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.10);

        //salario anual luego de aumento
        System.out.println("--- Salario Anuel con 10& de Aumento ---");

        //salario juan 2
        System.out.printf("%s %s - Nuevo Salario Anual: $%.2f%n",
                empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.getSalarioAnual());

        //salario maria 2
        System.out.printf("%s %s - Nuevo Salario Anual: $%.2f%n",
                empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.getSalarioAnual());

    }
}
