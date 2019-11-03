package src.producto.pociones.ingredientes;

import src.producto.pociones.Producto;

/**
 * Clase para ponerle red stone a la pocion.
 */
public class RedStone implements Producto {

    /**
     * Constructor de la clase RedStone.
     * @param  pocion Pocion a la que se le aplicara Red Stone.
     * @return        Pocion con Red Stone.
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

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    @Override
    public double getTiempoDuracion() {
        return super.getTiempoDuracion() + 1.5;
    }

}
