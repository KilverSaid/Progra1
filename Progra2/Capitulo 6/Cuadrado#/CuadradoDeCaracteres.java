import java.util.Scanner;

public class CuadradoDeCaracteres {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese el tamaño del cuadrado: ");
            int lado = entrada.nextInt();

            System.out.print("Ingrese el carácter de relleno: ");
            char caracterRelleno = entrada.next().charAt(0);

            cuadradoDeCaracteres(lado, caracterRelleno);
        }
    }

    public static void cuadradoDeCaracteres(int lado, char caracterRelleno) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print(caracterRelleno);
            }
            System.out.println();
        }
    }
}

