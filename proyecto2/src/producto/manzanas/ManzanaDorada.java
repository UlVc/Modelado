package src.producto.manzanas;

/**
 * Clase para la manzana dorada.
 */
public class ManzanaDorada implements Manzana {

    /**
     * Devuelve el primer efecto que birnda la manzana.
     * @return Primero efecto que brinda la manzana.
     */
    @Override
    public String getPrimerEfecto() {
        return "Absorción";
    }

    /**
     * Devuelve el segundo efecto que birnda la manzana.
     * @return Segundo efecto que brinda la manzana.
     */
    @Override
    public String getSegundoEfecto() {
        return "Regeneración";
    }

    /**
     * Devuelve el tercer efecto que birnda la manzana.
     * @return Tercero efecto que brinda la manzana.
     */
    @Override
    public String getTerceroEfecto() {
        return "Velocidad";
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
