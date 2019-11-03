package src.producto.pociones.ingredientes;

import src.producto.pociones.Producto;

/**
 * Clase para ponerle lagrima de Ghast a la pocion.
 */
public class LagrimaGhast implements Producto {

    /**
     * Constructor de la clase LagrimaGhast.
     * @param  pocion Pocion a la que se le aplicara LagrimaGhast.
     * @return        Pocion con LagrimaGhast.
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

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    @Override
    public double getTiempoDuracion() {
        return 0.45;
    }

}
