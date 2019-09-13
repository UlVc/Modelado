package src.estados;

import src.PersonalDelRestaurante;

/**
 * Clase del estado de activarse.
 */
public class Activarse implements Estados {
    PersonalDelRestaurante pdr;

    /**
     * Constructor de la clase Activarse.
     * @param  pdr Personal del restaurante.
     */
    public Activarse(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    /**
     * Activa a el personal.
     */
    @Override
    public void activarse() {
        System.out.println("Ya estoy activo, asigname una actividad.");
    }

    /**
     * Suspende a el personal.
     */
    @Override
    public void suspenderse() {
        pdr.asignarEstado(pdr.getEstadoSuspender());
    }

    /**
     * Pone a cocinar a el personal.
     */
    @Override
    public void cocinar() {
        System.out.println("Se ha asignado esta tarea");
        pdr.asignarEstado(pdr.getEstadoCocinar());
    }

    /**
     * Pone a atender a el personal.
     */
    @Override
    public void atender() {
        pdr.asignarEstado(pdr.getEstadoAtender());
        System.out.println("Hola, nuestro menú de hoy es:");
        pdr.imprimirMenu();
        System.out.println("\n¿Qué hamburguesa desea? Sólo digame el Id de la comida.");
        pdr.cocinar(0);
    }

    /**
     * Pone a caminar a el personal.
     */
    @Override
    public void caminar() {
        pdr.asignarEstado(pdr.getEstadoCaminar());
    }
}