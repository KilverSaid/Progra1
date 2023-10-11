import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoInicial;

        System.out.print("Ingrese el saldo inicial: ");
        saldoInicial = scanner.nextDouble();
        Cuenta miCuenta = new Cuenta(saldoInicial);

        boolean continuar = true;

        do {
            System.out.println("Saldo actual: " + miCuenta.obtenerSaldo());
            System.out.print("Ingrese la operación a realizar (1 para depositar, 2 para retirar, 0 para salir): ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el monto a depositar: ");
                double montoDeposito = scanner.nextDouble();
                miCuenta.depositar(montoDeposito);
            } else if (opcion == 2) {
                System.out.print("Ingrese el monto a retirar: ");
                double montoRetiro = scanner.nextDouble();
                miCuenta.retirar(montoRetiro);
            } else if (opcion == 0) {
                continuar = false;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (continuar);

        scanner.close();
    }
}
