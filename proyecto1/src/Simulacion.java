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

    private static Maquinas maquinas = new Maquinas();

    private static Maquinas ososDulces = FabricaMaquinas.getMaquina("wonka3000", "OsitosDulces");
    private static Maquinas gusanosAcidos = FabricaMaquinas.getMaquina("wonka3000", "GusanosAcidos");
    private static Maquinas frutasChamoy = FabricaMaquinas.getMaquina("wonka3000", "FrutasConChamoy");
        
    private static Maquinas chocolateAlmendras = FabricaMaquinas.getMaquina("wonka3000", "ChocolateConAlmendras");
    private static Maquinas chocolateLeche = FabricaMaquinas.getMaquina("wonka3000", "ChocolateConLeche");
    private static Maquinas chocolateOscuro = FabricaMaquinas.getMaquina("wonka3000", "ChocolateOscuro");

    private static Maquinas galletasChispas = FabricaMaquinas.getMaquina("Galleneitor5000", "GalletasChispas");
    private static Maquinas galletasMermelada = FabricaMaquinas.getMaquina("Galleneitor5000", "GalletasMermelada");
    private static Maquinas galletasSaladas = FabricaMaquinas.getMaquina("Galleneitor5000", "GalletasSaladas");

    private static ArrayList<Maquinas> dulcesEmpaquetados = new ArrayList<Maquinas>();

    public static void main(String []args) {
        prepararDulces();
        dulcesEmpaquetados = empaquetarDulces();
        ososDulces.activar();
    }

    /**
     * Método para preparar los dulces.
     */
    public static void prepararDulces() {
        ososDulces.prepararReceta();
        gusanosAcidos.prepararReceta();
        frutasChamoy.prepararReceta();

        chocolateAlmendras.prepararReceta();
        chocolateLeche.prepararReceta();
        chocolateOscuro.prepararReceta();

        galletasChispas.prepararReceta();
        galletasMermelada.prepararReceta();
        galletasSaladas.prepararReceta();
    }

    /**
     * Método para empacar los dulces.
     * @return dulces empacados en un ArrayList.
     */
    public static ArrayList<Maquinas> empaquetarDulces() {
        ArrayList<Maquinas> dulces = new ArrayList<Maquinas>();

        dulces.add(ososDulces);
        dulces.add(gusanosAcidos);
        dulces.add(frutasChamoy);

        dulces.add(chocolateAlmendras);
        dulces.add(chocolateLeche);
        dulces.add(chocolateOscuro);

        dulces.add(galletasChispas);
        dulces.add(galletasMermelada);
        dulces.add(galletasSaladas);
        

        return dulces;
    }
}