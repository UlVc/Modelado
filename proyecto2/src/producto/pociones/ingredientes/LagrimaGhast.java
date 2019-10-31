package src.producto.pociones;

/**
 * Clase para ponerle lagrima de Ghast a la pocion.
 */
public class LagrimaGhast extends DecoradorPocion {

    /**
     * Constructor de la clase LagrimaGhast.
     * @param  pocion Pocion a la que se le aplicara LagrimaGhast.
     * @return          Pocion con LagrimaGhast.
     */
    public LagrimaGhast(Producto pocion) {
        super(pocion);
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Lagrima de Ghast";
    }

}