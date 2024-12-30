package interImpl;

import inter.IConexionDB;

public class ConexionPostgreSql implements IConexionDB {
    @Override
    public void conectar() {
        System.out.println("Conectado a MPostgreSql");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado de PostgreSql");
    }
}
