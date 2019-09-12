package src.estados;

public class Activarse implements Estados {
    PersonalDelRestaurante pdr = PersonalDelRestaurante();

    public void activarse(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
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