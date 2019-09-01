package src.servicios;
import java.util.ArrayList;
import java.util.Random;

public class Amazon implements Servicios {
    ArrayList<String> usuariosActivos;
    Random numeroAleatorio;
    ArrayList<String> mensajes;

    public Amazon(){
        usuariosActivos = new ArrayList<String>();
        numeroAleatorio = new Random();
        mensajes = new ArrayList<String>();

        mensajes.add(", no te pierdas la serie 'Mr.Robot', sólo en Amazon.");
        mensajes.add(", un artículo de tu lista de deseos está en descuento.");
        mensajes.add(", aprovecha las ofertas que hay actualmente.");
        mensajes.add(", conoce a la familia 'echo'.");
        mensajes.add(", por $3 te llevas una sucripción de Twitch prime por 2 meses.");
        mensajes.add(", haz tu súper en Amazon.");
        mensajes.add(", disfruta de envíos rápidos.");
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