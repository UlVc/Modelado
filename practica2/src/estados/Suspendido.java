package src.estados;

import src.PersonalDelRestaurante;

public class Suspendido implements Estados {
    PersonalDelRestaurante pdr;

    public Suspendido(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    public void activarse() {
        System.out.println("Activando...");
        pdr.asignarEstado(pdr.getEstadoActivarse());
    }

    public void suspenderse() {
        System.out.println("Ya estoy suspendido, activame!");
    }

    public void cocinar() {
        System.out.println("Primero activame.");
    }

    public void atender() {
        System.out.println("Primero activame.");
    }

    public void caminar() {
        System.out.println("Primero activame.");
    }
}