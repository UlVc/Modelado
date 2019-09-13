package src.estados;

import src.PersonalDelRestaurante;
import java.util.Scanner;

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
        System.out.println("Suspendiendo...");
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
        Scanner myObj = new Scanner(System.in);
        System.out.println("\n¿Qué hamburguesa desea? Sólo digame el Id de la comida.");
        int id = myObj.nextInt(); 
        pdr.cocinar(id);
    }

    /**
     * Pone a caminar a el personal.
     */
    @Override
    public void caminar() {
        pdr.asignarEstado(pdr.getEstadoCaminar());
    }
}