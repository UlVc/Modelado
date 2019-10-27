package src.pociones;

/**
 * Clase para ponerle glow stone a la pocion.
 */
public class Glowstone extends DecoradorPocion {

    /**
     * Constructor de la clase GlowStone.
     * @param  pocion Pocion a la que se le aplicara Glow Stone.
     * @return          Pocion con Glow Stone.
     */
    public GlowStone(Producto pocion) {
        super(pocion);
    }

    /**
     * Devuelve los ingredientes que contiene la pocion
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Glow Stone";
    }
}