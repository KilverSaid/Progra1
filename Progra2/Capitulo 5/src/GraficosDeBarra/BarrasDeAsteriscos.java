import java.util.Scanner;

public class BarrasDeAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número entre 1 y 30: ");
            int numero = scanner.nextInt();

            if (numero >= 1 && numero <= 30) {
                numeros[i] = numero;
            } else {
                System.out.println("Número no válido. Intente de nuevo.");
                i--; // Restar 1 al índice para repetir la entrada
            }
        }

        System.out.println("Barras de asteriscos:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
