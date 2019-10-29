package src;

import src.estados.*;
import src.producto.*;
import java.util.Iterator;

/**
 * Clase para el usuario.
 */
public class BS2 {
    private Estados estadoActual;
    private Estados apagar;
    private Estados encender;
    private Estados preparar;
    private Producto producto;

    /**
     * Método para encender la máquina
     */
    public void encender() {
   	    estadoActual.encenderse();
    }

    /**
     * Método para apagar la máquina
     */
    public void apagar() {
    	estadoActual.apagarse();
    }

    /**
     * Método para preparar la pocion. 
     */
    public void preparar() {  //aun entendiendo el funcionamiento
    	estadoActual.preparar();
    }

    /**
     * Devuelve el estado actual de la maquina.
     */
    public String getEstado() {
        return estadoActual.getClass().getSimpleName();
    }

    /**
     * Imprime el estado actual de la maquina.
     */
    public void imprimeEstado() {
        System.out.println("El estado en el que se encuentra la maquina es: " + 
                           estadoActual.getClass().getSimpleName());

    /**
     * Asigna un nuevo estado.
     * @param nuevoEstado nuevo estado a asignar
     */
    public void asignarEstado(Estados nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    /**
     * Devuelve el estado de encendido.
     * @return estado de encendido
     */
    public Estados getEstadoEncender() {
        return encender;
    }

    /**
     * Devuelve el estado de apagado
     * @return estado de apagado
     */
    public Estados getEstadoApagar() {
        return apagar;
    }

    /**
     * Devuelve el estado de preparando
     * @return estado de preparando
     */
    public Estados getEstadoPreparar() {
        return preparar;
    }

}