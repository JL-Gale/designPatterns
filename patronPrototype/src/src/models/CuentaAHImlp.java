package src.models;

import src.inter.Icuenta;

public class CuentaAHImlp implements Icuenta {

    private String tipo;
    private Double monto;

    public CuentaAHImlp() {
        this.tipo = "AHORRP";
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    @Override
    public Icuenta clonar() {
        Icuenta cuenta = null;
        try {
            cuenta = (CuentaAHImlp)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cuenta;
    }

    @Override
    public String toString() {
        return "CuentaAHImlp{" +
                "tipo='" + tipo + '\'' +
                ", monto=" + monto +
                '}';
    }
}
