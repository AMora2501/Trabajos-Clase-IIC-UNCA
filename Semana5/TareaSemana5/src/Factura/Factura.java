package Factura;

public class Factura {

    //Atributos
    String numeroPieza;
    String descripcion;
    int cantidad;
    double precio;

    //Constructor
    public Factura(String numeroPieza, String descripcion, int cantidad, double precio) {
        this.numeroPieza = numeroPieza;
        this.descripcion = descripcion;

        if (cantidad >= 0 && precio >= 0) {
            this.cantidad = cantidad;
            this.precio = precio;

        } else {
            this.cantidad = 0;
            this.precio = 0;

        }
    }

    //Metodos
    //imprimir datos de pieza #1
    public void piezaUno() {
        System.out.println("Numero de Pieza: ");
        System.out.println("Descripcion de Pieza: " + this.descripcion);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad: " + this.cantidad);

    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    //validar que no sea negativo
    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public double getPrecio() {
        return precio;
    }

    //validar que no sea negativo 2
    public void setPrecio(double precio) {
        if (precio > 0.0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    //monto factura
    public double obtenerMontoFactura() {
        return this.cantidad * this.precio;
    }

}
