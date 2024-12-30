package inter;

import main.DBConexions;
import main.RESTConexions;

public interface FabricaAbstacta {
    IConexionDB getFabricaConexionDB(DBConexions conexion);
    IConexionREST getFabricaConexionREST(RESTConexions conexion);
}
