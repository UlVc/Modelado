package src.producto.pociones;

/**
 * Clase para ponerle pata de conejo a la pocion.
 */
public class PataConejo extends DecoradorPocion {

    /**
     * Constructor de la clase PataConejo.
     * @param  pocion Pocion a la que se le agregara Pata Conejo.
     * @return          Pocion con PataConejo.
     */
    public PataConejo(Producto pocion) {
        super(pocion);
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Pata de Conejo";
    }

}