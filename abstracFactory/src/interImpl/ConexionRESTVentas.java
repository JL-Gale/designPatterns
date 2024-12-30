package interImpl;

import inter.IConexionREST;

public class ConexionRESTVentas implements IConexionREST {
    @Override
    public void leerUrl(String url) {
        System.out.println("Conectado a: "+url);
    }
}
