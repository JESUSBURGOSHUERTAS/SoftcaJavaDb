package ventas.database;

import java.sql.Connection;

public class ManagerConexion {

    private static ManagerConexion instance;

    private Conexion Conex;

    private ManagerConexion() {

        Conex = new Conexion();

    }

    public static ManagerConexion getInstance() {
        if (instance == null) {
            instance = new ManagerConexion();
        }
        return instance;
    }

    public void open() {
        Conex.conector();
    }

    public void commit() {
        try {
            Conex.getCon().commit();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    public void rollback() {
        try {
            Conex.getCon().rollback();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void close(){
        try {
            Conex.getCon().close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Connection getConnection(){
        return Conex.getCon();
    }
}
