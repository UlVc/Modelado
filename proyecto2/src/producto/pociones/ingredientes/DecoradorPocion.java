package src.producto.pociones;


public class DecoradorPocion {

    private final Producto pocionDecorada;

    /**
     * Constructor de la clase DecoradorPocion.
     * @param pocion
     */
    public DecoradorPocion(Producto pocion) {
        this.pocionDecorada = pocion;
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getIngredientes() {
        return pocionDecorada.getIngredientes();
    }

}
