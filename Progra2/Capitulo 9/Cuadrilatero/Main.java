public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(1, 0);
        Punto punto3 = new Punto(1, 1);
        Punto punto4 = new Punto(0, 1);

        Trapezoide trapezoide = new Trapezoide(punto1, punto2, punto3, punto4, 2, 3, 4);
        Paralelogramo paralelogramo = new Paralelogramo(punto1, punto2, punto3, punto4, 3, 4);
        Rectangulo rectangulo = new Rectangulo(punto1, punto2, punto3, punto4, 4, 5);
        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3, punto4, 5);

        System.out.println("Área del trapezoide: " + trapezoide.calcularArea());
        System.out.println("Área del paralelogramo: " + paralelogramo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}
