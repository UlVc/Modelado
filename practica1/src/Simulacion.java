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
        alicia.contratarServicio(netflix, Contratos.CUATRODISPOSITIVOS);
        alicia.contratarServicio(spotify, Contratos.SPOTIFYPREMIUM);
        alicia.contratarServicio(youtube, Contratos.YOUTUBEPREMIUM);
        alicia.contratarServicio(amazon, Contratos.AMAZONPREMIUM);

        netflix.mandarMensajes();
        spotify.mandarMensajes();
        youtube.mandarMensajes();
        amazon.mandarMensajes();

        bob.contratarServicio(netflix, Contratos.CUATRODISPOSITIVOS);
        bob.contratarServicio(spotify, Contratos.SPOTIFYPREMIUM);
        bob.contratarServicio(youtube, Contratos.YOUTUBEPREMIUM);
        bob.contratarServicio(amazon, Contratos.AMAZONPREMIUM);

        cesar.contratarServicio(spotify, Contratos.SPOTIFYPREMIUM);
        cesar.contratarServicio(youtube, Contratos.GRATIS);

        diego.contratarServicio(netflix, Contratos.DOSDISPOSITIVOS);
        diego.contratarServicio(amazon, Contratos.AMAZONPREMIUM);

        erika.contratarServicio(netflix, Contratos.CUATRODISPOSITIVOS);
        erika.contratarServicio(spotify, Contratos.GRATIS);
        erika.contratarServicio(youtube, Contratos.GRATIS);

    }
}