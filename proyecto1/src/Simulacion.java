package src;

import src.maquinas.*;

/**
 * Clase para hacer la simulación del programa.
 */
public class Simulacion {
    static GalletasSaladas ososDulces = new GalletasSaladas();

    public static void main(String []args) {
        ososDulces.prepararReceta();
    }
}