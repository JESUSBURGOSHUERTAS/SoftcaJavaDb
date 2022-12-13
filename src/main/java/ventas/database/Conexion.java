package ventas.database;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private Connection Conn = null;



    public void conector(){
        try {
            String sURL = "jdbc:mysql://localhost:3306/softca";
            Conn = DriverManager.getConnection(sURL,"root","B7809297bt7.");
            Conn.setAutoCommit(false);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public Connection getCon(){
        return Conn;
    }
}
