package src;

import src.producto.*;
import src.jugadores.*;

import java.util.Scanner;

/**
 * Clase para hacer la simulación del programa.
 */
public class Simulacion {

    public static void main(String []args) {
        
        BS2 maquina = new BS2();
        BS2Controlador maquinaControlador = new BS2Controlador(maquina, new BS2Vista());

        Jugador ulrich = new Ulrich();
        Jugador yael = new Yael();

        maquina.encender();

        int opcion = getJugador();
        Producto producto = maquina.preparar();

        if (opcion == 1)
            ulrich.agregarInventario(producto);
        else
            yael.agregarInventario(producto);

        maquinaControlador.updateView(producto);
    }

    /**
     * Método para seleccionar un jugador a entregar el producto.
     * @return Entero que simboliza qué jugador es al que se le enviará el producto.
     */
    private static int getJugador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿A quién deseas enviarle el producto?");
        System.out.println("1.- Ulrich");
        System.out.println("2.- Yael");
        try {
            int opcion = scanner.nextInt();

            if (opcion == 1)
                return 1;
            if (opcion == 2)
                return 2;
            if (opcion != 1 && opcion != 2)
                System.out.println("Introduzca un número válido.");
        } catch(Exception e) {
            System.out.println("¡Introduce solamente números!");
        }

        return getJugador();
    }

}
