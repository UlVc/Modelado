package src.servicios;

public class Youtube implements Servicios {

    @Override
    public void cobrar() {
        System.out.println("Se han cobrado 2 euros, gracias por preferirnos.");
    }

    @Override
    public void mandarMensaje() {
        System.out.println("Ve el nuevo video de Vegeta777, basado en tus preferencias.");
    }

    @Override
    public void contratar(String contrato) {
        if (contrato == "gratis")
            System.out.println("Ha contratado YouTube gratis.");
        else
            System.out.println("Ha contratado YouTube premium.");
    }
}