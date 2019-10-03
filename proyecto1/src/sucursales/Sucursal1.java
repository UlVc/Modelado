package src.sucursales;

import java.util.Iterator;
import java.util.ArrayList;
import src.maquinas.Dulces;

/**
 * Clase de la sucursal 2.
 */
public class Sucursal1 extends Sucursal {

    private ArrayList<Dulces> inventario = new ArrayList<Dulces>();

    /**
     * Constructor de la clase Sucursal1.
     * @param  id        id de la sucursal.
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
    public void agregarInventario(ArrayList<Dulces> inventario) {
        this.inventario.addAll(inventario);
        revisarInventario();
    }

    /**
     * Método para revisar el inventario, si falta algún dulce
     * se comunica con el repostero y lo repone usando la máquina Wonka3000.
     */
    public void revisarInventario() {
        ArrayList<String> inventarioCadena = new ArrayList<String>();

        for (Dulces d: this.inventario)
            inventarioCadena.add(d.getClass().getSimpleName());

        if (!inventarioCadena.contains("OsitosDulces"))
            this.inventario.add(repostero.pedido("OsitosDulces"));
        if (!inventarioCadena.contains("GusanosAcidos"))
            this.inventario.add(repostero.pedido("GusanosAcidos"));
        if (!inventarioCadena.contains("FrutasConChamoy"))
            this.inventario.add(repostero.pedido("FrutasConChamoy"));
        if (!inventarioCadena.contains("ChocolateConAlmendras"))
            this.inventario.add(repostero.pedido("ChocolateConAlmendras"));
        if (!inventarioCadena.contains("ChocolateConLeche"))
            this.inventario.add(repostero.pedido("ChocolateConLeche"));
        if (!inventarioCadena.contains("ChocolateOscuro"))
            this.inventario.add(repostero.pedido("ChocolateOscuro"));
    }
}