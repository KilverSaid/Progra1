public class PruebaFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new FiguraBidimensional(5.0);
        figuras[1] = new FiguraTridimensional(3.0);
        figuras[2] = new FiguraBidimensional(8.0);

        for (Figura figura : figuras) {
            System.out.println(figura.obtenerDescripcion());

            if (figura instanceof FiguraBidimensional) {
                FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura;
                System.out.println("Área: " + figuraBidimensional.obtenerArea());
            } else if (figura instanceof FiguraTridimensional) {
                FiguraTridimensional figuraTridimensional = (FiguraTridimensional) figura;
                System.out.println("Área: " + figuraTridimensional.obtenerArea());
                System.out.println("Volumen: " + figuraTridimensional.obtenerVolumen());
            }
        }
    }
}
