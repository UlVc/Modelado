package src.servicios;
import java.util.ArrayList;
import java.util.Random;

public class Youtube implements Servicios {
    String usuario = "";
    Random numeroAleatorio;
    ArrayList<String> mensajes;

    public Youtube() {
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