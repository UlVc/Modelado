package src.producto.pociones.ingredientes;

import src.producto.pociones.Producto;

/**
 * Clase para ponerle membrana de fantasma a la pocion.
 */
public class MembranaFantasma implements Producto {

    /**
     * Constructor de la clase MembranaFantasma.
     * @param  pocion Pocion a la que se le aplicará la Membrana de Fntasma.
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

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    @Override
    public double getTiempoDuracion() {
        return super.getTiempoDuracion() + 1.3;
    }

}
