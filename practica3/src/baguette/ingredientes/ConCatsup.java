package src.baguette.ingredientes;

import src.baguette.*;

public class ConCatsup extends DecoradorBaguette {

    public ConCatsup(Baguette baguette) {
        super(baguette);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 2;
    }

    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Catsup";
    }
}