package src.producto.manzanas;

/**
 * Interfaza para los tipos de manzanas.
 */
public interface Manzana {

    /**
     * Devuelve el primer efecto que birnda la manzana.
     * @return Primero efecto que brinda la manzana.
     */
    public String getPrimerEfecto();

    /**
     * Devuelve el segundo efecto que birnda la manzana.
     * @return Segundo efecto que brinda la manzana.
     */
    public String getSegundoEfecto();

    /**
     * Devuelve el tercer efecto que birnda la manzana.
     * @return Tercero efecto que brinda la manzana.
     */
    public String getTerceroEfecto();

    /**
     * Devuelve la duración de los efectos de las manzanas.
     * @return Duración de los efectos de las manzanas.
     */
    public double getDuracionManzana();
    
}
