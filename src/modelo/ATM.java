package modelo;

public class ATM {

    private boolean usuarioAutenticado;
    private int numeroCuentaActual;
    private DispensadorEfectivo dispensadorEfectivo;
    private RanuraDeposito ranuraDeposito;
    private BaseDatosBanco baseDatosBanco;

    private static final int SOLICITUD_SALDO = 1;
    private static final int RETIRO = 2;
    private static final int DEPOSITO = 3;
    private static final int SALIR = 4;

    public ATM() {
        this.usuarioAutenticado = false;
        this.numeroCuentaActual = 0;
        this.dispensadorEfectivo = new DispensadorEfectivo();
        this.ranuraDeposito = new RanuraDeposito();
        this.baseDatosBanco = new BaseDatosBanco();
    }

    public ATM(int cuenta) {
        this.usuarioAutenticado = false;
        this.numeroCuentaActual = cuenta;
        this.dispensadorEfectivo = new DispensadorEfectivo();
        this.ranuraDeposito = new RanuraDeposito();
        this.baseDatosBanco = new BaseDatosBanco();
    }

    public void setCuenta(int cuenta) {
        this.numeroCuentaActual = cuenta;
    }

    public boolean autenticarUsuario(int cuenta, int nip) {
        usuarioAutenticado = baseDatosBanco.autenticarUsuario(cuenta, nip);
        return usuarioAutenticado;
    }

    public String crearTransaccion(int tipo, int valor) {
        Transaccion temp = null;
        
        switch (tipo) {
            case SOLICITUD_SALDO:
                temp = new SolicitudSaldo(numeroCuentaActual, baseDatosBanco);
                break;
            case RETIRO:
                temp = new Retiro(numeroCuentaActual, baseDatosBanco, valor, dispensadorEfectivo);
                break;
            case DEPOSITO:
                temp = new Deposito(numeroCuentaActual, baseDatosBanco, valor, ranuraDeposito);
                break;
        }

        return temp.ejecutar();
    }
}
