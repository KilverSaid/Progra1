import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el nombre del cliente: ");
            String cliente = scanner.nextLine();
            System.out.print("Ingrese la fecha: ");
            String fecha = scanner.nextLine();
            
            LineaFactura[] lineasFactura = new LineaFactura[3];
            
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
                String producto = scanner.nextLine();
                System.out.print("Ingrese la cantidad de " + producto + ": ");
                int cantidad = Integer.parseInt(scanner.nextLine());
                System.out.print("Ingrese el precio unitario de " + producto + ": ");
                double precioUnitario = Double.parseDouble(scanner.nextLine());
                lineasFactura[i] = new LineaFactura(cantidad, producto, precioUnitario);
            }
            
            Factura factura = new Factura(cliente, fecha, lineasFactura);
            
            System.out.println("Factura para: " + factura.getCliente());
            System.out.println("Fecha: " + factura.getFecha());
            System.out.println("Detalles de la factura:");
            
            for (int i = 0; i < lineasFactura.length; i++) {
                LineaFactura linea = lineasFactura[i];
                System.out.println("Producto: " + linea.getProducto());
                System.out.println("Cantidad: " + linea.getCantidad());
                System.out.println("Precio Unitario: $" + linea.getPrecioUnitario());
                System.out.println("Subtotal: $" + linea.getSubTotal());
                System.out.println("--------------------");
            }
            
            System.out.println("Total: $" + factura.getSubTotal());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
