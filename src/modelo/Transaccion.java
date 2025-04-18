package modelo;

public abstract class Transaccion {

    private int numeroCuenta;
    private BaseDatosBanco baseDatosBanco;

    // Constructor con argumentos
    public Transaccion(int numeroCuenta, BaseDatosBanco baseDatosBanco) {
        this.numeroCuenta = numeroCuenta;
        this.baseDatosBanco = baseDatosBanco;
    }

    public int obtenerNumeroCuenta() {
        return numeroCuenta;
    }

    public BaseDatosBanco obtenerBaseDatosBanco() {
        return baseDatosBanco;
    }

    public abstract String ejecutar();
}
