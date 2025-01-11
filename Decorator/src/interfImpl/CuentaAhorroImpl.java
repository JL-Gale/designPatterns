package interfImpl;

import interf.ICuentaBancaria;
import models.Cuenta;

public class CuentaAhorroImpl implements ICuentaBancaria {
    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println("------------------");
        System.out.println("Se abrio una cuenta ahorro");
        System.out.println("Cliente: "+c.getCliente());
    }
}
