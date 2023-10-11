import java.util.Scanner;

public class BinarioADecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número binario: ");
        String numeroBinario = scanner.nextLine();

        int numeroDecimal = convertirBinarioADecimal(numeroBinario);

        System.out.println("El equivalente decimal es: " + numeroDecimal);
    }

    public static int convertirBinarioADecimal(String binario) {
        int numeroDecimal = 0;
        int longitud = binario.length();

        for (int i = 0; i < longitud; i++) {
            char digito = binario.charAt(i);
            int valor = Character.getNumericValue(digito);
            int potencia = longitud - i - 1;

            numeroDecimal += valor * Math.pow(2, potencia);
        }

        return numeroDecimal;
    }
}
