package src.sucursales;

import java.util.Iterator;
import java.util.ArrayList;

public class Sucursal1 extends Sucursal {

    private ArrayList<String> inventario = new ArrayList<String>();

    /**
     * Constructor de la clase SucursalesBBDD.
     * @param  id     id de la sucursal.
     * @param  direccion dirección de la sucursal.
     * @return        Un objeto de tipo SucursalesBBDD.
     */
    public Sucursal1(String id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    public Iterator getIterador() {
        return this.inventario.iterator();
    }

    public void agregarInventario(ArrayList<String> inventario) {
        this.inventario.addAll(inventario);
    }
}