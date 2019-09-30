package src.sucursales;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class Sucursal3 extends Sucursal {

    private LinkedList<String> inventario;

    /**
     * Constructor de la clase SucursalesBBDD.
     * @param  id     id de la sucursal.
     * @param  direccion dirección de la sucursal.
     * @return        Un objeto de tipo SucursalesBBDD.
     */
    public Sucursal3(String id, String direccion) {
        inventario = new LinkedList<String>();
        this.id = id;
        this.direccion = direccion;
    }

    public Iterator getIterador() {
        return this.inventario.descendingIterator();
    }

    public void agregarInventario(ArrayList<String> inventario) {
        for (String s: inventario)
            this.inventario.add(s);
    }

}