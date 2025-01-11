import Decorator.BlindajeDecorador;
import interf.ICuentaBancaria;
import interfImpl.CuentaAhorroImpl;
import interfImpl.CuentaCorrienteImpl;
import models.Cuenta;

public class Main {
    public static void main(String[] args) {

        Cuenta c = new Cuenta(1, "Jorge");

        ICuentaBancaria cuenta = new CuentaCorrienteImpl();
        ICuentaBancaria cuentaBlindada  = new BlindajeDecorador(cuenta);

        cuentaBlindada.abrirCuenta(c);

    }
}