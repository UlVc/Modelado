package src.producto.pociones.ingredientes;

import src.producto.pociones.Producto;

/**
 * Clase para ponerle verruga del nether a la pocion.
 */
public class VerrugaDelNether implements Producto {

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getIngredientes() {
        return "Verruga del Nether";
    }

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    @Override
    public double getTiempoDuracion() {
        return 0;
    }

}
