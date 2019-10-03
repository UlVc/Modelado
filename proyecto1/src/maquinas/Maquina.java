package src.maquinas;

import java.util.ArrayList;

import src.*;
import src.estados.*;

/**
 * Clase para generalizar las máquinas.
 * Hecha para el uso del patrón de diseño State.
 */
public class Maquina {

    private Estados apagada;
    private Estados empacando;
    private Estados encendida;
    private Estados preparandoDulces;
    private Estados suspendida;
    private Estados estadoActual;

    private static Maquinas ososDulces = FabricaMaquinas.getMaquina("wonka3000", "OsitosDulces");
    private static Maquinas gusanosAcidos = FabricaMaquinas.getMaquina("wonka3000", "GusanosAcidos");
    private static Maquinas frutasChamoy = FabricaMaquinas.getMaquina("wonka3000", "FrutasConChamoy");
        
    private static Maquinas chocolateAlmendras = FabricaMaquinas.getMaquina("wonka3000", "ChocolateConAlmendras");
    private static Maquinas chocolateLeche = FabricaMaquinas.getMaquina("wonka3000", "ChocolateConLeche");
    private static Maquinas chocolateOscuro = FabricaMaquinas.getMaquina("wonka3000", "ChocolateOscuro");

    private static Maquinas galletasChispas = FabricaMaquinas.getMaquina("Galleneitor5000", "GalletasChispas");
    private static Maquinas galletasMermelada = FabricaMaquinas.getMaquina("Galleneitor5000", "GalletasMermelada");
    private static Maquinas galletasSaladas = FabricaMaquinas.getMaquina("Galleneitor5000", "GalletasSaladas");

    public Maquina() {
        this.apagada = new Apagada(this);
        this.empacando = new Empacando(this);
        this.encendida = new Encendida(this);
        this.preparandoDulces = new PreparandoDulces(this);
        this.suspendida = new Suspendida(this);
        this.estadoActual = this.suspendida;
    }

    /**
     * Asigna un nuevo estado.
     * @param nuevoEstado nuevo estado a asignar.
     */
    public void asignarEstado(Estados nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    /**
     * Devuelve el estado actual de la máquina.
     */
    public String getEstado() {
        return estadoActual.getClass().getSimpleName();
    }

    /**
     * Devuelve el estado de apagar.
     * @return estado de apagada.
     */
    public Estados getEstadoApagada() {
        return apagada;
    }

    /**
     * Devuelve el estado de empacar.
     * @return estado de empacando.
     */
    public Estados getEstadoEmpacando() {
        return empacando;
    }

    /**
     * Devuelve el estado de encender
     * @return estado de encendida.
     */
    public Estados getEstadoEncendida() {
        return encendida;
    }

    /**
     * Devuelve el estado de preparando dulces.
     * @return estado de preparando dulces.
     */
    public Estados getEstadoPrepararDulces() {
        return preparandoDulces;
    }

    /**
     * Devuelve el estado de activarse.
     * @return estado de activarse.
     */
    public Estados getEstadoSuspendida() {
        return suspendida;
    }

    /**
     * Apagar la máquina.
     */
    public void apagar() {
        estadoActual.apagar();
    }

    /**
     * Poner a empacar la máquina.
     * @return ArrayList de los dulces.
     */
    public ArrayList<Maquina> empacar() {
        estadoActual.empacar();

        ArrayList<Maquina> dulces = new ArrayList<Maquina>();

        dulces.add(ososDulces);
        dulces.add(gusanosAcidos);
        dulces.add(frutasChamoy);

        dulces.add(chocolateAlmendras);
        dulces.add(chocolateLeche);
        dulces.add(chocolateOscuro);

        dulces.add(galletasChispas);
        dulces.add(galletasMermelada);
        dulces.add(galletasSaladas);

        this.estadoActual = this.suspendida;

        return dulces;
    }

    /**
     * Activar la máquina.
     */
    public void activar() {
        estadoActual.activar();
    }

    /**
     * Método para preparar dulces.
     * @return ArrayList de los dulces.
     */
    public ArrayList<Maquina> prepararDulces() {
        if (estadoActual.prepararDulce()) {
            ososDulces.prepararReceta();
            gusanosAcidos.prepararReceta();
            frutasChamoy.prepararReceta();

            chocolateAlmendras.prepararReceta();
            chocolateLeche.prepararReceta();
            chocolateOscuro.prepararReceta();

            galletasChispas.prepararReceta();
            galletasMermelada.prepararReceta();
            galletasSaladas.prepararReceta();

            return empacar();
        }

        return null;
    }

    /**
     * Suspender la máquina.
     */
    public void suspender() {
        estadoActual.suspenderse();
    }

    /**
     * Reabastece los ingredientes de la máquina.
     */
    public void reabastecer() {
        estadoActual.reabastecerIngredientes();
    }


    public void imprimirEstado() {
        System.out.println(estadoActual);
    }
}