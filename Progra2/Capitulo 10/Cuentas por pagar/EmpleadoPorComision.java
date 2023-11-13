public class EmpleadoPorComision extends Empleado implements PorPagar {

    @Override
    public double obtenerMontoPago() {
        return obtenerVentasBrutas() * obtenerTarifaComision();
    }
}
