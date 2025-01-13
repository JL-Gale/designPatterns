package interImpl;

import inter.BebidaComponent;

public class TeTradicional implements BebidaComponent {
    @Override
    public double costo() {
        return 8;
    }

    @Override
    public String descripcion() {
        return "te tradicional";
    }
}
