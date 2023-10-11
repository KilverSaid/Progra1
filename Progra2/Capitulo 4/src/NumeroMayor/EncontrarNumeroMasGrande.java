import java.util.Scanner;

public class EncontrarNumeroMasGrande {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int mayor = Integer.MIN_VALUE;

        while (contador <= 10) {
            System.out.print("Introduzca un número entero: ");
            int numero = scanner.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }

            contador++;
        }

        System.out.println("El número más grande es: " + mayor);
    }
}
