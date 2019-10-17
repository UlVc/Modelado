package src.baguette.ingredientes;

import src.baguette.*;

public class PanIntegral implements Comida {

    @Override
    public double getPrecio() {
        return 15.4;
    }

    @Override
    public String getIngredientes() {
        return "Pan integral";
    }
}