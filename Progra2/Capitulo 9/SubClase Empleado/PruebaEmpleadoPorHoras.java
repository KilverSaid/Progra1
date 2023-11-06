public class PruebaEmpleadoPorHoras {
    public static void main(String[] args) {
        EmpleadoPorHoras empleado = new EmpleadoPorHoras("Juan", "Perez", "123-45-6789", 10.0, 45.5);

        System.out.println("Información del empleado por horas:");
        System.out.println(empleado.toString());
        System.out.println("Ingresos: $" + empleado.ingresos());
    }
}
