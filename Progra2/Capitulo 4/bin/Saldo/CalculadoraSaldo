import java.util.Scanner;

public class CalculadoraSueldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int empleado = 1; empleado <= 3; empleado++) {
            System.out.println("Ingrese los datos del empleado " + empleado + ":");
            System.out.print("Horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            System.out.print("Tarifa por hora: ");
            double tarifaPorHora = scanner.nextDouble();

            double sueldoBruto = calcularSueldoBruto(horasTrabajadas, tarifaPorHora);
            System.out.println("Sueldo bruto del empleado " + empleado + ": $" + sueldoBruto);
        }
    }

    public static double calcularSueldoBruto(int horasTrabajadas, double tarifaPorHora) {
        double sueldoBruto;
        if (horasTrabajadas <= 40) {
            sueldoBruto = horasTrabajadas * tarifaPorHora;
        } else {
            sueldoBruto = 40 * tarifaPorHora + (horasTrabajadas - 40) * (tarifaPorHora * 1.5);
        }
        return sueldoBruto;
    }
}
