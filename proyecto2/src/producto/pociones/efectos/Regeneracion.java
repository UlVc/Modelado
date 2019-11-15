package src.producto.pociones.efectos;

import src.producto.pociones.*;
import src.producto.*;

/**
 * Clase para ponerle lagrima de Ghast a la pocion.
 */
public class Regeneracion extends DecoradorPocion {

    private Producto pocion;

    /**
     * Constructor de la clase Regeneración .
     * @param  pocion Pocion a la que se le aplicara Regeneración .
     * @return        Pocion con Regeneración .
     */
    public Regeneracion(Producto pocion) {
        this.pocion = pocion;
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getEfectos() {
        return pocion.getEfectos() + ", Regeneración";
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
