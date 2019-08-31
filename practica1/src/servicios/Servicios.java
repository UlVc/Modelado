package src.servicios;

public interface Servicios extends Observador {
    public void cobrar();
    public void mandarMensaje();
    public void contratar(String contrato);
}