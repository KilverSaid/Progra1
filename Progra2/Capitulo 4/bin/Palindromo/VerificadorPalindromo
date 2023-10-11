import java.util.Scanner;

public class VerificadorPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Ingrese un número de cinco dígitos: ");
            numero = scanner.nextInt();

            if (numero < 10000 || numero > 99999) {
                System.out.println("El número no tiene cinco dígitos. Por favor, inténtelo de nuevo.");
            }
        } while (numero < 10000 || numero > 99999);

        if (esPalindromo(numero)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }

    public static boolean esPalindromo(int numero) {
        String numeroStr = String.valueOf(numero);
        String numeroReverso = new StringBuilder(numeroStr).reverse().toString();

        return numeroStr.equals(numeroReverso);
    }
}
