package src;

import src.producto.*;

/**
 * Clase para hacer la simulación del programa.
 */
public class Simulacion {

    public static void main(String []args) {
        
        BS2 maquina = new BS2();
        BS2Controlador maquinaControlador = new BS2Controlador(maquina, new BS2Vista());

        maquina.encender();
        Producto pr = maquina.preparar();
        maquinaControlador.updateView(pr);
    }

}
