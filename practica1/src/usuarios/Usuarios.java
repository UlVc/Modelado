package src.usuarios;

public class Usuarios {
    private String nombre;
    private double saldo;

    public Usuarios(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public void cobrar(double cobro) {
        this.saldo -= cobro;
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}