package src.baguette.ingredientes;

import src.baguette.*;

public class ConPollo extends DecoradorBaguette {

    public ConPollo(Baguette baguette) {
        super(baguette);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 4.5;
    }

    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Pollo";
    }
}