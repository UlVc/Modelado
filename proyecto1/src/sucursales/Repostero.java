package src.sucursales;

import src.maquinas.FabricaDulces;
import src.maquinas.Dulces;

/**
 * Clase para el repostero de cada sucursal.
 */
public class Repostero {

    /**
     * Método para hacer pedidos a la máquina Wonka 3000.
     * @param  nombreComida nombre del dulce deseado.
     * @return              dulce deseado.
     */
    public Dulces pedido(String nombreComida) {
        return FabricaDulces.getMaquina("wonka3000", nombreComida);
    }

}