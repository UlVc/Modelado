package src.autos.motor;

import src.autos.Pieza;

/**
 * Clase para el motor simple.
 */
public class MotorSimple implements Pieza {

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
        return 0;
    }

    /**
     * Devuelve la velocidad de la pieza.
     * @return Velocidad de la pieza.
     */
    @Override
    public double velocidad() {
        return 10;
     }

    /**
     * Devuelve el costo de la pieza.
     * @return Costo de la pieza.
     */
    @Override
    public double costo() {
        return 20;
    }

}
