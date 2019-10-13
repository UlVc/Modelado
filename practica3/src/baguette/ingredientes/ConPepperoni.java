package src.baguette.ingredientes;

import src.baguette.*;

public class ConPepperoni extends DecoradorBaguette {

    public ConPepperoni(Baguette baguette) {
        super(baguette);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 3.5;
    }

    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Pepperoni";
    }
}