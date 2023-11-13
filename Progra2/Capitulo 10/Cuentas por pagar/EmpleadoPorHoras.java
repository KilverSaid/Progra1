public class EmpleadoPorHoras extends Empleado implements PorPagar {
    
    @Override
    public double obtenerMontoPago() {
        return obtenerHoras() * obtenerTarifa();
    }

    private int obtenerHoras() {
        return 0;
    }

    private int obtenerTarifa() {
        return 0;
    }
}
