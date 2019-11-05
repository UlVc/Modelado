package src;

import src.producto.*;

/**
 * Clase para hacer la simulación del programa.
 */
public class Simulacion {

	private static BS2 maquina = new BS2();
	private static Producto pr;

    public static void main(String []args) {
        maquina.encender();
        pr = maquina.preparar();
        System.out.println(pr);
    }

}