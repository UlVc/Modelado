package src.baguette;

public abstract class DecoradorBaguette implements Baguette {

    private final Baguette baguetteDecorado;

    public DecoradorBaguette(Baguette baguette) {
        this.baguetteDecorado = baguette;
    }

    @Override
    public double getPrecio() {
        return baguetteDecorado.getPrecio();
    }

    @Override
    public String getIngredientes() {
        return baguetteDecorado.getIngredientes();
    }
}