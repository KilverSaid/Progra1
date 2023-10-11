import java.util.Scanner;

public class VentaMinorista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalVentas = 0.0;

        while (true) {
            System.out.print("Ingrese el número de producto (1-5) o -1 para salir: ");
            int numeroProducto = scanner.nextInt();

            if (numeroProducto == -1) {
                break; // Salir del ciclo si se ingresa -1
            }

            if (numeroProducto < 1 || numeroProducto > 5) {
                System.out.println("Número de producto no válido.");
                continue; // Saltar a la siguiente iteración del ciclo
            }

            System.out.print("Ingrese la cantidad vendida: ");
            int cantidadVendida = scanner.nextInt();

            double precioVenta = 0.0;

            switch (numeroProducto) {
                case 1:
                    precioVenta = 2.98;
                    break;
                case 2:
                    precioVenta = 4.50;
                    break;
                case 3:
                    precioVenta = 9.98;
                    break;
                case 4:
                    precioVenta = 4.49;
                    break;
                case 5:
                    precioVenta = 6.87;
                    break;
                default:
                    break;
            }

            totalVentas += precioVenta * cantidadVendida;
        }

        System.out.printf("El valor total de venta es: $%.2f%n", totalVentas);
    }
}
