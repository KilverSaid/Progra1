public class Patrones {
    public static void main(String[] args) {
        System.out.println("(a)");
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("(b)");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("(c)");
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("(d)");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
