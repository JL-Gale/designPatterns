import decoratorExte.Azucar;
import decoratorExte.Crema;
import interImpl.CafaSolo;

public class Main {
    public static void main(String[] args) {
        CafaSolo cafeSolo = new CafaSolo();
        Azucar cafeConazucar = new Azucar(cafeSolo);
        Crema cafeSoloConAzucarYcrema = new Crema(cafeConazucar);

        System.out.println(cafeSoloConAzucarYcrema.costo());
        System.out.println(cafeSoloConAzucarYcrema.descripcion());

    }
}