package src.baguette.ingredientes;

import src.baguette.*;

public class ConLechuga extends DecoradorBaguette {

    public ConLechuga(Baguette baguette) {
        super(baguette);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 3;
    }

    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Lechuga";
    }
}