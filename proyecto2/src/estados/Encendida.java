package src.estados;

import src.*;

/**
 * Clase para el estado Encendida.
 */
public class Encendida implements Estados {
    
    private BS2 maquina;
    
    /**
     * Constructor de la clase Apagada.
     * @param  maquina Maquina
     */
    public Encendida(BS2 maquina) {
        this.maquina = maquina;
    }


    /**
     * Enciende la máquina.
     */
    @Override
    public void encenderse() {
    	System.out.println("Ya estoy encendida, ¿qué deseas hacer?");
    }

    /**
     * Apaga la máquina.
     */
    @Override
    public void apagarse() {
        System.out.println("Apagando...");
        this.maquina.asignarEstado(maquina.getEstadoApagar());
    }

    /**
     * Pone a preparar un producto a la máquina.
     */
    @Override
    public boolean prepararProducto() {
        System.out.println("¿Qué producto deseas preparar?");
        this.maquina.asignarEstado(maquina.getEstadoPreparar());
        return true;
    }

    /**
     * Suspende la máquina.
     */
    @Override
    public void suspenderse() {
        System.out.println("Suspendiendo...");
        this.maquina.asignarEstado(maquina.getEstadoSuspender());
    }
}
