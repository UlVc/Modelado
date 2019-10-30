package src.estados;

import src.BS2;

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
<<<<<<< HEAD
        System.out.println("No es posible apagarse");
=======
        System.out.println("No es posible apagarse, estoy preparando productos.");
>>>>>>> 6f01fa6be2a5956a83d80468d859d7c25c81714c
    }

    /**
     * Apaga la maquina
     */
    @Override
    public void prepararProducto() {
        System.out.println("Ya se esta creando el producto, sea paciente.");
    }
}