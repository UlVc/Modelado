package src.servicios;
import java.util.ArrayList;
import java.util.Random;

public class Youtube implements Servicios {
    ArrayList<String> usuariosActivos;
    Random numeroAleatorio;
    ArrayList<String> mensajes;

    public Youtube(){
        usuariosActivos = new ArrayList<String>();
        numeroAleatorio = new Random();
        mensajes = new ArrayList<String>();

        mensajes.add(", no te pierdas del streaming de tu YouTuber favorito.");
        mensajes.add(", te sugerimos que veas a PewDiePie.");
        mensajes.add(", Khan Academy acaba de subir un video.");
        mensajes.add(", te sugerimos que veas el canal de 3Blue1Brown.");
        mensajes.add(", te sugerimos que veas el nuevo teaser de la película Star Wars: Episodio IX");
        mensajes.add(", te sugerimos que veas a ElRichMC.");
        mensajes.add(", te sugerimos que veas el canal de Derivando.");
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