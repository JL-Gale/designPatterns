package main;

import inter.FabricaAbstacta;
import inter.Fabricas;

public class FabricaProducto {

    public static FabricaAbstacta getFabricaAbstacta(Fabricas fabricas){
        switch (fabricas) {
            case FABRICA_CONEXION_DB -> {
                return new FabricaConexionBD();
            }
            case FABRICA_CONEXION_REST -> {
                return new FabricaConexionREST();
            }
            default -> {
                return null;
            }
        }
    }
}
