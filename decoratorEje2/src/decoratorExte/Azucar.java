package decoratorExte;

import decorator.AgregadorDecorador;
import inter.BebidaComponent;

public class Azucar extends AgregadorDecorador {

    public Azucar(BebidaComponent bebidaComponent) {
        super(bebidaComponent);
    }

    @Override
    public double costo() {
        return bebidaComponent.costo()+0.50;
    }

    @Override
    public String descripcion() {
        return bebidaComponent.descripcion().concat(", azucar");
    }
}
