package src.servicios;
import java.util.ArrayList;
import java.util.Random;

public class Netflix implements Servicios {
    String usuario = "";
    Random numeroAleatorio;
    ArrayList<String> mensajes;

    public Netflix(){
        numeroAleatorio = new Random();
        mensajes = new ArrayList<String>();

        mensajes.add(", te sugerimos que veas Star Wars episodio XIII.");
        mensajes.add(", te sugerimos que veas Pulp Fiction.");
        mensajes.add(", te sugerimos que veas One punch man.");
        mensajes.add(", te sugerimos que veas el nuevo documental de History Channel, 'la vida de Dave Mustaine'.");
        mensajes.add(", te sugerimos que veas la nueva temporada de Daredevil, sólo en Netflix.");
        mensajes.add(", te sugerimos que veas la nueva temporada de 'La casa de papel', sólo en Netflix.");
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