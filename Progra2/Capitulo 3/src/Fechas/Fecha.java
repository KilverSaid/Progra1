public class Fecha {
    private int mes;
    private int dia;
    private int año;

    public Fecha(int mes, int dia, int año) {
        establecerMes(mes);
        establecerDia(dia);
        establecerAño(año);
    }

    public void establecerMes(int mes) {
        this.mes = (mes >= 1 && mes <= 12) ? mes : 1;
    }

    public int obtenerMes() {
        return mes;
    }

    public void establecerDia(int dia) {
        this.dia = (dia >= 1 && dia <= 31) ? dia : 1;
    }

    public int obtenerDia() {
        return dia;
    }

    public void establecerAño(int año) {
        this.año = (año >= 1900 && año <= 2100) ? año : 1900;
    }

    public int obtenerAño() {
        return año;
    }

    public void mostrarFecha() {
        System.out.println(obtenerMes() + "/" + obtenerDia() + "/" + obtenerAño());
    }
}

