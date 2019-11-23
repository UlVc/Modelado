package src.jugadores;

import java.util.Iterator;
import java.util.ArrayList;
import src.producto.Producto;

/**
 * Clase de la sucursal 2.
 */
public class Ulrich extends Jugador {

    private ArrayList<Producto> inventario;

    /**
     * Constructor de la clase Ulrich.
     */
    public Ulrich() {
        this.id = "Ulrich";
        this.inventario = new ArrayList<Producto>();
    }

    /**
     * Devuelve el iterador del inventario de Ulrich.
     * @return iterador del inventario.
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
    public void agregarInventario(Producto producto) {
        this.inventario.add(producto);
    }

    /**
     * Método para revisar el inventario, si falta algún dulce
     * se comunica con el repostero y lo repone usando la máquina Wonka3000.
     */
    @Override
    public void imprimirInventario() {
        int contador = 1;
        for (Producto p: this.inventario) {
            if (p != null) {
                System.out.println("Producto número " + contador + ":");
                p.reporteFinal();
                contador += 1;
            }
        }
    }
}
