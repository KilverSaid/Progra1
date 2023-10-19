package Boletos;

import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BoletoCine {
    public static void main(String[] args) {
        // Datos fijos
        String pelicula = "Batman";
        String horaFuncion = "15:00 p.m.";
        
        // Generar la fecha actual
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActual = dateFormat.format(new Date());
        
        // Generar la sala de forma aleatoria (1 o 2)
        Random random = new Random();
        int sala = random.nextInt(2) + 1;
        
        // Generar el número de fila aleatorio (del 1 al 20)
        int numeroFila = random.nextInt(20) + 1;
        
        // Generar el número de asiento aleatorio (del 1 al 30)
        int numeroAsiento = random.nextInt(30) + 1;
        
        // Imprimir el boleto
        System.out.println("----- Boleto de Cine -----");
        System.out.println("Película: " + pelicula);
        System.out.println("Fecha: " + fechaActual);
        System.out.println("Sala: " + sala);
        System.out.println("Hora de la función: " + horaFuncion);
        System.out.println("Fila: " + numeroFila);
        System.out.println("Asiento: " + numeroAsiento);
    }
}
