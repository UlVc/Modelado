package src.baguette.ingredientes;

import src.baguette.*;

public class ConMostaza extends DecoradorBaguette {

    public ConMostaza(Baguette baguette) {
        super(baguette);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 2.3;
    }

    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Mostaza";
    }
}