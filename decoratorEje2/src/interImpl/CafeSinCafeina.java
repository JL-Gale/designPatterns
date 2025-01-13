package interImpl;

import inter.BebidaComponent;

public class CafeSinCafeina implements BebidaComponent {
    @Override
    public double costo() {
        return 15;
    }

    @Override
    public String descripcion() {
        return "cafe descafeinado";
    }
}
