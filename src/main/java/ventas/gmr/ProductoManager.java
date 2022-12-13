package ventas.gmr;

import ventas.dto.Productos;
import ventas.Dao.ProductoDAO;
import ventas.exception.DaoException;
import ventas.exception.ExceptionManager;

public class ProductoManager {


    private ProductoDAO dao;

    public  ProductoManager(){
        this.dao = new ProductoDAO();
    }

    public void save(Productos p) throws ExceptionManager {
        try {
            Productos tp = dao.selectById(p);
            if (tp!=null){
                dao.insert(p);
            } else {
                dao.update(p);
            }
        }catch (Exception E){
            throw new ExceptionManager(E);

        }

    }
    public void delete(Productos p) throws ExceptionManager{
        try {
            Productos tp= dao.selectById(p);
            if (tp!=null){
                dao.delete(p);
            }
        }catch (Exception E){
            throw new ExceptionManager(E);

        }

    }

    public void selectAll() throws ExceptionManager{
        try {
            dao.selectAll();
        }catch (Exception E){
            throw new ExceptionManager(E);

        }

    }
}
