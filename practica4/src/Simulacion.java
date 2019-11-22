package src;

import src.autos.*;

/**
 * Clase para hacer la simulación del programa.
 */
public class Simulacion {

    public static void main(String []args) {
        AutoBuilder autoBuilder = new AutoBuilder();

        AutoMadMax auto = autoBuilder.prepararCoche();

      	System.out.println("Coche Mad Max");
      	auto.estadisticas();

    }

}
