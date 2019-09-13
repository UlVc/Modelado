package src.estados;

import src.PersonalDelRestaurante;

public class Cocinar implements Estados {
    PersonalDelRestaurante pdr;

    public Cocinar(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    @Override
    public void activarse() {
        System.out.println("¡Ya estoy activo!");
    }

    @Override
    public void suspenderse() {
        System.out.println("NO puedo suspenderme, estoy cocinando para un cliente!");
    }

    @Override
    public void cocinar() {
        System.out.println("Ya estoy cocinando, sea paciente.");
    }

    @Override
    public void atender() {
        System.out.println("No puedo atender, estoy cocinando.");
    }

    @Override
    public void caminar() {
        System.out.println("NO puedo caminar, estoy cocinando!");
    }
}