public class FiguraBidimensional extends Figura {
    private double lado;

    public FiguraBidimensional(double lado) {
        this.lado = lado;
    }

    public double obtenerArea() {
        return lado * lado;
    }

    @Override
    public String obtenerDescripcion() {
        return "Figura bidimensional con lado: " + lado;
    }
}
