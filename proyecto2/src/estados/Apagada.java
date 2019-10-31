package src.estados;

import src.BS2;

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
<<<<<<< HEAD
        System.out.println("Maquina Apagada, sin poder realizar ninguna acción");
=======
        System.out.println("Máquina Apagada, si deseas que prepare un producto primero actívame.");
>>>>>>> 6f01fa6be2a5956a83d80468d859d7c25c81714c
    }
}