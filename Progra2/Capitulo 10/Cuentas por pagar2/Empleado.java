public class Empleado implements PorPagar {
    private String primerNombre;
    private String apellidoPaterno;

    public Empleado(String primerNombre, String apellidoPaterno) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
    }

    // Otros métodos de la clase Empleado...

    // Implementar el método de la interfaz PorPagar
    @Override
    public double obtenerMontoPago() {
        return ingresos(); // Llamada al método ingresos de la clase Empleado
    }

    @Override
    public String toString() {
        return String.format("%s %s - Tipo: %s", primerNombre, apellidoPaterno, getClass().getSimpleName());
    }

    // Método ingresos original que debe ser implementado por las subclases
    public double ingresos() {
        // Lógica para calcular ingresos (debe ser implementado por las subclases)
        return 0.0;
    }
}
