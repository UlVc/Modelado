package src.baguette.ingredientes;

import src.baguette.*;

public class PanDeTrigo implements Comida {

    @Override
    public double getPrecio() {
        return 13.2;
    }

    @Override
    public String getIngredientes() {
        return "Pan de trigo";
    }
}