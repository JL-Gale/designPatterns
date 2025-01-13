package decoratorExte;

import decorator.AgregadorDecorador;
import inter.BebidaComponent;

public class Educorante extends AgregadorDecorador {

    public Educorante(BebidaComponent bebidaComponent) {
        super(bebidaComponent);
    }

    @Override
    public double costo() {
        return bebidaComponent.costo()+1;
    }

    @Override
    public String descripcion() {
        return bebidaComponent.descripcion().concat(", educorante");
    }
}
