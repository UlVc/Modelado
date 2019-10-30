package src.estados;

import src.BS2;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * Clase para el estado Encendida.
 */
public class Encendida implements Estados {
    private Maquina mqn;
    
    /**
     * Constructor de la clase Apagada.
     * @param  mqn Maquina
     */
    public Encendida(Maquina mqn) {
        this.mqn = mqn;
    }


    /**
     * Enciende la maquina
     */
    @Override
    public void encenderse() {
    	System.out.println("Encendida, lista para producir");
    	
    }

    /**
     * Apaga la maquina
     */
    @Override
    public void apagarse() {
    	System.out.println("Apagando");
    	this.mqn.asignarEstado(mqn.getEstadoApagar());
    	this.mqn.imprimeEstado();
    }

    /**
     * Apaga la maquina
     */
    @Override
    public void prepararProducto() {
        System.out.println("Pocion que desea hacer.");
    }
}