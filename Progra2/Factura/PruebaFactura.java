public class PruebaFactura {
    public static void main(String[] args) {
        Factura factura = new Factura("Cliente123", "2023-06-19");
        
        factura.agregarlineaFactura(3,"Producto 1",10.0);
        factura.agregarlineaFactura(2,"Producto 2",15.0);
        factura.agregarlineaFactura(1,"Producto 3",20.0);

        double Total= factura.getTotal();

        System.out.println("Factura para:"+ Factura.cliente);
        System.out.println("Fecha:"+ factura.fecha);
        for(Linea_Factura linea: factura.lineaFactura){
            System.out.println(linea.cantidad + "" + linea.producto+ "a$"+ linea.PrecioUnitario+ "c/u:$"+ linea.getSubtotal());
        }
        System.out.println("Total:$"+ Total);
    }
}