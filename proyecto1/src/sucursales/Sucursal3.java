package src.sucursales;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

/**
 * Clase de la sucursal 3.
 */
public class Sucursal3 extends Sucursal {

    private LinkedList<String> inventario;

    /**
     * Constructor de la clase Sucursal3.
     * @param  id     id de la sucursal.
     * @param  direccion dirección de la sucursal.
     */
    public Sucursal3(String id, String direccion) {
        inventario = new LinkedList<String>();
        this.id = id;
        this.direccion = direccion;
    }

    /**
     * Devuelve el iterador de la sucursal.
     * @return iterador de la sucursal.
     */
    @Override
    public Iterator getIterador() {
        return this.inventario.descendingIterator();
    }

    /**
     * Agrega productos al inventario actual.
     * @param inventario inventario a agregar.
     */
    @Override
    public void agregarInventario(ArrayList<String> inventario) {
        for (String s: inventario)
            this.inventario.add(s);
    }

}