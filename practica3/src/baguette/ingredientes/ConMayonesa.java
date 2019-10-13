package src.baguette.ingredientes;

import src.baguette.*;

public class ConMayonesa extends DecoradorBaguette {

    public ConMayonesa(Baguette baguette) {
        super(baguette);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 1.8;
    }

    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Mayonesa";
    }
}