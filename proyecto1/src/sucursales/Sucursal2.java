package src.sucursales;

import java.util.Iterator;
import java.util.Hashtable;
import java.util.ArrayList;

/**
 * Clase de la sucursal 2.
 */
public class Sucursal2 extends Sucursal {

    private Hashtable<Integer, String> inventario = new Hashtable<Integer, String>();

    /**
     * Constructor de la clase Sucursal2.
     * @param  id     id de la sucursal.
     * @param  direccion dirección de la sucursal.
     */
    public Sucursal2(String id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    /**
     * Devuelve el iterador de la sucursal.
     * @return iterador de la sucursal.
     */
    @Override
    public Iterator getIterador() {
        return this.inventario.values().iterator();
    }

    /**
     * Agrega productos al inventario actual.
     * @param inventario inventario a agregar.
     */
    @Override
    public void agregarInventario(ArrayList<String> inventario) {
        for (int i = 0; i < inventario.size(); i++)
            this.inventario.put(i + this.inventario.size(), inventario.get(i));
    }
}