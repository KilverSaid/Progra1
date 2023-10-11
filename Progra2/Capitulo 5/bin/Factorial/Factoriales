public class Factoriales {
    public static void main(String[] args) {
        System.out.println("n\tFactorial");
        for (int n = 1; n <= 20; n++) {
            long factorial = calcularFactorial(n);
            System.out.println(n + "\t" + factorial);
        }
    }

    public static long calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
