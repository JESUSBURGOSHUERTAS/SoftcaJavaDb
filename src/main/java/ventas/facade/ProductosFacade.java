package ventas.facade;

import ventas.database.ManagerConexion;
import ventas.exception.DaoException;
import ventas.exception.ExceptionFacade;
import ventas.gmr.ProductoManager;
import ventas.dto.Productos;

public class ProductosFacade {

    private ProductoManager Pm;

    public ProductosFacade(){
        this.Pm = new ProductoManager();
    }
    public void save(Productos p) throws ExceptionFacade {
        try {
            ManagerConexion.getInstance().open();
            Pm.save(p);
            ManagerConexion.getInstance().commit();
        }catch (Exception E){
            ManagerConexion.getInstance().rollback();
            throw new ExceptionFacade(E);

        }finally {
            ManagerConexion.getInstance().close();
        }

    }

    public void delete(Productos p) throws ExceptionFacade{

        try {
            Pm.delete(p);
        }catch (Exception E){
            throw new ExceptionFacade(E);

        }
    }

    public void selectAll() throws ExceptionFacade{
        try {
            Pm.selectAll();
        }catch (Exception E){
            throw new ExceptionFacade(E);

        }

    }


}
