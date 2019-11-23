package src;

import src.usuario.*;

/**
 * Clase para hacer la simulación del programa.
 */
public class Simulacion {

    public static void main(String []args) {
        Usuario usuario = new Usuario("Jugador 1", 500.40);

        usuario.comprarCoche();
        usuario.verCoche();

    }

}
