package src.estados;

import src.PersonalDelRestaurante;

public class Caminar implements Estados {
    PersonalDelRestaurante pdr;

    public Caminar(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    public void activarse() {
        System.out.println("¡Ya estoy activo!");
    }

    public void suspenderse() {
        System.out.println("Me he suspendido.");
        pdr.asignarEstado(pdr.getEstadoSuspender());
    }

    public void cocinar() {
        System.out.println("NO puedo cocinar mientras estoy caminando, es peligroso!");
    }

    public void atender() {
        System.out.println("Hola, ¿en qué lo puedo ayudar?");
    }

    public void caminar() {
        System.out.println("Ya estoy caminando.");
    }
}