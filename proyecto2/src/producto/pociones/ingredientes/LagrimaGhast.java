package src.producto.pociones.ingredientes;

import src.producto.pociones.*;
import src.producto.*;

/**
 * Clase para ponerle lagrima de Ghast a la pocion.
 */
public class LagrimaGhast extends DecoradorPocion {

    private Producto pocion;

    /**
     * Constructor de la clase LagrimaGhast.
     * @param  pocion Pocion a la que se le aplicara LagrimaGhast.
     * @return        Pocion con LagrimaGhast.
     */
    public LagrimaGhast(Producto pocion) {
        this.pocion = pocion;
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getIngredientes() {
        return pocion.getIngredientes() + ", Lagrima de Ghast";
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
