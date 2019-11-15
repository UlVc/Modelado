package src.producto.pociones.efectos;

import src.producto.pociones.*;
import src.producto.*;

/**
 * Clase para ponerle membrana de fantasma a la pocion.
 */
public class Vuelo extends DecoradorPocion {

    private Producto pocion;

    /**
     * Constructor de la clase Vuelo.
     * @param  pocion Pocion a la que se le aplicará la Membrana de Fntasma.
     * @return        Pocion con Membrana Fantasma.
     */
    public Vuelo(Producto pocion) {
        this.pocion = pocion;
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getEfectos() {
        return pocion.getEfectos() + ", Vuelo";
    }

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    @Override
    public double getTiempoDuracion() {
        return pocion.getTiempoDuracion() + 1.3;
    }

}
