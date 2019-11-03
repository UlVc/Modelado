package src.producto.pociones;

public class DecoradorPocion implements Producto {

    private final Producto pocionDecorada;

    /**
     * Constructor de la clase DecoradorPocion.
     * @param pocionDecorada Pocion a decorar.
     */
    public DecoradorPocion(Producto pocionDecorada) {
        this.pocionDecorada = pocionDecorada;
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getIngredientes() {
        return pocionDecorada.getIngredientes();
    }

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    @Override
    public double getTiempoDuracion() {
        return pocionDecorada.getTiempoDuracion();
    }

}
