public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("John Doe", 1000.0);
        Cuenta cuenta2 = new Cuenta("Jane Smith", -50.0);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        System.out.println("Ingrese la cantidad a depositar en cuenta1: ");
        double montoDeposito = 200.0;
        cuenta1.depositar(montoDeposito);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        System.out.println("Ingrese la cantidad a depositar en cuenta2: ");
        montoDeposito = 500.0;
        cuenta2.depositar(montoDeposito);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
    }

    public static void mostrarCuenta(Cuenta cuentaAMostrar) {
        System.out.printf("Nombre: %s%nSaldo: %.2f%n%n", cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerSaldo());
    }
}
