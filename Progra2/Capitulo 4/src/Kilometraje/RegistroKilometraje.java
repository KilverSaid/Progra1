import java.util.Scanner;

public class RegistroKilometraje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometros;
        int litros;
        int totalKilometros = 0;
        int totalLitros = 0;

        System.out.println("Registro de Kilometraje");
        System.out.println("Introduzca los datos de cada viaje o -1 para salir.");

        while (true) {
            System.out.print("Kilómetros conducidos (-1 para salir): ");
            kilometros = scanner.nextInt();

            if (kilometros == -1) {
                break;
            }

            System.out.print("Litros usados: ");
            litros = scanner.nextInt();

            double kilometrosPorLitro = (double) kilometros / litros;
            System.out.printf("Kilómetros por litro en este viaje: %.2f%n", kilometrosPorLitro);

            totalKilometros += kilometros;
            totalLitros += litros;
            double promedioKilometrosPorLitro = (double) totalKilometros / totalLitros;
            System.out.printf("Promedio de kilómetros por litro hasta el momento: %.2f%n%n", promedioKilometrosPorLitro);
        }
        
        System.out.println("Gracias por usar el registro de kilometraje.");
    }
}
