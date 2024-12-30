package main;

import inter.FabricaAbstacta;
import inter.Fabricas;
import inter.IConexionDB;
import inter.IConexionREST;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FabricaAbstacta fabricaAbstacta = FabricaProducto.getFabricaAbstacta(Fabricas.FABRICA_CONEXION_DB);
        IConexionDB DB = fabricaAbstacta.getFabricaConexionDB(DBConexions.MYSQL);
        DB.conectar();

        FabricaAbstacta fabricaAbstacta2 = FabricaProducto.getFabricaAbstacta(Fabricas.FABRICA_CONEXION_REST);
        IConexionREST REST = fabricaAbstacta2.getFabricaConexionREST(RESTConexions.COMPRAS);
        REST.leerUrl("/api/details/1234");
    }
}