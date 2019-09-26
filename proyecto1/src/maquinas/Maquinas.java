package src.maquinas;

import src.*;
import src.estados.*;

/**
 * Clase para generalizar las máquinas.
 * Basado en el principio del patrón de diseno Template.
 */
public abstract class Maquinas implements Sujeto {

    public ListaIngredientes ingredientes = new ListaIngredientes();
    private JefeTecnico jefe = new JefeTecnico();
    private Estados apagada;
    private Estados empacando;
    private Estados encendida;
    private Estados preparandoDulces;
    private Estados suspendida;
    private Estados estadoActual;

    public Maquinas() {
        this.apagada = new Apagada(this);
        this.empacando = new Empacando(this);
        this.encendida = new Encendida(this);
        this.preparandoDulces = new PreparandoDulces(this);
        this.suspendida = new Suspendida(this);
        this.estadoActual = this.suspendida;
    }

    /**
     * Método para preparar la receta.
     */
    public abstract void prepararReceta();

    /**
     * Método para elegir un molde.
     */
    public abstract void elegirMolde();

    /**
     * Método para poner la mezcla.
     */
    public abstract void ponerMezcla();

    /**
     * Método para agregar ingredientes extra.
     */
    public abstract void agregarIngredientesExtra();

    /**
     * Método que actualiza la cantidad del ingrediente.
     * @param ingrediente ingrediente del cual se agotó en la máquina.
     */
    @Override
    public void notificar(String ingrediente, ListaIngredientes ingredientes) {
        jefe.actualizar(ingrediente, ingredientes);
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
     */
    public void empacar() {
        estadoActual.empacar();
    }

    /**
     * Activar la máquina.
     */
    public void activar() {
        estadoActual.activar();
    }

    /**
     * Preparar dulces.
     */
    public void prepararDulces() {
        estadoActual.prepararDulce();
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

}