package proxy;

import interCuenta.ICuenta;
import interImpl.CuentaBancoImpl;
import model.Cuenta;

public class CuentaProxy implements ICuenta {
    
    private CuentaBancoImpl cuentaReal;
    
    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoImpl();
            return cuentaReal.retirarDinero(cuenta, monto);
        } else {
            return cuentaReal.retirarDinero(cuenta, monto);
        }
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoImpl();
            return cuentaReal.depositarDinero(cuenta, monto);
        } else {
            return cuentaReal.depositarDinero(cuenta, monto);
        }
    }

    @Override
    public void mostarSaldo(Cuenta cuenta) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoImpl();
            cuentaReal.mostarSaldo(cuenta);
        } else {
            cuentaReal.mostarSaldo(cuenta);
        }
    }
}
