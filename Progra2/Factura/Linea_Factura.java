public class Linea_Factura{
    int cantidad;
    double PrecioUnitario;

    public Linea_Factura(int cantidad, String producto, double PrecioUnitario){
        this.cantidad= cantidad;
        this.PrecioUnitario= PrecioUnitario;
    }
    
    public double getSubtotal(){
        return PrecioUnitario * cantidad;
    }
}