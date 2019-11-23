package src.autos;

/**
 * Clase para las piezas del coche.
 */
public interface Pieza {

	/**
     * Devuelve el ataque de la pieza.
     * @return Ataque de la pieza.
     */
    public double ataque();

    /**
     * Devuelve la defensa de la pieza.
     * @return Defensa de la pieza.
     */
    public double defensa();

    /**
     * Devuelve la velocidad de la pieza.
     * @return Velocidad de la pieza.
     */
    public double velocidad();

    /**
     * Devuelve el costo de la pieza.
     * @return Costo de la pieza.
     */
    public double costo();

}
