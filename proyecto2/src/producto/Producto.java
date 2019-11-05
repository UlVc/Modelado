package src.producto;

public abstract class Producto {

    /**
     * Devuelve los ingredientes del producto.
     * @return Ingredientes del producto.
     */
    public abstract String getIngredientes();

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    public abstract double getTiempoDuracion();

}
