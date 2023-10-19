package Boletos;

public class PruebaBoletos {
    public static void main(String[] args) {
        BoletoCine boleto = BoletoCine.generarBoleto();
        boleto.imprimirBoleto();
    }
}
