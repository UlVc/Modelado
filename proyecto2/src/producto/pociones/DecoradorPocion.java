package src.producto.pociones;

import src.producto.*;

public abstract class DecoradorPocion extends Producto {

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    public abstract String getIngredientes();

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    public abstract double getTiempoDuracion();

}
