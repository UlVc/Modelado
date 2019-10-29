package src.estados;

import src.BS2;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * Clase para el estado Apagada.
 */
public class Apagada implements Estados {
    private Maquina mqn;
    
    /**
     * Constructor de la clase Apagada.
     * @param  mqn Maquina
     */
    public Apagada(Maquina mqn) {
        this.mqn = mqn;
    }


    /**
     * Enciende la maquina
     */
    @Override
    public void encenderse() {
    	System.out.println("Encendiendo...");
    	this.mqn.asignarEstado(mqn.getEstadoEncender());
    	this.mqn.imprimeEstado();
    }

    /**
     * Apaga la maquina
     */
    @Override
    public void apagarse() {
        System.out.println("Ya estoy apagada.");
    }

    /**
     * Apaga la maquina
     */
    @Override
    public void prepararProducto() {
    	System.out.println("Máquina Apagada, si deseas que prepare un producto primero actívame.");
    }

}