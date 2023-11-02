import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // Scanner for user input
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;

            while (true) {
                System.out.print("Enter a number (0 to exit): ");
                numero = scanner.nextInt();

                if (numero == 0) {
                    break;
                }

                boolean esPar = esPar(numero);

                if (esPar) {
                    System.out.println(numero + " is a par number.");
                } else {
                    System.out.println(numero + " is an odd number.");
                }
            }
        }
    }

    public static boolean esPar(int numero) {
        // Checks if the number is divisible by 2
        return numero % 2 == 0;
    }
}