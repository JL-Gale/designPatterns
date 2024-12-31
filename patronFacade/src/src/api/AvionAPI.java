package src.api;

public class AvionAPI {
    public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino) {
        System.out.println("=========================================");
        System.out.println("Vuelos encontrados para "+destino+" desde "+origen);
        System.out.println("Fecha ida: "+fechaIda+" fecha Vuelta: "+fechaVuelta);
        System.out.println("=========================================");
    }
}
