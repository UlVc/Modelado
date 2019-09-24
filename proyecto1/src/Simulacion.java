package src;

import src.maquinas.*;
import src.maquinas.wonka3000.gomitas.*;
import src.maquinas.galleneitor5000.galletas.*;

/**
 * Clase para hacer la simulación del programa.
 */
public class Simulacion {
    static Maquinas galletaSalada = new GalletasSaladas();
    static Maquinas osoDulce = new OsitosDulces();

    public static void main(String []args) {
        Maquinas osodulce = FabricaMaquinas.getMaquina("wonka3000", "OsitosDulces");
        Maquinas galletasMermelada = FabricaMaquinas.getMaquina("Galleneitor5000", "galletasMermelada");
        osodulce.prepararReceta();
        galletasMermelada.prepararReceta();
    }
}