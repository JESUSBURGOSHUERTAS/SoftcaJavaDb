package ventas.facade;

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
            Pm.save(p);
        }catch (Exception E){
            throw new ExceptionFacade(E);

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

    public void Process(Productos dto) throws ExceptionFacade{

        try {
            Pm.save(dto);
        }catch (Exception E){
            throw new ExceptionFacade(E);

        }

    }
}
