public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(1000.0);

        System.out.println("Saldo inicial: " + miCuenta.obtenerSaldo());

        miCuenta.depositar(500.0);
        System.out.println("Después de depositar 500.0: " + miCuenta.obtenerSaldo());

        miCuenta.retirar(200.0);
        System.out.println("Después de retirar 200.0: " + miCuenta.obtenerSaldo());

        miCuenta.retirar(1500.0); // Intentar retirar más de lo que hay en la cuenta
        System.out.println("Después de intentar retirar 1500.0: " + miCuenta.obtenerSaldo());
    }
}
