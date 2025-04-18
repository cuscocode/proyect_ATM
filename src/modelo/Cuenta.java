package modelo;
public class Cuenta {
    private int numeroCuenta;
    private int nip;
    private double saldoDisponible;
    private double saldoTotal;

    public Cuenta(int elNumeroDeCuenta, int elNIP, double elSaldoDisponible, double elSaldoTotal) {
        numeroCuenta = elNumeroDeCuenta;
        nip = elNIP;
        saldoDisponible = elSaldoDisponible;
        saldoTotal = elSaldoTotal;
    }

    public boolean validarNIP(int nipUsuario) {
        return nipUsuario == nip;
    }
    


    public double obtenerSaldoDisponible() {
        return saldoDisponible;
    }

    public double obtenerSaldoTotal() {
        return saldoTotal;
    }

    public void abonar(double monto) {
        saldoTotal += monto;
    }

    public void cargar(double monto) {
        saldoDisponible -= monto;
        saldoTotal -= monto;
    }

    public int obtenerNumeroCuenta() {
        return numeroCuenta;
    }
}
