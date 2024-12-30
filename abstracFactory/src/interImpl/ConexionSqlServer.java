package interImpl;

import inter.IConexionDB;

public class ConexionSqlServer implements IConexionDB {
    @Override
    public void conectar() {
        System.out.println("Conectado a SqlServer");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado de SqlServer");
    }
}
