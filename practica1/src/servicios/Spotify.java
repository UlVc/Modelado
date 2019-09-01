package src.servicios;
import java.util.ArrayList;
import java.util.Random;

public class Spotify implements Servicios {
    ArrayList<String> usuariosActivos;
    Random numeroAleatorio;
    ArrayList<String> mensajes;

    public Spotify(){
        usuariosActivos = new ArrayList<String>();
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
        for (String s: usuariosActivos)
            System.out.println(s + generadorAleatorioDeMensajes());
    }

    @Override
    public void actualizar(double saldo, String nombre) {
        if (saldo > 0) {
            if (!usuariosActivos.contains(nombre)) {
                usuariosActivos.add(nombre);
            }
        } else {
            if (usuariosActivos.contains(nombre))
                usuariosActivos.remove(nombre);
        }
    }

    private String generadorAleatorioDeMensajes() {
        return mensajes.get(numeroAleatorio.nextInt(5));
    }
}