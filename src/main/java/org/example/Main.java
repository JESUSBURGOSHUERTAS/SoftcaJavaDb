package org.example;

import ventas.controller.ProductosController;
import ventas.dto.Productos;
import ventas.exception.ExceptionController;

public class Main {

    public static void main(String[] a){
        ProductosController Pc = new ProductosController();
        Productos productos = new Productos();
        productos.setSku("1");
        productos.setDsproducto("Crema");
        try {
            Pc.Process(productos);
        } catch (ExceptionController e) {
            throw new RuntimeException(e);
        }
    }


}