public class Empleado<Fecha> {

    private Fecha fechaNacimiento;

    public Empleado(String nombre, Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public int obtenerMesCumpleanos() {
        return fechaNacimiento.obtenerMes();
    }
}
