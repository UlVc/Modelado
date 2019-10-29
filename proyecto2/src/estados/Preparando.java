package src.estados;

import src.BS2;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * Clase para el estado Preparando.
 */
public class Preparando implements Estados {
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
    	System.out.println("Ya estoy encendida.");
    	
    }

    /**
     * Apaga la maquina
     */
    @Override
    public void apagarse() {
    	System.out.println("No es posible apagarse, estoy preparando productos.");
    }

    /**
     * Apaga la maquina
     */
    @Override
    public void prepararProducto() {
        System.out.println("Ya se esta creando el producto, sea paciente.");
    }
}