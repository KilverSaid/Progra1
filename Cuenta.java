public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("El monto a retirar excede el saldo de la cuenta");
        } else {
            saldo -= monto;
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
}
