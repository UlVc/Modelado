package src.sucursales;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import src.maquinas.Maquina;

/**
 * Clase de la sucursal 3.
 */
public class Sucursal3 extends Sucursal {

    private LinkedList<Maquina> inventario;

    /**
     * Constructor de la clase Sucursal3.
     * @param  id     id de la sucursal.
     * @param  direccion dirección de la sucursal.
     */
    public Sucursal3(String id, String direccion) {
        inventario = new LinkedList<Maquina>();
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
    public void agregarInventario(ArrayList<Maquina> inventario) {
        for (Maquina s: inventario)
            this.inventario.add(s);
    }

}