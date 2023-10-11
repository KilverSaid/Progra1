import java.util.Scanner;

public class EncontrarMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de valores a comparar: ");
        int cantidadValores = scanner.nextInt();

        if (cantidadValores <= 0) {
            System.out.println("La cantidad de valores debe ser mayor que cero.");
            return;
        }

        System.out.print("Ingrese el primer valor: ");
        int menor = scanner.nextInt();

        for (int i = 1; i < cantidadValores; i++) {
            System.out.print("Ingrese el siguiente valor: ");
            int valor = scanner.nextInt();

            if (valor < menor) {
                menor = valor;
            }
        }

        System.out.println("El menor valor es: " + menor);
    }
}
