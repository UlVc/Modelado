package src.autos.motor;

import src.autos.Pieza;

/**
 * Clase para el motor diesel.
 */
public class MotorDiesel implements Pieza {

    /**
     * Devuelve el ataque de la pieza.
     * @return Ataque de la pieza.
     */
    @Override
    public double ataque() {
        return 0;
    }

    /**
     * Devuelve el ataque de la pieza.
     * @return Ataque de la pieza.
     */
    @Override
    public double defensa() {
        return 0;
    }

    /**
     * Devuelve el ataque de la pieza.
     * @return Ataque de la pieza.
     */
    @Override
    public double velocidad() {
        return 40;
     }

    /**
     * Devuelve el ataque de la pieza.
     * @return Ataque de la pieza.
     */
    @Override
    public double costo() {
        return 70;
    }

}
