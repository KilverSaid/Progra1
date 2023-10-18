public class Linea_Factura{
    int cantidad;
    double PrecioUnitario;
    public int producto;

    public Linea_Factura(int cantidad, String producto, double precioUnitario2){
        this.cantidad= cantidad;
        this.PrecioUnitario= precioUnitario2;
    }
    
    public Linea_Factura(int cantidad2, String producto, double[] precioUnitario2) {
    }

    public double getSubtotal(){
        return PrecioUnitario * cantidad;
    }
}