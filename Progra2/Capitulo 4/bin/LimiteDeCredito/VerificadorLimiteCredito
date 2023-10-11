import java.util.Scanner;

public class VerificadorLimiteCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroCuenta;
        int saldoInicial;
        int cargos;
        int creditos;
        int limiteCredito;

        System.out.println("Verificador de Límite de Crédito");
        System.out.println("Ingrese los datos de cada cliente (o -1 para salir).");

        while (true) {
            System.out.print("Número de cuenta (-1 para salir): ");
            numeroCuenta = scanner.nextInt();

            if (numeroCuenta == -1) {
                break;
            }

            System.out.print("Saldo inicial: ");
            saldoInicial = scanner.nextInt();

            System.out.print("Total de cargos: ");
            cargos = scanner.nextInt();

            System.out.print("Total de créditos: ");
            creditos = scanner.nextInt();

            System.out.print("Límite de crédito permitido: ");
            limiteCredito = scanner.nextInt();

            int nuevoSaldo = saldoInicial + cargos - creditos;
            System.out.printf("Nuevo saldo para la cuenta %d: %d%n", numeroCuenta, nuevoSaldo);

            if (nuevoSaldo > limiteCredito) {
                System.out.println("Se excedió el límite de crédito.");
            }
        }

        System.out.println("Gracias por usar el verificador de límite de crédito.");
    }
}
