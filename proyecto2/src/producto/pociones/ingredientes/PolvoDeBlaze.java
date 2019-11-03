package src.producto.pociones.ingredientes;

import src.producto.pociones.Producto;

/**
 * Clase para ponerle polvo de blaze a la pocion.
 */
public class PolvoDeBlaze implements Producto {

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

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    @Override
    public double getTiempoDuracion() {
        return super.getTiempoDuracion() + 0;
    }

}
