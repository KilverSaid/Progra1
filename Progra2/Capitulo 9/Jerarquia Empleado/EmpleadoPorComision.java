class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public double calcularGanancias() {
        return ventasBrutas * tarifaComision;
    }

    public String toString() {
        return super.toString() + "\nVentas Brutas: " + ventasBrutas + "\nTarifa de Comisión: " + tarifaComision;
    }
}
