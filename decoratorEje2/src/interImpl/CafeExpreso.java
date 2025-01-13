package interImpl;

import inter.BebidaComponent;

public class CafeExpreso implements BebidaComponent {
    @Override
    public double costo() {
        return 12;
    }

    @Override
    public String descripcion() {
        return "cafe expreso";
    }
}
