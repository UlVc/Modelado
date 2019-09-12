package src.estados;

public class Cocinar implements Estados {
    PersonalDelRestaurante pdr = PersonalDelRestaurante();

    public void activarse() {
        System.out.println("¡Ya estoy activo!");
    }

    public void suspenderse() {
        System.out.println("NO puedo suspenderme, estoy cocinando para un cliente!");
    }

    public void cocinar(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    public void atender() {
        System.out.println("No puedo atender, estoy cocinando.");
    }

    public void caminar() {
        System.out.println("NO puedo caminar, estoy cocinando!");
    }
}