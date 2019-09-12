package src.estados;

public class Suspendido implements Estados {
    PersonalDelRestaurante pdr = PersonalDelRestaurante();

    public void activarse() {
        System.out.println("Activando...");
        pdr.asignarEstado(pdr.getEstadoActivarse());
    }

    public void suspenderse(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
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