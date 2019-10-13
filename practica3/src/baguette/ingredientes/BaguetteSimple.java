package src.baguette.ingredientes;

import src.baguette.*;

public class BaguetteSimple implements Baguette {

    @Override
    public double getPrecio() {
        return 1;
    }

    @Override
    public String getIngredientes() {
        return "Pan";
    }
}