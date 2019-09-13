package src.estados;

import src.PersonalDelRestaurante;

public class Atender implements Estados {
    PersonalDelRestaurante pdr;

    public Atender(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    @Override
    public void activarse() {
        System.out.println("¡Ya estoy activo!");
    }

    @Override
    public void suspenderse() {
        System.out.println("NO puedo suspenderme, estoy atendiendo a un cliente!");
    }

    @Override
    public void cocinar() {
        // Si tengo la orden del cliente -> cocinar()
        System.out.println("Cocinando, ya tengo la orden del cliente.");
        pdr.asignarEstado(pdr.getEstadoCocinar());
    }

    @Override
    public void atender() {
        System.out.println("Ya estoy atendiendo");
    }

    @Override
    public void caminar() {
        System.out.println("NO puedo caminar, estoy atendiendo a un cliente!");
    }
}