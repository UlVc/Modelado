package src.sucursales;

import java.util.Iterator;
import java.util.ArrayList;
import src.maquinas.Maquina;

/**
 * Clase de la sucursal 2.
 */
public class Sucursal1 extends Sucursal {

    private ArrayList<Maquina> inventario = new ArrayList<Maquina>();

    /**
     * Constructor de la clase Sucursal1.
     * @param  id     id de la sucursal.
     * @param  direccion dirección de la sucursal.
     */
    public Sucursal1(String id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    /**
     * Devuelve el iterador de la sucursal.
     * @return iterador de la sucursal.
     */
    @Override
    public Iterator getIterador() {
        return this.inventario.iterator();
    }

    /**
     * Agrega productos al inventario actual.
     * @param inventario inventario a agregar.
     */
    @Override
    public void agregarInventario(ArrayList<Maquina> inventario) {
        this.inventario.addAll(inventario);
    }
}