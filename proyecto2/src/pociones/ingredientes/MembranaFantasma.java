package src.pociones;

/**
 * Clase para ponerle membrana de fantasma a la pocion.
 */
public class MembranaFantasma extends DecoradorPocion {

    /**
     * Constructor de la clase MembranaFantasma.
     * @param  pocion Poción a la que se le aplicará la Membrana de Fntasma.
     * @return        Pocion con Membrana Fantasma.
     */
    public MembranaFantasma(Producto pocion) {
        super(pocion);
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Membrana de Fantasma";
    }
}