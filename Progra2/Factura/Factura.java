import java.util.ArrayList;

public class Factura{
    public static final String cliente = null;
    private ArrayList<Linea_Factura> lineasFactura;
    public String fecha;
    public Linea_Factura[] lineaFactura;
    public Factura(String cliente, String fecha) {
        new ArrayList<Linea_Factura>();
    }

    public void agregarlineaFactura(int cantidad, String producto, double d){
        Linea_Factura linea= new Linea_Factura(cantidad, producto, d);
        lineasFactura.add(linea);
    }

    public double getTotal(){
        Double Total= 0.0;
        for(Linea_Factura linea: lineasFactura){
            Total += linea.getSubtotal();
        }
        return Total;
    }

    public void agregarlineaFactura(int cantidad, String producto, double d) {
    }
}



