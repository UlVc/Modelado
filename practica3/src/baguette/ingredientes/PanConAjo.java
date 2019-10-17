package src.baguette.ingredientes;

import src.baguette.*;

public class PanConAjo implements Comida {

    @Override
    public double getPrecio() {
        return 12;
    }

    @Override
    public String getIngredientes() {
        return "Pan con ajo";
    }
}