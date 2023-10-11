public class PruebaFecha {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(10, 15, 2023);
        Fecha fecha2 = new Fecha(2, 29, 2020); // Ejemplo de fecha en año bisiesto

        System.out.print("Fecha 1: ");
        fecha1.mostrarFecha();

        System.out.print("Fecha 2: ");
        fecha2.mostrarFecha();
    }
}
