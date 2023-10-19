package Boletos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class BoletoCine {
    private String pelicula;
    private String fecha;
    private int sala;
    private String horaFuncion;
    private int numeroFila;
    private int numeroAsiento;

    public BoletoCine(String pelicula, String fecha, int sala, String horaFuncion, int numeroFila, int numeroAsiento) {
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.sala = sala;
        this.horaFuncion = horaFuncion;
        this.numeroFila = numeroFila;
        this.numeroAsiento = numeroAsiento;
    }

    public void imprimirBoleto() {
        System.out.println("----- Boleto de Cine -----");
        System.out.println("Película: " + pelicula);
        System.out.println("Fecha: " + fecha);
        System.out.println("Sala: " + sala);
        System.out.println("Hora de la función: " + horaFuncion);
        System.out.println("Fila: " + numeroFila);
        System.out.println("Asiento: " + numeroAsiento);
    }

    public static BoletoCine generarBoleto() {
        String pelicula = "Batman";
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActual = dateFormat.format(new Date());
        
        Random random = new Random();
        int sala = random.nextInt(2) + 1;
        String horaFuncion = "15:00 p.m.";
        int numeroFila = random.nextInt(20) + 1;
        int numeroAsiento = random.nextInt(30) + 1;

        return new BoletoCine(pelicula, fechaActual, sala, horaFuncion, numeroFila, numeroAsiento);
    }
}
