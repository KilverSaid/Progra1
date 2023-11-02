package Multiplo;

import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num1, num2;

            while (true) {
                System.out.print("Ingrese el primer número (0 para salir): ");
                num1 = scanner.nextInt();

                if (num1 == 0) {
                    break;
                }

                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextInt();

                boolean esMultiplo = esMultiplo(num1, num2);

                if (esMultiplo) {
                    System.out.println(num2 + " es múltiplo de " + num1);
                } else {
                    System.out.println(num2 + " no es múltiplo de " + num1);
                }
            }
        }
    }

    public static boolean esMultiplo(int num1, int num2) {
        if (num1 == 0) {
            // Evitar división por cero
            return false;
        }

        return num2 % num1 == 0;
    }
}
