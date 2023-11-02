package Circulo;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();
            System.out.println("El área del círculo es: " + circuloArea(radio));
        }

    }

    public static double circuloArea(double radio) {

        return Math.PI * Math.pow(radio, 2);

    }
}