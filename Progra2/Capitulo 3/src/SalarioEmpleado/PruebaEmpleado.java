public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("John", "Doe", 5000.0);
        Empleado empleado2 = new Empleado("Jane", "Smith", 6000.0);

        // Mostrar el salario anual de cada empleado
        System.out.println("Salario anual de " + empleado1.obtenerPrimerNombre() + " " + empleado1.obtenerApellidoPaterno() + ": $" + empleado1.obtenerSalarioAnual());
        System.out.println("Salario anual de " + empleado2.obtenerPrimerNombre() + " " + empleado2.obtenerApellidoPaterno() + ": $" + empleado2.obtenerSalarioAnual());

        // Dar un aumento del 10% a cada empleado
        empleado1.darAumento(10.0);
        empleado2.darAumento(10.0);

        // Mostrar el salario anual actualizado de cada empleado
        System.out.println("\nSalario anual después del aumento del 10%:");
        System.out.println("Salario anual de " + empleado1.obtenerPrimerNombre() + " " + empleado1.obtenerApellidoPaterno() + ": $" + empleado1.obtenerSalarioAnual());
        System.out.println("Salario anual de " + empleado2.obtenerPrimerNombre() + " " + empleado2.obtenerApellidoPaterno() + ": $" + empleado2.obtenerSalarioAnual());
    }
}
