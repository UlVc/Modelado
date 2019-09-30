package src.sucursales;

import java.util.Iterator;
import java.util.Hashtable;
import java.util.ArrayList;

public class Sucursal2 extends Sucursal {

    private Hashtable<Integer, String> inventario = new Hashtable<Integer, String>();

    /**
     * Constructor de la clase SucursalesBBDD.
     * @param  id     id de la sucursal.
     * @param  direccion dirección de la sucursal.
     * @return        Un objeto de tipo SucursalesBBDD.
     */
    public Sucursal2(String id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    public Iterator getIterador() {
        return this.inventario.values().iterator();
    }

    public void agregarInventario(ArrayList<String> inventario) {
    	for (int i = 0; i < inventario.size(); i++)
    		this.inventario.put(i + this.inventario.size(), inventario.get(i));
    }
}