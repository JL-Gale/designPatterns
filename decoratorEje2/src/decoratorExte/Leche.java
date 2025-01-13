package decoratorExte;

import decorator.AgregadorDecorador;
import inter.BebidaComponent;

public class Leche extends AgregadorDecorador {

    public Leche(BebidaComponent bebidaComponent) {
        super(bebidaComponent);
    }


    @Override
    public double costo() {
        return 0;
    }

    @Override
    public String descripcion() {
        return bebidaComponent.descripcion().concat(", leche");
    }
}
