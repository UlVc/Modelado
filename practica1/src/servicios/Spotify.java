package src.servicios;

public class Spotify implements Servicios {

    @Override
    public void cobrar() {
        System.out.println("Se ha cobrado 0.6 euros, gracias por preferirnos.");
    }

    @Override
    public void mandarMensaje() {
        System.out.println("Escucha la vieja canción de Slipknot, '555'");
    }

    @Override
    public void contratar(String contrato) {
        if (contrato == "gratis")
            System.out.println("Ha contratado Spotify gratis.");
        else
            System.out.println("Ha contratado Spotify premium.");
    }
}