package src;
import src.servicios.*;
import src.usuarios.Usuarios;

public class Simulacion {
    static Netflix netflix = new Netflix();
    static Spotify spotify = new Spotify();
    static Youtube youtube = new Youtube();
    static Amazon amazon = new Amazon();

    static Usuarios alicia = new Usuarios("Alicia", 500);
    static Usuarios bob = new Usuarios("Bob", 40);
    static Usuarios cesar = new Usuarios("César", 40);
    static Usuarios diego = new Usuarios("Diego", 80);
    static Usuarios erika = new Usuarios("Erika", 300);

    public static void main(String []args) {
        System.out.println("Día 1");

        alicia.contratarServicio(netflix, Contratos.CUATRODISPOSITIVOS);
        alicia.contratarServicio(spotify, Contratos.SPOTIFYPREMIUM);
        alicia.contratarServicio(youtube, Contratos.YOUTUBEPREMIUM);
        alicia.contratarServicio(amazon, Contratos.AMAZONPREMIUM);

        mandarMensajes();

        bob.contratarServicio(netflix, Contratos.CUATRODISPOSITIVOS);
        bob.contratarServicio(spotify, Contratos.SPOTIFYPREMIUM);
        bob.contratarServicio(youtube, Contratos.YOUTUBEPREMIUM);
        bob.contratarServicio(amazon, Contratos.AMAZONPREMIUM);

        mandarMensajes();

        cesar.contratarServicio(spotify, Contratos.SPOTIFYPREMIUM);
        cesar.contratarServicio(youtube, Contratos.GRATIS);

        mandarMensajes();

        diego.contratarServicio(netflix, Contratos.DOSDISPOSITIVOS);
        diego.contratarServicio(amazon, Contratos.AMAZONPREMIUM);

        mandarMensajes();

        erika.contratarServicio(netflix, Contratos.CUATRODISPOSITIVOS);
        erika.contratarServicio(spotify, Contratos.GRATIS);
        erika.contratarServicio(youtube, Contratos.GRATIS);

        mandarMensajes();

        System.out.println("Día 2");

        cobrarUsuario(alicia);
        mandarMensajes();
        cobrarUsuario(bob);
        mandarMensajes();
        cobrarUsuario(diego);
        mandarMensajes();
        erika.cambiarContrato(spotify, Contratos.SPOTIFYPREMIUM);
        erika.cambiarContrato(youtube, Contratos.YOUTUBEPREMIUM);
        cobrarUsuario(erika);
        mandarMensajes();

        System.out.println("Día 3");

        cobrarUsuario(alicia);
        mandarMensajes();
        cobrarUsuario(bob);
        mandarMensajes();
        cobrarUsuario(diego);
        diego.contratarServicio(spotify, Contratos.GRATIS);
        mandarMensajes();
        erika.removerContrato(netflix);
        erika.cambiarContrato(amazon, Contratos.AMAZONPREMIUM);
        cobrarUsuario(erika);
        mandarMensajes();

        System.out.println("Día 4");

        cobrarUsuario(alicia);
        mandarMensajes();
        cobrarUsuario(bob);
        mandarMensajes();
        cobrarUsuario(diego);
        mandarMensajes();
        cobrarUsuario(erika);
        mandarMensajes();

        System.out.println("Día 5");

        cobrarUsuario(alicia);
        mandarMensajes();
        cobrarUsuario(bob);
        mandarMensajes();
        cobrarUsuario(diego);
        mandarMensajes();
        cobrarUsuario(erika);
        mandarMensajes();
    }

    public static void cobrarUsuario(Usuarios usuario) {
        System.out.println();
        usuario.cobrar(netflix);
        usuario.cobrar(spotify);
        usuario.cobrar(youtube);
        usuario.cobrar(amazon);
        System.out.println();
    }

    public static void mandarMensajes() {
        System.out.println();
        netflix.mandarMensajes();
        spotify.mandarMensajes();
        youtube.mandarMensajes();
        amazon.mandarMensajes();
        System.out.println();
    }
}