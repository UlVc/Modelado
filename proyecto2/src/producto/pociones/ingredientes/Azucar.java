package src.producto.pociones;

/**
 * Clase para ponerle azúcar a la pocion.
 */
public class Azucar extends DecoradorPocion {

    /**
     * Constructor de la clase Azucar.
     * @param  pocion Poción a la que se le aplicará Azúcar.
     * @return        Pocion con Azúcar.
     */
    public Azucar(Producto pocion) {
        super(pocion);
    }

    /**
     * Devuelve los ingredientes que contiene la pocion.
     * @return Ingredientes de la pocion.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Azucar";
    }

}
