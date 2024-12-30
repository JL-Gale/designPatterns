package src.main;

import src.models.CuentaAHImlp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaAHImlp cuentaAHImlp1 = new CuentaAHImlp();
        cuentaAHImlp1.setMonto(100d);
        System.out.println(cuentaAHImlp1);
        System.out.println("******************");
        CuentaAHImlp cuentaAHImlp2 = (CuentaAHImlp) cuentaAHImlp1.clonar();
        cuentaAHImlp2.setMonto(cuentaAHImlp2.getMonto()+20d);
        System.out.println(cuentaAHImlp1);
        System.out.println(cuentaAHImlp2);

        System.out.println(cuentaAHImlp1 == cuentaAHImlp2);

    }
}