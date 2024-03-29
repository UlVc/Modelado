package src.producto.pociones.efectos;

import src.producto.pociones.*;
import src.producto.*;
/**
 * Clase para ponerle red stone a la pocion.
 */
public class ResistenciaFuego extends DecoradorPocion {

    private Producto pocion;

    /**
     * Constructor de la clase ResistenciaFuego.
     * @param  pocion Pocion a la que se le aplicara Red Stone.
     * @return        Pocion con Red Stone.
     */
    public ResistenciaFuego(Producto pocion) {
        this.pocion = pocion;
    }

    /**
     * Devuelve los ingredientes que contiene el pocion.
     * @return Ingredientes del pocion.
     */
    @Override
    public String getEfectos() {
        return pocion.getEfectos() + ", Resistencia el fuego";
    }

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    @Override
    public double getTiempoDuracion() {
        return pocion.getTiempoDuracion() + 1.5;
    }

}
