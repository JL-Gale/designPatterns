package interImpl;

import inter.IConexionDB;

public class ConexionVacia implements IConexionDB {
    @Override
    public void conectar() {
        System.out.println("Sin conexion");
    }

    @Override
    public void desconectar() {
        System.out.println("Sin conexion");
    }
}
