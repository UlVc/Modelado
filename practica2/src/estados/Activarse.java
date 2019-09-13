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
        pdr.asignarEstado(pdr.getEstadoCocinar());
    }

    public void atender() {
        pdr.asignarEstado(pdr.getEstadoAtender());
    }

    public void caminar() {
        pdr.asignarEstado(pdr.getEstadoCaminar());
    }
}