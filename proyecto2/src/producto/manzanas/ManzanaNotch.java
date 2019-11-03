package src.producto.manzanas;

/**
 * Clase para la manzana de Notch.
 */
public class ManzanaNotch implements Manzana {

    /**
     * Devuelve los efectos que birnda la manzana.
     * @return Efectos que brinda la manzana.
     */
    @Override
    public String getEfectoPociones() {
        return "Regeneración, fuerza, absorción y resistencia contra el fuego."
    }

    /**
     * Devuelve la duración de los efectos de las manzanas.
     * @return Duración de los efectos de las manzanas.
     */
    @Override
    public double getDuracionManzana() {
        return 15;
    }
    
}
