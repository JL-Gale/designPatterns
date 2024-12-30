package main;

import inter.FabricaAbstacta;
import inter.IConexionDB;
import inter.IConexionREST;
import interImpl.ConexionRESTCompras;
import interImpl.ConexionRESTNoArea;
import interImpl.ConexionRESTVentas;

public class FabricaConexionREST  implements FabricaAbstacta {
    @Override
    public IConexionDB getFabricaConexionDB(DBConexions conexion) {
        return null;
    }

    @Override
    public IConexionREST getFabricaConexionREST(RESTConexions conexion) {
        switch (conexion) {
            case VENTAS -> {
                return new ConexionRESTVentas();
            }
            case COMPRAS -> {
                return new ConexionRESTCompras();
            }
            default -> {
                return new ConexionRESTNoArea();
            }
        }
    }
}
