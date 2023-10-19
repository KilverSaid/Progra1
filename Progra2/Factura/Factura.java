public class Factura {
    private String cliente;
    private String fecha;
    private LineaFactura[] lineasFactura;

    public Factura(String cliente, String fecha, LineaFactura[] lineasFactura) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.lineasFactura = lineasFactura;
    }

    public double getSubTotal() {
        double total = 0.0;
        for (LineaFactura linea : lineasFactura) {
            total += linea.getSubTotal();
        }
        return total;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public LineaFactura[] getLineasFactura() {
        return lineasFactura;
    }
}
