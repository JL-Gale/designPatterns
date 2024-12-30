package interImpl;

import inter.IConexionDB;

public class ConexionMySql implements IConexionDB {
    @Override
    public void conectar() {
        System.out.println("Conectado a MySql");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado de MySql");
    }
}
