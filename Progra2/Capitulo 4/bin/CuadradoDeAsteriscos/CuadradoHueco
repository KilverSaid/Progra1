import java.util.Scanner;

public class CuadradoHueco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado;

        do {
            System.out.print("Ingrese el tamaño del lado del cuadrado (1-20): ");
            lado = scanner.nextInt();
        } while (lado < 1 || lado > 20);

        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                if (i == 1 || i == lado || j == 1 || j == lado) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
