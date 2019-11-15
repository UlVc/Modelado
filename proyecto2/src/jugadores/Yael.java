
package src.jugadores;

import java.util.Iterator;
import java.util.Hashtable;
import java.util.Enumeration;

import src.producto.Producto;

/**
 * Clase de la sucursal 2.
 */
public class Yael extends Jugador {

    private Hashtable<Integer, Producto> inventario;

    /**
     * Constructor de la clase Ulrich.
     */
    public Yael() {
        this.id = "Yael";
        this.inventario = new Hashtable<Integer, Producto>();
    }

    /**
     * Devuelve el iterador del inventario de Ulrich.
     * @return iterador del inventario.
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
    public void agregarInventario(Producto producto) {
        this.inventario.put(this.inventario.size(), producto);
    }

    /**
     * Método para revisar el inventario, si falta algún dulce
     * se comunica con el repostero y lo repone usando la máquina Wonka3000.
     */
    @Override
    public void imprimirInventario() {
        Enumeration e = this.inventario.elements();
        Producto pr = null;
        int contador = 1;

        while (e.hasMoreElements()) {
            System.out.println("Producto número " + contador + ":");
            pr = (Producto) e.nextElement();
            pr.reporteFinal();
            contador += 1;
        }
    }
}
