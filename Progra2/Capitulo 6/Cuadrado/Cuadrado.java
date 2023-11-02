package Cuadrado;

import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce el tamaño del cuadrado:");
            int lado = scanner.nextInt();
            cuadradoDeAsteriscos(lado);
        }
    }

    public static void cuadradoDeAsteriscos(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}