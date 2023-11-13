public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] cuentasPorPagar = new PorPagar[5];
        cuentasPorPagar[0] = new Factura("123", "Descripción factura 1", 2, 10.5);
        cuentasPorPagar[1] = new Factura("456", "Descripción factura 2", 3, 7.8);
        cuentasPorPagar[2] = new EmpleadoAsalariado("Juan", "Perez", "111-11-1111", 800.0);
        cuentasPorPagar[3] = new EmpleadoPorHoras("María", "Gómez", "222-22-2222", 10, 15.0);
        cuentasPorPagar[4] = new EmpleadoPorComision("Pedro", "Ramirez", "333-33-3333", 5000.0, 0.1);

        // Imprimir montos de pago
        for (PorPagar cuenta : cuentasPorPagar) {
            System.out.println(cuenta);
            System.out.println("Monto de pago: $" + cuenta.obtenerMontoPago());
            System.out.println();
        }
    }
}
