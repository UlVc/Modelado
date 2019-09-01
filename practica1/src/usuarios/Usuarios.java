package src.usuarios;
import java.util.*;
import src.servicios.*;

public class Usuarios implements Sujeto {
    private String nombre;
    private double saldo;
    private ArrayList<Servicios> serviciosContratados;
    private Hashtable<String, Contratos> contratosDeLosServicios;
    private boolean saldoSuficiente;

    public Usuarios(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        if (saldo > 0)
            this.saldoSuficiente = true;
        else
            this.saldoSuficiente = false;
        serviciosContratados = new ArrayList<Servicios>();
        contratosDeLosServicios = new Hashtable<String, Contratos>();
    }

    @Override
    public void notificar(boolean saldoSuficiente) {
        for (Servicios s: this.serviciosContratados)
            s.actualizar(saldoSuficiente, this.nombre);
    }

    public void cobrar(Servicios s) {
        try {
            double saldoDespuesDelCobro = this.saldo - getCobro(s);
            if (saldoDespuesDelCobro < 0) {
                System.out.println("Saldo insuficiente, " + this.nombre + " se ha cancelado tu contrato de " + 
                                   s.getClass().getSimpleName() + " para " + getContrato(s) + ".");
                this.saldoSuficiente = false;
                notificar(this.saldoSuficiente);
                removerContrato(s);
            } else {
                this.saldo = saldoDespuesDelCobro;
                System.out.println(this.nombre + ", se te ha cobrado la tarifa de " +
                                   s.getClass().getSimpleName() + " para " + 
                                   getContrato(s) + ". Total: $" + getCobro(s) + 
                                   ". Buen día.");
                notificar(this.saldoSuficiente);
            }
        } catch(NullPointerException npe) {}
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void cambiarContrato(Servicios s, Contratos contrato) {
        removerContrato(s);
        contratarServicio(s, contrato);
    }

    public void removerContrato(Servicios s) {
        this.contratosDeLosServicios.remove(s.getClass().getSimpleName());
        this.serviciosContratados.remove(s);
    }

    public void contratarServicio(Servicios s, Contratos contrato) {
        this.serviciosContratados.add(s);
        this.contratosDeLosServicios.put(s.getClass().getSimpleName(), contrato);
        System.out.println("Bienvenid@ " + this.nombre + " al servicio de " + 
                           s.getClass().getSimpleName() + " para " + 
                           contrato.getContrato() + ".");
        notificar(this.saldoSuficiente);
    }

    private String getContrato(Servicios s) {
        return this.contratosDeLosServicios.get(s.getClass()
                .getSimpleName()).getContrato();
    }

    private double getCobro(Servicios s) {
        return this.contratosDeLosServicios.get(s.getClass()
                .getSimpleName()).getCosto();
    }
}