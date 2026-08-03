package Factura;
public class pruebaFactura {
    public static void main(String[] args) {

    //crear factura
        Factura factura1 = new Factura("1", "Silla Ergonomica", 5, 12500.0);

    //dato inicial
        System.out.println("--- Datos de la Factura ---");
        System.out.println("Numero de pieza: " + factura1.getNumeroPieza());
        System.out.println("Descripcion: " + factura1.getDescripcion());
        System.out.println("Cantidad a comprar: " + factura1.getCantidad());
        System.out.println("Precio por articulo: $" + factura1.getPrecio());

    //clcular monto total
        System.out.println("Monto total de la factura: $" + factura1.obtenerMontoFactura());
        System.out.println();

    //validar con negativos
        System.out.println("--- Probando Validaciones ---");
        Factura factura2 = new Factura("2", "Escritorio", -3, -45000.0);

        System.out.println("Numero de pieza: " + factura2.getNumeroPieza());
        System.out.println("Descripcion: " + factura2.getDescripcion());
        System.out.println("Cantidad asignada: " + factura2.getCantidad());
        System.out.println("Precio asignado: $" + factura2.getPrecio());
        System.out.println("Monto total: $" + factura2.obtenerMontoFactura());
    }
}
