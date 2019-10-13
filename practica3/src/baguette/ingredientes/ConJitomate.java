package src.baguette.ingredientes;

import src.baguette.*;

public class ConJitomate extends DecoradorBaguette {

    public ConJitomate(Baguette baguette) {
        super(baguette);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 2.4;
    }

    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Jitomate";
    }
}