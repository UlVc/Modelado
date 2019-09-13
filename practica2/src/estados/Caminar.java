package src.estados;

import src.PersonalDelRestaurante;

/**
 * Clase del estado de Caminar.
 */
public class Caminar implements Estados {
    PersonalDelRestaurante pdr;

    /**
     * Constructor de la clase Caminar.
     * @param  pdr Personal del restaurante.
     */
    public Caminar(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    /**
     * Activa a el personal.
     */
    @Override
    public void activarse() {
        System.out.println("¡Ya estoy activo!");
    }

    /**
     * Suspende a el personal.
     */
    @Override
    public void suspenderse() {
        System.out.println("Suspendiendo...");
        pdr.asignarEstado(pdr.getEstadoSuspender());
    }

    /**
     * Pone a cocinar a el personal.
     */
    @Override
    public void cocinar() {
        System.out.println("No puedo cocinar mientras estoy caminando, es peligroso!");
    }

    /**
     * Pone a atender a el personal.
     */
    @Override
    public void atender() {
        System.out.println("Hola, ¿en qué lo puedo ayudar?");
    }

    /**
     * Pone a caminar a el personal.
     */
    @Override
    public void caminar() {
        System.out.println("Ya estoy caminando.");
    }
}