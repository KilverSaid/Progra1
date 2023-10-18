import java.util.ArrayList;

public class Factura{
    private ArrayList<Linea_Factura> lineasFactura;

    public Factura(String cliente, string fecha) {
        this.lineaFactura=new ArrayList<Linea_Factura>();
    }

    public void agregarLineaFactura(int cantidad, String producto, double PrecioUnitario[]){
        Linea_Factura linea= new Linea_Factura(cantidad, producto, PrecioUnitario);
        lineasFactura.add(linea);
    }

    public double getTotal(){
        Doble Total= 0.0;
        for(Linea_Factura linea: lineaFacturas){
            Total += linea.getSubtotal();
        }
        return Total;
    }
}



