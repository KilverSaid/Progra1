public class InteresCompuesto {
    public static void main(String[] args) {
        double monto;
        double principal = 1000.0;

        System.out.printf("%s%20s%n", "Tasa de Interés", "Monto Final");

        for (int tasa = 5; tasa <= 10; tasa++) {
            double tasaPorcentaje = tasa / 100.0;

            System.out.printf("%d%s", tasa, "%");
            for (int anio = 1; anio <= 10; anio++) {
                monto = principal * Math.pow(1.0 + tasaPorcentaje, anio);
                System.out.printf("%20.2f%n", monto);
            }
        }
    }
}
