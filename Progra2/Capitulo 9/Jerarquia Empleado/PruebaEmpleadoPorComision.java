public class PruebaEmpleadoPorComision {
    public static void main(String[] args) {
        EmpleadoPorComision empleado = new EmpleadoPorComision("Juan", "Perez", "123-45-6789", 10000, 0.1);

        System.out.println("Información del empleado por comisión:");
        System.out.println(empleado.toString());
        System.out.println("Ganancias: $" + empleado.calcularGanancias());
    }
}
