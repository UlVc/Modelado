package src.producto.pociones.ingredientes;

import src.producto.pociones.Producto;

/**
 * Clase para ponerle verruga del nether a la pocion.
 */
public class VerrugaDelNether implements Producto {

    /**
     * Constructor de la clase VerrugaDelNether.
     * @param  pocion Pocion a la que se le aplicara Verruga Del Nether.
     * @return        Pocion con Verruga Del Nether.
     */
    public VerrugaDelNether(Producto pocion) {
        super(pocion);
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Verruga del Nether";
    }

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    @Override
    public double getTiempoDuracion() {
        return super.getTiempoDuracion() + 0;
    }

}
