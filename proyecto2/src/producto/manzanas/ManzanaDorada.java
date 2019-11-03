package src.producto.manzanas;

/**
 * Clase para la manzana dorada.
 */
public class ManzanaDorada implements Manzana {

    /**
     * Devuelve los efectos que birnda la manzana.
     * @return Efectos que brinda la manzana.
     */
    @Override
    public String getEfectoPociones() {
        return "Regeneración y Fuerza."
    }

    /**
     * Devuelve la duración de los efectos de las manzanas.
     * @return Duración de los efectos de las manzanas.
     */
    @Override
    public double getDuracionManzana() {
        return 6.5;
    }
    
}
