package src.producto.pociones;

/**
 * Clase para ponerle polvo de blaze a la pocion.
 */
public class PolvoDeBlaze extends DecoradorPocion {

    /**
     * Constructor de la clase PolvoDeBlaze.
     * @param  pocion Pocion a la que se le aplicara Polvo De Blaze.
     * @return        Pocion con Polvo de Blaze.
     */
    public PolvoDeBlaze(Producto pocion) {
        super(pocion);
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Polvo de Blaze";
    }

}
