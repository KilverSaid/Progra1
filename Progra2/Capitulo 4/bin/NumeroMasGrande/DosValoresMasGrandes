import java.util.Scanner;

public class DosValoresMasGrandes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int mayor1 = Integer.MIN_VALUE;
        int mayor2 = Integer.MIN_VALUE;

        while (contador <= 10) {
            System.out.print("Introduzca un número entero: ");
            int numero = scanner.nextInt();

            if (numero > mayor1) {
                mayor2 = mayor1;
                mayor1 = numero;
            } else if (numero > mayor2) {
                mayor2 = numero;
            }

            contador++;
        }

        System.out.println("El primer número más grande es: " + mayor1);
        System.out.println("El segundo número más grande es: " + mayor2);
    }
}
