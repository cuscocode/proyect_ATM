package modelo;

import javax.swing.JOptionPane;

public class Retiro extends Transaccion {

    private int monto;
    private DispensadorEfectivo dispensadorEfectivo;
    private final static int CANCELO = 6;

    public Retiro(int numeroCuentaUsuario, BaseDatosBanco baseDatosBancoATM, int monto, DispensadorEfectivo dispensadorEfectivoATM) {
        super(numeroCuentaUsuario, baseDatosBancoATM);
        dispensadorEfectivo = dispensadorEfectivoATM;
        this.monto = monto;
    }

    @Override
    public String ejecutar() {
        boolean efectivoDispensado = false;
        double saldoDisponible;

        BaseDatosBanco baseDatosBanco = obtenerBaseDatosBanco();
        String Mensaje = "";

        if (monto != CANCELO) {
            saldoDisponible = baseDatosBanco.obtenerSaldoDisponible(obtenerNumeroCuenta());

            if (monto <= saldoDisponible) {
                if (dispensadorEfectivo.haySuficienteEfectivoDisponible(monto)) {
                    baseDatosBanco.cargar(obtenerNumeroCuenta(), monto);
                    dispensadorEfectivo.dispensarEfectivo(monto);
                    efectivoDispensado = true;
                    Mensaje = "Se dispenso su efectivo. Tomelo ahora.";
                } else {
                    Mensaje = "No hay suficiente efectivo disponible en el ATM.\n\nSeleccione un monto menor.";
                }
            } else {
                Mensaje = "No hay suficientes fondos en su cuenta.\n\nSeleccione un monto menor.";
            }
        } else {
            Mensaje = "Cancelando transaccion..";
        }
        /*do {
           
        } while (!efectivoDispensado);
         */
        return Mensaje;
    }

}
