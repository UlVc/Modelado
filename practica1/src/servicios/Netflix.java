package src.servicios;

public class Netflix implements Servicios {

    @Override
    public void cobrar() {
        System.out.println("Se ha cobrado mil millones de euros, gracias.");
    }

    @Override
    public void mandarMensaje() {
        System.out.println("Ve la nueva película Star Wars Episodio 90.");
    }

    @Override
    public void contratar(String contrato) {
        if (contrato == "1")
            System.out.println("Ha contratado Netflix para 1 dispositivo.");
        else if (contrato == "2")
            System.out.println("Ha contratado Netflix para 2 dispositivos.");
        else
            System.out.println("Ha contratado Netflix para 4 dispositivos.");
    }
}