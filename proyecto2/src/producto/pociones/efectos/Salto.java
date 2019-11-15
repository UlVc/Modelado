package src.producto.pociones.efectos;

import src.producto.pociones.*;
import src.producto.*;

/**
 * Clase para ponerle pata de conejo a la pocion.
 */
public class Salto extends DecoradorPocion {

    private Producto pocion;

    /**
     * Constructor de la clase Salto.
     * @param  pocion Pocion a la que se le agregara Pata Conejo.
     * @return        Pocion con Salto.
     */
    public Salto(Producto pocion) {
        this.pocion = pocion;
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getEfectos() {
        return pocion.getEfectos() + ", Salto";
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
