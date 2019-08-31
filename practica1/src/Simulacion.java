package src;
import src.servicios.*;
import src.usuarios.Usuarios;

public class Simulacion {
	static Netflix netflix = new Netflix();
    Spotify spotify = new Spotify();
    Youtube youtube = new Youtube();
    Amazon amazon = new Amazon();

    static Usuarios alicia = new Usuarios("Alicia", 500);
    Usuarios bob = new Usuarios("Bob", 40);
    Usuarios cesar = new Usuarios("César", 40);
    Usuarios diego = new Usuarios("Diego", 80);
    Usuarios erika = new Usuarios("Erika", 300);

    public static void main(String []args) {
    	alicia.enlazarObservador(netflix);
        alicia.cobrar(300);
    }
}