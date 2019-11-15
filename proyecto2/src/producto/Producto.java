package src.producto;

public abstract class Producto {

    /**
     * Devuelve los ingredientes del producto.
     * @return Ingredientes del producto.
     */
    public abstract String getEfectos();

    /**
     * Devuelve el tiempo de duración del producto.
     * @return Tiempo de duración del producto.
     */
    public abstract double getTiempoDuracion();

    /**
     * Método en el cual se muestra todos los detalles del producto.
     */
    public void reporteFinal() {
        System.out.println("Efectos: " + getEfectos() + 
                           ". Duración: " + getTiempoDuracion() + " minutos");
    }

}
