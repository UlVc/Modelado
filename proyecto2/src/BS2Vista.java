package src;

import src.jugadores.*;

/**
 * Clase para la vista de BS2.
 */
public class BS2Vista {

    /**
     * Imprime los detalles del producto.
     * @param producto Producto a imprimir detalles.
     */
    public void imprimirInformacionJugadores(Jugador p1, Jugador p2) {
        System.out.println("Inventario de los jugadores:");
        System.out.println("Inventario de " + p1.getId() + ":");
        p1.imprimirInventario();
        System.out.println("Inventario de " + p2.getId() + ":");
        p2.imprimirInventario();
    }

}
