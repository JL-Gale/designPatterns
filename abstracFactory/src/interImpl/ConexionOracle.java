package interImpl;

import inter.IConexionDB;

public class ConexionOracle implements IConexionDB {
    @Override
    public void conectar() {
        System.out.println("Conectado a Oracle");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado de Oracle");
    }
}
