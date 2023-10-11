public class Factura {
    private String numeroDePieza;
    private String descripcionDePieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroDePieza, String descripcionDePieza, int cantidad, double precioPorArticulo) {
        this.numeroDePieza = numeroDePieza;
        this.descripcionDePieza = descripcionDePieza;
        establecerCantidad(cantidad);
        establecerPrecioPorArticulo(precioPorArticulo);
    }

    public void establecerNumeroDePieza(String numeroDePieza) {
        this.numeroDePieza = numeroDePieza;
    }

    public String obtenerNumeroDePieza() {
        return numeroDePieza;
    }

    public void establecerDescripcionDePieza(String descripcionDePieza) {
        this.descripcionDePieza = descripcionDePieza;
    }

    public String obtenerDescripcionDePieza() {
        return descripcionDePieza;
    }

    public void establecerCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo > 0.0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }

    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }
}


