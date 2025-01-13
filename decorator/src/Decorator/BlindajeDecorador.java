package Decorator;

import interf.ICuentaBancaria;
import models.Cuenta;

public class BlindajeDecorador extends CuentaDecorador{

    public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }

    @Override
    public void abrirCuenta(Cuenta c) {
        cuentaDecorada.abrirCuenta(c);
        agregarBlindaje(c);
    }

    private void agregarBlindaje(Cuenta c) {
        System.out.println("Se agrego blindaje a la cuenta del cliente: "+c.getCliente());
    }
}
