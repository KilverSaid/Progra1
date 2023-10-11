public class PruebaFactura {
    public static void main(String[] args) {
        Factura factura1 = new Factura("12345", "Tuerca", 10, 1.5);
        Factura factura2 = new Factura("67890", "Perno", -5, -2.0); // Caso con valores negativos

        System.out.println("Factura 1:");
        System.out.println("Número de Pieza: " + factura1.obtenerNumeroDePieza());
        System.out.println("Descripción de Pieza: " + factura1.obtenerDescripcionDePieza());
        System.out.println("Cantidad: " + factura1.obtenerCantidad());
        System.out.println("Precio por Artículo: " + factura1.obtenerPrecioPorArticulo());
        System.out.println("Monto de la Factura: " + factura1.obtenerMontoFactura());

        System.out.println("\nFactura 2:");
        System.out.println("Número de Pieza: " + factura2.obtenerNumeroDePieza());
        System.out.println("Descripción de Pieza: " + factura2.obtenerDescripcionDePieza());
        System.out.println("Cantidad: " + factura2.obtenerCantidad());
        System.out.println("Precio por Artículo: " + factura2.obtenerPrecioPorArticulo());
        System.out.println("Monto de la Factura: " + factura2.obtenerMontoFactura());
    }
}