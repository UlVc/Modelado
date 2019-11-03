package src.producto.manzanas;

/**
 * Interfaza para los tipos de manzanas.
 */
public interface Manzana {

    /**
     * Devuelve los efectos que birnda la manzana.
     * @return Efectos que brinda la manzana.
     */
    public String getEfectoPociones();

    /**
     * Devuelve la duración de los efectos de las manzanas.
     * @return Duración de los efectos de las manzanas.
     */
    public double getDuracionManzana();
    
}
