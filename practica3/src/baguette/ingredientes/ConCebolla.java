package src.baguette.ingredientes;

import src.baguette.*;

public class ConCebolla extends DecoradorBaguette {

    public ConCebolla(Baguette baguette) {
        super(baguette);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 1.7;
    }

    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Cebolla";
    }
}