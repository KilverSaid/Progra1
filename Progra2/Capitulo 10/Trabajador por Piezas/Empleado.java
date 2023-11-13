public class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularIngresos() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre;
    }
}
