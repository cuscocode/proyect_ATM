package modelo;

public class SolicitudSaldo extends Transaccion {

    public SolicitudSaldo(int numeroCuentaUsuario, BaseDatosBanco baseDatosBanco) {
        super(numeroCuentaUsuario, baseDatosBanco);
    }

    @Override
    public String ejecutar() {
        BaseDatosBanco baseDatosBanco = obtenerBaseDatosBanco();

        double saldoDisponible = baseDatosBanco.obtenerSaldoDisponible(obtenerNumeroCuenta());
        double saldoTotal = baseDatosBanco.obtenerSaldoTotal(obtenerNumeroCuenta());

        return "Saldo Disponible:" + saldoDisponible + "\n"
                + "Saldo Total:" + saldoTotal;
    }
}
