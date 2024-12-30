package main;

import inter.FabricaAbstacta;
import inter.IConexionDB;
import inter.IConexionREST;
import interImpl.*;

public class FabricaConexionBD implements FabricaAbstacta {

    @Override
    public IConexionDB getFabricaConexionDB(DBConexions conexion) {
        switch (conexion) {
            case MYSQL -> {
                return new ConexionMySql();
            }
            case ORACLE -> {
                return new ConexionOracle();
            }
            case SQLSERVER -> {
                return new ConexionSqlServer();
            }
            case POSTGRESQL -> {
                return new ConexionPostgreSql();
            }
            default -> {
                return new ConexionVacia();
            }
        }
    }

    @Override
    public IConexionREST getFabricaConexionREST(RESTConexions conexion) {
        return null;
    }
}
