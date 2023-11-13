public class FiguraTridimensional extends Figura {
    private double radio;

    public FiguraTridimensional(double radio) {
        this.radio = radio;
    }

    public double obtenerArea() {
        return 4 * Math.PI * radio * radio;
    }

    public double obtenerVolumen() {
        return (4.0 / 3.0) * Math.PI * radio * radio * radio;
    }

    @Override
    public String obtenerDescripcion() {
        return "Figura tridimensional con radio: " + radio;
    }
}
