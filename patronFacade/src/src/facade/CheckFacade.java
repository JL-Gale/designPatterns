package src.facade;

import src.api.AvionAPI;
import src.api.HotelAPI;

public class CheckFacade {
    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;

    public CheckFacade() {
        this.avionAPI = new AvionAPI();
        this.hotelAPI = new HotelAPI();
    }

    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
        this.avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
        this.hotelAPI.buscarHotel(fechaIda, fechaVuelta, origen, destino);
    }

}
