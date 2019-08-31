package src.usuarios;
import java.util.ArrayList;
import src.servicios.Observador;

public class Usuarios implements Sujeto {
    private String nombre;
    private double saldo;
    private ArrayList<Observador> observadores;

    public Usuarios(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        observadores = new ArrayList<Observador>();
    }

    @Override
    public void notificar(double saldo) {
        for (Observador o: observadores) {
            o.actualizar(saldo);
        }
    }

    public void cobrar(double cobro) {
        this.saldo -= cobro;
        notificar(saldo);
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void enlazarObservador(Observador o) {
        observadores.add(o);
    }
}