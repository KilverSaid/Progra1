import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int principal = 100000; // Principal inicial en centavos ($1000.00)
        int tasaPorcentaje = 5; // Tasa de interés anual (5%)
        int monto;
        
        System.out.println("Año\tDólares\tCentavos");
        
        for (int anio = 1; anio <= 10; anio++) {
            monto = principal * (100 + tasaPorcentaje) / 100;
            
            int dolares = monto / 100;
            int centavos = monto % 100;
            
            System.out.println(anio + "\t$" + dolares + "." + centavos);
            
            principal = monto;
        }
    }
}
