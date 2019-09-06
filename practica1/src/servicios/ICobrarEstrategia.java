package src.servicios;
import src.usuarios.Usuarios;

public interface ICobrarEstrategia {
    /**
     * Método que cobra al usuario dependiendo de su contrato.
     * @param usuario  Usuario al que se le va a realizar el cobro.
     * @param nombreDelServicio Nombre del servicio.
     */
    public double cobrar(Usuarios usuario, String nombreDelServicio);
}