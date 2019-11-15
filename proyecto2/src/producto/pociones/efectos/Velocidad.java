package src.producto.pociones.efectos;

import src.producto.pociones.*;
import src.producto.*;

/**
 * Clase para ponerle azúcar a la pocion.
 */
public class Velocidad extends DecoradorPocion {

    private Producto pocion;

    /**
     * Constructor de la clase Velocidad.
     * @param  pocion Poción a la que se le aplicará Azúcar.
     * @return        Pocion con Azúcar.
     */
    public Velocidad(Producto pocion) {
        this.pocion = pocion;
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getEfectos() {
        return pocion.getEfectos() + ", Velocidad";
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
