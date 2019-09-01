package src.servicios;
import java.util.ArrayList;
import java.util.Random;

public class Spotify implements Servicios {
    String usuario = "";
    Random numeroAleatorio;
    ArrayList<String> mensajes;

    public Spotify() {
        numeroAleatorio = new Random();
        mensajes = new ArrayList<String>();

        mensajes.add(", no te pierdas de la discografía completa de Arch Enemy, sólo en Spotify.");
        mensajes.add(", no te pierdas de la discografía completa de Slipknot, sólo en Spotify.");
        mensajes.add(", te sugerimos que escuches el nuevo solo de Jimi Hendrix.");
        mensajes.add(", muy pronto tendremos el albúm de Metallica, ¡no te lo pierdas!");
        mensajes.add(", te sugerimos que escuches la nueva canción de Megadeth, '1000 times goodbye'.");
        mensajes.add(", te sugerimos que escuches el nuevo albúm Slipknot, 'We Are Not Your Kind'.");
        mensajes.add(", te sugerimos que escuches el viejo albúm que rompió récords de Slipknot, 'Slipknot'.");
    }

    @Override
    public void mandarMensajes() {
        if (this.usuario != "")
            System.out.println(this.usuario + generadorAleatorioDeMensajes());
        this.usuario = "";
    }

    @Override
    public void actualizar(boolean saldoSuficiente, String nombre) {
        if (saldoSuficiente)
            this.usuario = nombre;
        else
            this.usuario = "";
    }

    private String generadorAleatorioDeMensajes() {
        return mensajes.get(numeroAleatorio.nextInt(5));
    }
}