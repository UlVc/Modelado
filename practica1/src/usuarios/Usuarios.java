package src.usuarios;
import java.util.*;
import src.servicios.*;

/**
 * Clase de Usuarios.
 */
public class Usuarios implements Sujeto {
    private String nombre;
    private double saldo;
    private ArrayList<String> serviciosContratadosNombres;
    private ArrayList<Servicios> serviciosContratados;
    private Hashtable<String, Contratos> contratosDeLosServicios;
    private boolean saldoSuficiente;

    /**
     * Constructor de la clase Usuarios.
     * @param  nombre nombre del usuario.
     * @param  saldo  saldo del usuario.
     */
    public Usuarios(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        if (saldo > 0)
            this.saldoSuficiente = true;
        else
            this.saldoSuficiente = false;
        serviciosContratadosNombres = new ArrayList<String>();
        serviciosContratados = new ArrayList<Servicios>();
        contratosDeLosServicios = new Hashtable<String, Contratos>();
    }

    /**
     * Método que notifica a todos los servicios contratos 
     * si el saldo es suficiente para seguir con la suscripción.
     * @param saldoSuficiente Indica si el saldo es suficiente para 
     *                        seguir con la suscripción o no.
     */
    @Override
    public void notificar(boolean saldoSuficiente) {
        for (Servicios s: this.serviciosContratados)
            s.actualizar(saldoSuficiente, this.nombre);
    }

    public void notificarContrato(String nombre) {
        for (Servicios s: this.serviciosContratados)
            s.actualizarNuevoUsuario(nombre);
    }

    public void test() {
        System.out.println(serviciosContratados);
    }

    /**
     * Método que devuelve el nombre del usuario.
     * @return Devuelve el nombre del usuario.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método que consulta el saldo del usuario.
     * @return Saldo del usuario.
     */
    public double consultarSaldo() {
        return this.saldo;
    }

    /**
     * Método que consulta el nombre del usuario.
     * @return Nombre del usuario.
     */
    public String consultarNombre() {
        return this.nombre;
    }

    public ArrayList<Servicios> getServiciosContratados() {
        return serviciosContratados;
    }

    /**
     * Pone un nuevo saldo al usuario.
     * @param saldoNuevo nuevo saldo a poner.
     */
    public void setSaldo(double saldoNuevo) {
        this.saldo = saldoNuevo;
        if (saldoNuevo > 0)
            this.saldoSuficiente = true;
        else
            this.saldoSuficiente = false;
        notificar(this.saldoSuficiente);
    }

    /**
     * Método que cambia el tipo de contrato.
     * @param servicio Servicio a cambiar contrato.
     * @param contrato Nuevo contrato.
     */
    public void cambiarContrato(Servicios servicio, Contratos contrato) {
        removerContrato(servicio);
        contratarServicio(servicio, contrato);
    }

    /**
     * Quita el contrato de un servicio.
     * @param nombreServicio Nombre del servicio.
     */
    public void removerContrato(Servicios servicio) {
        String nombreServicio = servicio.getNombre();
        this.contratosDeLosServicios.remove(nombreServicio);
        this.serviciosContratadosNombres.remove(nombreServicio);
        this.serviciosContratados.remove(servicio);
    }

    /**
     * Método para contratar servicios.
     * @param servicio Servicio a contratar.
     * @param contrato Contrato deseado.
     */
    public void contratarServicio(Servicios servicio, Contratos contrato) {
        String nombreServicio = servicio.getNombre();
        this.serviciosContratadosNombres.add(nombreServicio);
        this.serviciosContratados.add(servicio);
        this.contratosDeLosServicios.put(nombreServicio, contrato);
        System.out.println("Bienvenid@ " + this.nombre + " al servicio de " + 
                           nombreServicio + " para " + 
                           contrato.getContrato() + ".");
        notificarContrato(this.nombre);
    }

    /**
     * Método que obtiene el contrato dado el nombre de un servicio.
     * @param  nombreServicio Nombre del servicio del cúal se busca el contrato.
     * @return                Contrato del servicio.
     */
    public Contratos getContrato(String nombreServicio) {
        return this.contratosDeLosServicios.get(nombreServicio);
    }
}