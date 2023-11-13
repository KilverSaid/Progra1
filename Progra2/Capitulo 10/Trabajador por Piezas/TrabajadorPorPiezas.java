public class TrabajadorPorPiezas extends Empleado {
    private double sueldoPorPieza;
    private int piezasProducidas;

    public TrabajadorPorPiezas(String nombre, double sueldoPorPieza, int piezasProducidas) {
        super(nombre);
        this.sueldoPorPieza = sueldoPorPieza;
        this.piezasProducidas = piezasProducidas;
    }

    @Override
    public double calcularIngresos() {
        return sueldoPorPieza * piezasProducidas;
    }

    @Override
    public String toString() {
        return super.toString() + " - Tipo: Trabajador por piezas";
    }
}
