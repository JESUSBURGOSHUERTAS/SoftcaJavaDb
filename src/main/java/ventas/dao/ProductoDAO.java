package ventas.dao;

import ventas.database.ManagerConexion;
import ventas.dto.Productos;
import ventas.exception.DaoException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductoDAO {

    public void insert (Productos p) throws DaoException {
        String INSERT = "INSERT INTO productos (sku,dsproduct) VALUES (?,?)";
        PreparedStatement statement = null;
        Connection connection=ManagerConexion.getInstance().getConnection();
        try {
            statement=connection.prepareStatement(INSERT);
            statement.setString(1,p.getSku());
            statement.setString(2,p.getDsproducto());
            statement.executeUpdate();
        }catch (Exception E){
            throw new DaoException(E);

        }finally {
            try{
                statement.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }

    }

    public void update (Productos p) throws DaoException{
        String UPDATE = "UPDATE  productos\n" +
                "SET  dsproduct=?\n" +
                "WHERE sku=?";
        PreparedStatement statement = null;
        //Obtengo la conexión
        Connection connection=ManagerConexion.getInstance().getConnection();
        try {
            statement=connection.prepareStatement(UPDATE);
            statement.setString(1,p.getDsproducto());
            statement.setString(2,p.getSku());

            statement.executeUpdate();
        }catch (Exception E){
            throw new DaoException(E);

        }finally {
            try{
                statement.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    public void selectAll () throws DaoException{
        try {

        }catch (Exception E){
            throw new DaoException(E);

        }
    }
    public void delete (Productos p) throws DaoException{
        try {

        }catch (Exception E){
            throw new DaoException(E);

        }
    }
    public Productos selectById (Productos p) throws DaoException{
        Productos _result=null;
        String SELECT = "SELECT sku,dsproduct\n" +
                "FROM productos\n" +
                "WHERE sku=?";
        PreparedStatement statement = null;
        ResultSet resultSet=null;
        //Obtengo la conexión
        Connection connection=ManagerConexion.getInstance().getConnection();
        System.out.println(connection);
        try {
            statement = connection.prepareStatement(SELECT);
            statement.setString(1,p.getSku());

            resultSet = statement.executeQuery();
            while (resultSet.next()){
                _result= new Productos();
                _result.setSku(resultSet.getString("sku"));
                _result.setDsproducto(resultSet.getString("dsproduct"));

            }
        }catch (Exception E){
            throw new DaoException(E);

        }finally {
            try{
                resultSet.close();
                statement.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        return _result;
    }


}
