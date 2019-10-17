package src.baguette.ingredientes;

import src.baguette.*;

public class PanDeCenteno implements Comida {

    @Override
    public double getPrecio() {
        return 21.2;
    }

    @Override
    public String getIngredientes() {
        return "Pan de centeno";
    }
}