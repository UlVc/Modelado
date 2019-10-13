package src.baguette.ingredientes;

import src.baguette.*;

public class ConJamon extends DecoradorBaguette {

    public ConJamon(Baguette baguette) {
        super(baguette);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 4;
    }

    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Jamón";
    }
}