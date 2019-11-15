package src.producto.pociones.efectos;

import src.producto.pociones.*;
import src.producto.*;

/**
 * Clase para ponerle polvo de blaze a la pocion.
 */
public class Fuerza extends DecoradorPocion {

    private Producto pocion;

    /**
     * Constructor de la clase Fuerza.
     * @param  pocion Pocion a la que se le aplicara Polvo De Blaze.
     * @return        Pocion con Polvo de Blaze.
     */
    public Fuerza(Producto pocion) {
        this.pocion = pocion;
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getEfectos() {
        return pocion.getEfectos() + ", Polvo de Blaze";
    }

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    @Override
    public double getTiempoDuracion() {
        return pocion.getTiempoDuracion() + 0;
    }

}
