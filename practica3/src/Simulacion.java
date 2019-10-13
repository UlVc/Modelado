package src;

import java.util.Scanner;
import src.baguette.*;
import src.baguette.ingredientes.*;

/**
 * Clase que realiza la simulación.
 */
public class Simulacion {

    /**
     * Método para imprimir el ticket del baguette.
     * @param baguette baguette a imprimir su ticket.
     */
    private static void imprimirTicket(Baguette baguette) {
        System.out.println("Precio total: " + baguette.getPrecio()
                           + "; Ingredientes: " + baguette.getIngredientes() + ".");
    }

    /**
     * Método para poner ingredientes al baguette.
     * @param  baguette Baguette a poner ingredientes.
     * @return          Baguette con ingredientes.
     */
    private static Baguette ponerIngredientes(Baguette baguette) {
        Scanner reader = new Scanner(System.in);

        while(true) {
            System.out.println("Seleccione el número correspondiente al ingrediente deseado:");
            System.out.println("1.- Pollo");
            System.out.println("2.- Pepperoni");
            System.out.println("3.- Jamón");
            System.out.println("4.- Lechuga");
            System.out.println("5.- Jitomate");
            System.out.println("6.- Cebolla");
            System.out.println("7.- Mostaza");
            System.out.println("8.- Catsup");
            System.out.println("9.- Mayonesa");
            System.out.println("En caso de ya haber escogido sus ingredientes, presione el número 0.");

            try {
                int opcion = reader.nextInt();
                if (opcion == 1)
                    baguette = new ConPollo(baguette);
                if (opcion == 2)
                    baguette = new ConPepperoni(baguette);
                if (opcion == 3)
                    baguette = new ConJamon(baguette);
                if (opcion == 4)
                    baguette = new ConLechuga(baguette);
                if (opcion == 5)
                    baguette = new ConJitomate(baguette);
                if (opcion == 6)
                    baguette = new ConCebolla(baguette);
                if (opcion == 7)
                    baguette = new ConMostaza(baguette);
                if (opcion == 8)
                    baguette = new ConCatsup(baguette);
                if (opcion == 8)
                    baguette = new ConMayonesa(baguette);
                if (opcion == 0)
                    break;
            } catch(Exception e) {
                System.out.println("¡Introduce solamente números!");
            }
        }

        return baguette;
    }

    /**
     * Método que realiza la simulación.
     * @param []args
     */
    public static void main(String[] args) {
        Baguette baguette = new BaguetteSimple();
        baguette = ponerIngredientes(baguette);
        imprimirTicket(baguette);
    }
}