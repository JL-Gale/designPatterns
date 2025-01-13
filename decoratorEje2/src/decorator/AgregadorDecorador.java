package decorator;

import inter.BebidaComponent;

public abstract class AgregadorDecorador implements BebidaComponent {

   protected BebidaComponent bebidaComponent;

    public AgregadorDecorador(BebidaComponent bebidaComponent) {
        this.bebidaComponent = bebidaComponent;
    }
}
