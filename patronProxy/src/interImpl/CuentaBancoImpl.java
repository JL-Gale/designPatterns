package interImpl;

import interCuenta.ICuenta;
import model.Cuenta;

public class CuentaBancoImpl implements ICuenta {
    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        double dineroRetirar = cuenta.getSaldoInicial() - monto;
        cuenta.setSaldoInicial(dineroRetirar);
        System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
        return cuenta;
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        double dineroDepositar = cuenta.getSaldoInicial() + monto;
        cuenta.setSaldoInicial(dineroDepositar);
        System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
        return cuenta;
    }

    @Override
    public void mostarSaldo(Cuenta cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
    }
}
