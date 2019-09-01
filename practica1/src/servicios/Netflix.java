package src.servicios;
import java.util.ArrayList;
import java.util.Random;

public class Netflix implements Servicios {
    ArrayList<String> usuariosActivos;
    Random numeroAleatorio;
    ArrayList<String> mensajes;

    public Netflix(){
        usuariosActivos = new ArrayList<String>();
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
        for (String s: usuariosActivos) {
            System.out.println(s + generadorAleatorioDeMensajes());
        }
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