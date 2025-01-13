package decoratorExte;

import decorator.AgregadorDecorador;
import inter.BebidaComponent;

public class Crema extends AgregadorDecorador {

    public Crema(BebidaComponent bebidaComponent) {
        super(bebidaComponent);
    }


    @Override
    public double costo() {
        return bebidaComponent.costo()+4;
    }

    @Override
    public String descripcion() {
        return bebidaComponent.descripcion().concat(", crema");
    }
}
