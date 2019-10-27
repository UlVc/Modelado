package src.pociones;

/**
 * Clase para ponerle red stone a la pocion.
 */
public class RedStone extends DecoradorPocion {

    /**
     * Constructor de la clase RedStone.
     * @param  pocion Pocion a la que se le aplicara Red Stone.
     * @return          Pocion con Red Stone.
     */
    public RedStone(Producto pocion) {
        super(pocion);
    }

    /**
     * Devuelve los ingredientes que contiene el pocion.
     * @return Ingredientes del pocion.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Red Stone";
    }
}