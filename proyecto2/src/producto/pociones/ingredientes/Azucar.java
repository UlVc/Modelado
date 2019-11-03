package src.producto.pociones.ingredientes;

import src.producto.pociones.Producto;

/**
 * Clase para ponerle azúcar a la pocion.
 */
public class Azucar implements Producto {

    /**
     * Constructor de la clase Azucar.
     * @param  pocion Poción a la que se le aplicará Azúcar.
     * @return        Pocion con Azúcar.
     */
    public Azucar(Producto pocion) {
        super(pocion);
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Azucar";
    }

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    @Override
    public double getTiempoDuracion() {
        return 3;
    }

}
