package interfImpl;

import interf.ICuentaBancaria;
import models.Cuenta;

public class CuentaCorrienteImpl implements ICuentaBancaria {
    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println("------------------");
        System.out.println("Se abrio una cuenta correinte");
        System.out.println("Cliente: "+c.getCliente());
    }
}
