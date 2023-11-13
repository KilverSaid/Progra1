public class SistemaNomina {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new TrabajadorPorPiezas("Juan", 2.5, 200);
        empleados[1] = new TrabajadorPorPiezas("Maria", 3.0, 150);
        empleados[2] = new TrabajadorPorPiezas("Pedro", 2.0, 250);

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
            System.out.println("Ingresos: $" + empleado.calcularIngresos());
            System.out.println();
        }
    }
}
