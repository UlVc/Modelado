package src.producto.manzanas;

/**
 * Clase para la manzana Ensenji.
 */
public class Ensenji implements Manzana {

    /**
     * Devuelve los efectos que birnda la manzana.
     * @return Efectos que brinda la manzana.
     */
    @Override
    public String getEfectoPociones() {
        return "Fuerza, regeneración y velocidad.";
    }

    /**
     * Devuelve la duración de los efectos de las manzanas.
     * @return Duración de los efectos de las manzanas.
     */
    @Override
    public double getDuracionManzana() {
        return 9999999;
    }
    
}
