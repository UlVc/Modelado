package src;

import java.util.Scanner;

import src.baguette.*;
import src.baguette.ingredientes.*;
import src.pizza.*;

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
        Scanner scanner = new Scanner(System.in);

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
                int opcion = scanner.nextInt();
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

                return ponerIngredientes(baguette);
            }
        }

        return baguette;
    }

    private static Pizza listaDePizzas() {
        Scanner scanner = new Scanner(System.in);
        Pizza pizza;

        while(true) {
            System.out.println("Seleccione el número correspondiente a la pizza deseada:");
            System.out.println("1.- Pizza con queso chedar, jamón y masa delgada.       Precio: $71.6");
            System.out.println("2.- Pizza con queso manchego, salchicha y masa gruesa.  Precio: $73.3");
            System.out.println("3.- Pizza con queso chedar, pollo y masa gruesa.        Precio: $84.6");
            System.out.println("4.- Pizza con queso manchego, jamón y masa gruesa.      Precio: $78.6");
            System.out.println("5.- Pizza con queso manchego, pollo y masa delgada.     Precio: $87.5");

            try {
                switch(scanner.nextInt()) {
                    case 1:
                        pizza = new Pizza1();
                        return pizza;
                    case 2:
                        pizza = new Pizza2();
                        return pizza;
                    case 3:
                        pizza = new Pizza3();
                        return pizza;
                    case 4:
                        pizza = new Pizza4();
                        return pizza;
                    case 5:
                        pizza = new Pizza5();
                        return pizza;
                    default:
                        System.out.println("Seleccione un número válido.");
                }
            } catch(Exception e) {
                System.out.println("Introduce solamente números.");

                return listaDePizzas();
            }
        }
    }

    /**
     * Método que realiza la simulación.
     * @param []args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué comida desea que se prepare? Seleccione la opción que desea usando el número correspondiente.");
        System.out.println("1.- Baguette");
        System.out.println("2.- Pizza");

        try {
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                Baguette baguette = new BaguetteSimple();
                baguette = ponerIngredientes(baguette);
                imprimirTicket(baguette);
            } else if (opcion == 2) {
                Pizza pizza = listaDePizzas();
                Baguette pizzaAdaptada = new AdaptadorPizza(pizza);
                imprimirTicket(pizzaAdaptada);
            } else {
                System.out.println("Seleccione una opción válida.");
                main(args);
            }
        } catch(Exception e) {
            System.out.println("Introducir únicamente números.");
            main(args);
        }
    }
}