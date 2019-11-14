package src.estados;

import src.*;

/**
 * Clase para el estado Suspendida.
 */
public class Suspendida implements Estados {
    
    private BS2 maquina;
    
    /**
     * Constructor de la clase Suspendida.
     * @param  maquina Maquina
     */
    public Suspendida(BS2 maquina) {
        this.maquina = maquina;
    }


    /**
     * Enciende la máquina.
     */
    @Override
    public void encenderse() {
        System.out.println("Encendiendo...");
        this.maquina.asignarEstado(maquina.getEstadoEncender());
        this.maquina.imprimeEstado();
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
     * Pone a preparar productos a la máquina.
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
        System.out.println("Ya estoy suspendida.");
    }

}
