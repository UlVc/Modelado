package src.servicios;

public class Amazon implements Servicios {

    @Override
    public void cobrar() {
        System.out.println("Se ha cobrado 2 mil billones de euros, gracias por usar UlPrime.");
    }

    @Override
    public void mandarMensaje() {
        System.out.println("Compra el nuevo libro de Spivak sobre cómo visualizar n-dimensiones.");
    }

    @Override
    public void contratar(String contrato) {
        if (contrato == "normal")
            System.out.println("Ha contratado Amazon normal.");
        else
            System.out.println("Ha contratado Amazon premium.");
    }
}