package ventas.controller;

import ventas.dto.Productos;
import ventas.exception.DaoException;
import ventas.exception.ExceptionController;
import ventas.facade.ProductosFacade;

public class ProductosController {

private ProductosFacade Pf;

    public ProductosController() {
        this.Pf = new ProductosFacade();
    }

    public void Process(Productos dto) throws ExceptionController {
        try {
            Pf.Process(dto);
        }catch (Exception E){
            throw new ExceptionController(E);

        }

    }

    public void delete(Productos dto) throws ExceptionController{
        try {
            Pf.delete(dto);
        }catch (Exception E){
            throw new ExceptionController(E);

        }

    }

    public Productos selectAll() throws ExceptionController{
        try {
            Pf.selectAll();
        }catch (Exception E){
            throw new ExceptionController(E);

        }

        return null;
    }
}
