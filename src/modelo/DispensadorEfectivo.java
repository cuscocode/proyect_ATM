package modelo;

public class DispensadorEfectivo {
    private final static int CUENTA_INICIAL = 500;
    private int cuenta;

    public DispensadorEfectivo() {
        cuenta = CUENTA_INICIAL;
    }

    public void dispensarEfectivo(int monto) {
        int billetesRequeridos = monto / 20;
        cuenta -= billetesRequeridos;
    }

    public boolean haySuficienteEfectivoDisponible(int monto) {
        int billetesRequeridos = monto / 20;
        return cuenta >= billetesRequeridos;
    }
}
