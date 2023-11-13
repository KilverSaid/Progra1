
public class SistemaNomina {
    public static void main(String[] args) {
       
        Empleado[] empleados = new Empleado[5];

        for (Empleado empleado : empleados) {
            double pagoNomina = empleado.calcularNomina(); 

            if (esMesCumpleanos(empleado)) {
                pagoNomina += 100.00;
            }

            System.out.println("Pago de nómina para " + empleado.getNombre() + ": $" + pagoNomina);
        }
    }

    private static boolean esMesCumpleanos(Empleado empleado) {
        int mesActual = obtenerMesActual(); 
        return empleado.obtenerMesCumpleanos() == mesActual;
    }

    private static int obtenerMesActual() {
        
        return 0; 
    }
}
