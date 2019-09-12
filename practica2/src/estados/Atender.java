package src.estados;

public class Atender implements Estados {
    PersonalDelRestaurante pdr = PersonalDelRestaurante();

    public void activarse() {
        System.out.println("¡Ya estoy activo!");
    }

    public void suspenderse() {
        System.out.println("NO puedo suspenderme, estoy atendiendo a un cliente!");
    }

    public void cocinar() {
        // Si tengo la orden del cliente -> cocinar()
        System.out.println("Cocinando, ya tengo la orden del cliente.");
        pdr.asignarEstado(pdr.getEstadoCocinar());
    }

    public void atender(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    public void caminar() {
        System.out.println("NO puedo caminar, estoy atendiendo a un cliente!");
    }
}