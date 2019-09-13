package src.estados;

import src.PersonalDelRestaurante;

public class Activarse implements Estados {
    PersonalDelRestaurante pdr;

    public Activarse(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    public void activarse() {
        System.out.println("Ya estoy activo, asigname una actividad.");
    }

    public void suspenderse() {
        pdr.asignarEstado(pdr.getEstadoSuspender());
    }

    public void cocinar() {
        System.out.println("Se ha asignado esta tarea");
        pdr.asignarEstado(pdr.getEstadoCocinar());
    }

    public void atender() {
        pdr.asignarEstado(pdr.getEstadoAtender());
        System.out.println("Hola, nuestro menú de hoy es:");
        pdr.imprimirMenu();
        System.out.println("\n¿Qué hamburguesa desea? Sólo digame el Id de la comida.");
        pdr.cocinar(0);
    }

    public void caminar() {
        pdr.asignarEstado(pdr.getEstadoCaminar());
    }
}