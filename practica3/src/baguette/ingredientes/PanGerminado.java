package src.baguette.ingredientes;

import src.baguette.*;

public class PanGerminado implements Comida {

    @Override
    public double getPrecio() {
        return 19.6;
    }

    @Override
    public String getIngredientes() {
        return "Pan germinado";
    }
}