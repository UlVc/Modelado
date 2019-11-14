package src.jugadores;

import java.util.Iterator;

import src.producto.Producto;

/**
 * Clase abstracta para guardar los datos de las sucursales..
 */
public abstract class Jugador {

    protected String id;

    /**
     * Regresa el Id de la sucursal.
     * @return Regresa el Id de la sucursal.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Devuelve el iterador del jugador.
     * @return iterador del jugador.
     */
    public abstract Iterator getIterador();

    /**
     * Método para agregar productos al inventario del jugador.
     */
    public abstract void agregarInventario(Producto producto);

    /**
     * Método para imprimir el inventario del jugador.
     */
    public abstract void imprimirInventario();

}
