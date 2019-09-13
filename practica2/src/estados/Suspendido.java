package src.estados;

import src.PersonalDelRestaurante;

/**
 * Clase del estado de Suspendido.
 */
public class Suspendido implements Estados {
    PersonalDelRestaurante pdr;

    /**
     * Constructor de la clase Suspendido.
     * @param  pdr Personal del restaurante.
     */
    public Suspendido(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    /**
     * Activa a el personal.
     */
    @Override
    public void activarse() {
        System.out.println("Activando...");
        pdr.asignarEstado(pdr.getEstadoActivarse());
    }

    /**
     * Suspende a el personal.
     */
    @Override
    public void suspenderse() {
        System.out.println("Ya estoy suspendido, activame!");
    }

    /**
     * Pone a cocinar a el personal.
     */
    @Override
    public void cocinar() {
        System.out.println("Primero activame.");
    }

    /**
     * Pone a atender a el personal.
     */
    @Override
    public void atender() {
        System.out.println("Primero activame.");
    }

    /**
     * Pone a caminar a el personal.
     */
    @Override
    public void caminar() {
        System.out.println("Primero activame.");
    }
}