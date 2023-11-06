class EmpleadoPorHoras extends Empleado {
    private double horas;
    private double sueldo;

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldo, double horas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        establecerSueldo(sueldo);
        establecerHoras(horas);
    }

    public void establecerSueldo(double sueldo) {
        if (sueldo >= 0) {
            this.sueldo = sueldo;
        } else {
            throw new IllegalArgumentException("El sueldo por hora debe ser mayor o igual a 0.");
        }
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerHoras(double horas) {
        if (horas >= 0 && horas <= 168) {
            this.horas = horas;
        } else {
            throw new IllegalArgumentException("Las horas trabajadas deben estar entre 0 y 168.");
        }
    }

    public double obtenerHoras() {
        return horas;
    }

    public double ingresos() {
        if (horas <= 40) {
            return sueldo * horas;
        } else {
            return 40 * sueldo + (horas - 40) * sueldo * 1.5;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nSueldo por hora: " + sueldo + "\nHoras trabajadas: " + horas;
    }
}
