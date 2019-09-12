package src;
import src.estados.*;

public class PersonalDelRestaurante {
    Estados atender;
    Estados cocinar;
    Estados caminar;
    Estados suspender;
    Estados activarse;

    Estados estadoActual;

    public PersonalDelRestaurante() {
        atender = new Atender(this);
        cocinar = new Cocinar(this);
        caminar = new Caminar(this);
        suspender = new Suspendido(this);
        activarse = new Activarse(this);

        estadoActual = suspender();
    }

    public void asignarEstado(Estados nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public Estados getEstadoAtender() {
        return atender;
    }

    public Estados getEstadoCocinar() {
        return cocinar;
    }

    public Estados getEstadoCaminar() {
        return caminar;
    }

    public Estados getEstadoSuspender() {
        return suspender;
    }

    public Estados getEstadoActivarse() {
        return activarse;
    }
}