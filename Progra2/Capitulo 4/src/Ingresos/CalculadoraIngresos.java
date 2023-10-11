import java.util.Scanner;

public class CalculadoraIngresos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioBase = 200.0;
        double tasaComision = 0.09;
        double totalVentas = 0.0;

        System.out.println("Calculadora de Ingresos de Vendedor");
        System.out.println("Ingrese el valor de cada artículo vendido por el vendedor (o -1 para terminar):");

        while (true) {
            System.out.print("Valor del artículo (-1 para terminar): ");
            double valorArticulo = scanner.nextDouble();

            if (valorArticulo == -1) {
                break;
            }

            totalVentas += valorArticulo;
        }

        double ingresos = salarioBase + (totalVentas * tasaComision);

        System.out.printf("Los ingresos del vendedor son: $%.2f%n", ingresos);
    }
}
