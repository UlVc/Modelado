package src;
import src.servicios.*;
import src.usuarios.Usuarios;
import java.util.ArrayList;

/**
 * Clase que realiza la simulación.
 */
public class Simulacion {

    private static Servicios netflix;
    private static Servicios spotify;
    private static Servicios youtube;
    private static Servicios amazon;

    static Usuarios alicia = new Usuarios("Alicia", 500);
    static Usuarios bob = new Usuarios("Bob", 40);
    static Usuarios cesar = new Usuarios("César", 40);
    static Usuarios diego = new Usuarios("Diego", 80);
    static Usuarios erika = new Usuarios("Erika", 300);

    /**
     * Método que cobra al usuario con todos los servicios disponibles.
     * @param usuario usuario a cobrar.
     */
    public static void cobrarUsuario(Usuarios usuario) {
        netflix.cobrar(usuario);
    }

    public static void construirServicios() {
        ArrayList<String> mensajesNetflix = new ArrayList<String>();
        mensajesNetflix.add(", te sugerimos que veas Star Wars episodio XIII.");
        mensajesNetflix.add(", te sugerimos que veas Pulp Fiction.");
        mensajesNetflix.add(", te sugerimos que veas One punch man.");
        mensajesNetflix.add(", te sugerimos que veas el nuevo documental de History Channel, 'la vida de Dave Mustaine'.");
        mensajesNetflix.add(", te sugerimos que veas la nueva temporada de Daredevil, sólo en Netflix.");
        mensajesNetflix.add(", te sugerimos que veas la nueva temporada de 'La casa de papel', sólo en Netflix.");

        netflix = new Servicios("Netflix", mensajesNetflix);

        ArrayList<String> mensajesSpotify = new ArrayList<String>();
        mensajesSpotify.add(", no te pierdas de la discografía completa de Arch Enemy, sólo en Spotify.");
        mensajesSpotify.add(", no te pierdas de la discografía completa de Slipknot, sólo en Spotify.");
        mensajesSpotify.add(", te sugerimos que escuches el nuevo solo de Jimi Hendrix.");
        mensajesSpotify.add(", muy pronto tendremos el albúm de Metallica, ¡no te lo pierdas!");
        mensajesSpotify.add(", te sugerimos que escuches la nueva canción de Megadeth, '1000 times goodbye'.");
        mensajesSpotify.add(", te sugerimos que escuches el nuevo albúm Slipknot, 'We Are Not Your Kind'.");
        mensajesSpotify.add(", te sugerimos que escuches el viejo albúm que rompió récords de Slipknot, 'Slipknot'.");

        spotify = new Servicios("Spotify", mensajesSpotify);

        ArrayList<String> mensajesYoutube = new ArrayList<String>();
        mensajesYoutube.add(", no te pierdas del streaming de tu YouTuber favorito.");
        mensajesYoutube.add(", te sugerimos que veas a PewDiePie.");
        mensajesYoutube.add(", Khan Academy acaba de subir un video.");
        mensajesYoutube.add(", te sugerimos que veas el canal de 3Blue1Brown.");
        mensajesYoutube.add(", te sugerimos que veas el nuevo teaser de la película Star Wars: Episodio IX");
        mensajesYoutube.add(", te sugerimos que veas a ElRichMC.");
        mensajesYoutube.add(", te sugerimos que veas el canal de Derivando.");

        youtube = new Servicios("YouTube", mensajesYoutube);

        ArrayList<String> mensajesAmazon = new ArrayList<String>();
        mensajesAmazon.add(", no te pierdas la serie 'Mr.Robot', sólo en Amazon.");
        mensajesAmazon.add(", un artículo de tu lista de deseos está en descuento.");
        mensajesAmazon.add(", aprovecha las ofertas que hay actualmente.");
        mensajesAmazon.add(", conoce a la familia 'echo'.");
        mensajesAmazon.add(", por $3 te llevas una sucripción de Twitch prime por 2 meses.");
        mensajesAmazon.add(", haz tu súper en Amazon.");
        mensajesAmazon.add(", disfruta de envíos rápidos.");

        amazon = new Servicios("Amazon", mensajesAmazon);
    }

    /**
     * Método que realiza la simulación.
     * @param []args
     */
    public static void main(String []args) {
        construirServicios();
        alicia.contratarServicio(netflix, Contratos.CUATRODISPOSITIVOS);
        alicia.contratarServicio(spotify, Contratos.SPOTIFYPREMIUM);
        alicia.contratarServicio(youtube, Contratos.YOUTUBEPREMIUM);
        alicia.contratarServicio(amazon, Contratos.AMAZONPREMIUM);

    }
}