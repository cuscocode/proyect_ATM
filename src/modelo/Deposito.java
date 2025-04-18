package modelo;

public class Deposito extends Transaccion {

    private double monto;
    private RanuraDeposito ranuraDeposito;
    private final static int CANCELO = 0;

    public Deposito(int numeroCuentaUsuario, BaseDatosBanco baseDatosBancoATM, int monto, RanuraDeposito ranuraDepositoATM) {
        super(numeroCuentaUsuario, baseDatosBancoATM);
        this.monto = monto;
        ranuraDeposito = ranuraDepositoATM;
    }

    @Override
    public String ejecutar() {
        BaseDatosBanco baseDatosBanco = obtenerBaseDatosBanco();
        String respuesta = "";

        boolean seRecibioSobre = ranuraDeposito.seRecibioSobre();

        if (seRecibioSobre) {
            respuesta = "\nSe recibió su sobre de depósito.\nNOTA: El dinero que acaba de depositar no estará disponible sino hasta que verifiquemos el monto del efectivo y cualquier cheque incluido.";
            baseDatosBanco.abonar(obtenerNumeroCuenta(), monto);
        } else {
            respuesta = "\nNo insertó un sobre de depósito, por lo que el ATM ha cancelado su transacción.";
        }

        return respuesta;
    }

}
