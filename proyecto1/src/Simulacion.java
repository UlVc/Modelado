package src;

import java.util.ArrayList;

import src.maquinas.*;
import src.maquinas.wonka3000.gomitas.*;
import src.maquinas.wonka3000.*;
import src.maquinas.galleneitor5000.galletas.*;

/**
 * Clase para hacer la simulación del programa.
 */
public class Simulacion {

    private static Maquina maquinas = new Maquina();
    private static ArrayList<String> dulcesEmpaquetados = new ArrayList<String>();
    private static JefeTecnico jefeTecnico = new JefeTecnico();

    public static void main(String []args) {
        dulcesEmpaquetados = maquinas.prepararDulces();
        System.out.println(dulcesEmpaquetados);
        maquinas.apagar();
        jefeTecnico.repartirLotes();
    }

}