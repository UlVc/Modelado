package src.autos.carroceria;

import src.autos.Pieza;

/**
 * Clase para la carrocería de camión.
 */
public class CarroceriaCamion implements Pieza {

    /**
     * Devuelve el ataque de la pieza.
     * @return Ataque de la pieza.
     */
    @Override
    public double ataque() {
        return 0;
    }

    /**
     * Devuelve la defensa de la pieza.
     * @return Defensa de la pieza.
     */
    @Override
    public double defensa() {
        return 40;
    }

    /**
     * Devuelve la velocidad de la pieza.
     * @return Velocidad de la pieza.
     */
    @Override
    public double velocidad() {
        return -15;
     }

    /**
     * Devuelve el costo de la pieza.
     * @return Costo de la pieza.
     */
    @Override
    public double costo() {
        return 65;
    }

}
