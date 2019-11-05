package src.producto.manzanas;

import src.producto.Producto;

/**
 * Clase usando el patrón de diseño Adaptador.
 */
public class AdaptadorManzanas extends Producto {

    private Manzana manzana;

    /**
     * Constructor de la clase AdaptadorCarne.
     * @param  manzana Manzana a adaptar.
     * @return       Manzana ya adaptada.
     */
    public AdaptadorManzanas(Manzana manzana) {
        this.manzana = manzana;
    }

    /**
     * Devuelve los efectos que birnda la manzana.
     * @return Efectos que brinda la manzana.
     */
    @Override
    public String getIngredientes() {
        return manzana.getEfectoPociones();
    }

    /**
     * Devuelve la duración de los efectos de las manzanas.
     * @return Duración de los efectos de las manzanas.
     */
    @Override
    public double getTiempoDuracion() {
        return manzana.getDuracionManzana();
    }

}
