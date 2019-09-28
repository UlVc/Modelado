package src.sucursales;

import src.maquinas.FabricaMaquinas;
import src.maquinas.Maquinas;

/**
 * Clase para el repostero de cada sucursal.
 */
public class Repostero {

    /**
     * Método para hacer pedidos a la máquina Wonka 3000.
     * @param  nombreComida nombre del dulce deseado.
     * @return              dulce deseado.
     */
    public Maquinas pedido(String nombreComida) {
        return FabricaMaquinas.getMaquina("wonka3000", nombreComida);
    }

}