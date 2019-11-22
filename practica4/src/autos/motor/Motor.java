package src.autos.motor;

import src.autos.Pieza;

/**
 * Clase para los tipos de motor.
 */
public abstract class Motor implements Pieza {

	/**
     * Devuelve el ataque de la pieza.
     * @return Ataque de la pieza.
     */
	@Override
  	public abstract double ataque();

  	/**
     * Devuelve la defensa de la pieza.
     * @return Defensa de la pieza.
     */
  	@Override
    public abstract double defensa();

    /**
     * Devuelve la velocidad de la pieza.
     * @return Velocidad de la pieza.
     */
    @Override
    public abstract double velocidad();

    /**
     * Devuelve el costo de la pieza.
     * @return Costo de la pieza.
     */
    @Override
    public abstract double costo();

}
