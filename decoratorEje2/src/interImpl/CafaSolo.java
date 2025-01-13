package interImpl;

import inter.BebidaComponent;

public class CafaSolo implements BebidaComponent {
    @Override
    public double costo() {
        return 10;
    }

    @Override
    public String descripcion() {
        return "cafe solo";
    }
}
