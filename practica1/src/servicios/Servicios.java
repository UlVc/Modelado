package src.servicios;
import src.usuarios.Usuarios;
import java.util.ArrayList;
import java.util.Random;

/**
 * Clase de los servicios.
 */
public class Servicios implements Observador {
    private String nombreServicio;
    private String usuario;
    private Random numeroAleatorio;
    private ArrayList<String> mensajes;
    private ICobrarEstrategia cobrarEstrategia;

    /**
     * Constructor de la clase Servicios.
     * @param  nombreServicio nombre del servicio.
     */
    public Servicios(String nombreServicio, ArrayList<String> mensajes) {
        this.nombreServicio = nombreServicio;
        this.mensajes = mensajes;
        this.cobrarEstrategia = new CobrarEstrategia();
        this.numeroAleatorio = new Random();
    }

    public String getNombre() {
        return this.nombreServicio;
    }

    /**
     * Método que cobra al usuario dependiendo de su contrato.
     * @param usuario  Usuario al que se le va a realizar el cobro.
     */
    public void cobrar(Usuarios usuario) {
        if (this.usuario != "") {
            double saldoFinal = cobrarEstrategia.cobrar(usuario, nombreServicio);
            Contratos tipoDeContrato = usuario.getContrato(nombreServicio);
            if (saldoFinal > 0)
                System.out.println(usuario.getNombre() + ", se te ha cobrado la tarifa de " +
                                   nombreServicio + " para " + 
                                   tipoDeContrato.getContrato() + ". Total: $" + tipoDeContrato.getCosto() + 
                                   ". Buen día.");
            else {
                System.out.println("Saldo insuficiente, " + usuario.getNombre() + " se ha cancelado tu contrato de " + 
                                       nombreServicio + " para " + tipoDeContrato.getContrato() + ".");
            }
            usuario.setSaldo(saldoFinal);
        }
    }

    /**
     * Manda un mensaje personalizado al usuario que ha sido efectuado su pago o suscripción.
     */
    public void mandarMensajes() {
        if (this.usuario != "") {
            System.out.println(this.usuario + generadorAleatorioDeMensajes());
            this.usuario = "";
        }
    }

    /**
     * Método que verifica si un usuario aún puede usar los servicios dependiendo de su saldo.
     * @param saldoSuficiente indica si el usuario tiene saldo positivo.
     * @param nombre          nombre del usuario.
     */
    @Override
    public void actualizar(boolean saldoSuficiente, String nombre) {
        if (saldoSuficiente)
            this.usuario = nombre;
        else
            this.usuario = "";
    }

    /**
     * Método que manda el nombre del nuevo usuario al servicio contratado.
     * @param nombre          nombre del usuario.
     */
    @Override
    public void actualizarNuevoUsuario(String nombre) {
        this.usuario = nombre;
    }

    /**
     * Método que genera un mensaje aleatorio.
     * @return mensaje generado aleatoriamente.
     */
    private String generadorAleatorioDeMensajes() {
        return mensajes.get(numeroAleatorio.nextInt(5));
    }
}