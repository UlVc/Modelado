package src;

import src.producto.*;

/**
 * Clase para hacer la simulación del programa.
 */
public class Simulacion {

    public static void main(String []args) {
        
        BS2 maquina = new BS2();
        BS2Vista maquinaVista = new BS2Vista();
        BS2Controlador maquinaControlador = new BS2Controlador(maquina, maquinaVista);

        maquina.encender();
        maquina.preparar();
        maquinaControlador.updateView();
    }

}
