package src;

import src.estados.*;

import src.producto.*;
import src.producto.pociones.*;
import src.producto.pociones.ingredientes.*;
import src.producto.manzanas.*;

import java.util.Scanner;

/**
 * Clase para el usuario.
 */
public class BS2 {

    private Estados estadoActual;
    private Estados apagar;
    private Estados encender;
    private Estados preparar;

    private Producto producto;

    public BS2() {
        this.encender = new Encendida(this);
        this.preparar = new Preparando(this);
        this.apagar = new Apagada(this);
        this.estadoActual = this.apagar;
    }

    /**
     * Método para encender la máquina
     */
    public void encender() {
        estadoActual.encenderse();
    }

    /**
     * Método para apagar la máquina
     */
    public void apagar() {
        estadoActual.apagarse();
    }

    public String getEfectos() {
        return this.producto.getIngredientes();
    }

    public double getDuracion() {
        return this.producto.getTiempoDuracion();
    }

    /**
     * Método para que la máquina le pregunte al usuario qué producto fabricar.
     * @return Producto fabricado.
     */
    public Producto preparar() {
        if (estadoActual.prepararProducto()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.- Manzanas con efectos de pocion.");
            System.out.println("2.- Pocion.");
            try {
                int opcion = scanner.nextInt();

                if (opcion == 1) {
                    Manzana manzana = prepararManzana();
                    Producto manzanaAdaptada = new AdaptadorManzanas(manzana);
                    this.producto = manzanaAdaptada;
                }
                if (opcion == 2) {
                    Producto pocion = new VerrugaDelNether();
                    this.producto = prepararPocion(pocion);
                }
                if (opcion != 1 && opcion != 2)
                    System.out.println("Introduzca un número válido.");
            } catch(Exception e) {
                System.out.println("¡Introduce solamente números!");

                preparar();
            }

            return this.producto;
        }

        return null;
    }

    /**
     * Método para escoger el ingrediente que se le pondrá a la pocion.
     * @return Tipo de ingrediente para la pocion.
     */   
    private Producto prepararPocion(Producto pocion) {
        Scanner scanner = new Scanner(System.in);
        int contadorAzucar = 0, contadorLagrimaGhast = 0, contadorPataConejo = 0, 
            contadorPolvoDeBlaze = 0, contadorRedStone = 0, contadorMembranaFantasma = 0;

        while(true) {
            System.out.println("Seleccione el número correspondiente al " +
                               "ingrediente deseado:");
            System.out.println("1.- Azúcar");
            System.out.println("2.- Lagrima de ghast");
            System.out.println("3.- Pata de conejo");
            System.out.println("4.- Polvo de blaze");
            System.out.println("5.- Acelerador");
            System.out.println("6.- Membrana de fantasma");
            System.out.println("En caso de ya haber escogido sus ingredientes," + 
                               " presione el número 0.");

            try {
                int opcion = scanner.nextInt();
                if (opcion == 1) {
                    if (contadorAzucar < 1) {
                        pocion = new Azucar(pocion);
                        contadorAzucar += 1;
                    } else
                        System.out.println("Sólo se puede aplicar una vez la azúcar.");
                }
                if (opcion == 2) {
                    if (contadorLagrimaGhast < 1) {
                        pocion = new LagrimaGhast(pocion);
                        contadorLagrimaGhast += 1;
                    } else
                        System.out.println("Sólo puede aplicar una vez la Lagrima de Ghast.");
                }
                if (opcion == 3) {
                    if (contadorPataConejo < 1) {
                        pocion = new PataConejo(pocion);
                        contadorPataConejo += 1;
                    } else
                        System.out.println("Sólo puedes aplicar una vez la Pata de Conejo.");
                }
                if (opcion == 4) {
                    if (contadorPolvoDeBlaze < 1) {
                        pocion = new PolvoDeBlaze(pocion);
                        contadorPolvoDeBlaze += 1;
                    } else
                        System.out.println("Sólo puedes aplicar una vez el Polvo de Blaze.");                    
                }
                if (opcion == 5) {
                    if (contadorRedStone < 1) {
                        pocion = new RedStone(pocion);
                        contadorRedStone += 1;
                    } else
                        System.out.println("Sólo puedes aplicar una vez la RedStone.");
                }
                if (opcion == 6) {
                    if (contadorMembranaFantasma < 1) {
                        pocion = new MembranaFantasma(pocion);
                        contadorMembranaFantasma += 1;
                    } else
                        System.out.println("Sólo puedes aplicar una vez la Membrana de Fantasma.");
                }
                if (opcion == 0)
                    break;
                if (opcion != 0 && opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && 
                    opcion != 5 && opcion != 6)
                    System.out.println("Introduzca un número válido.");
            } catch(Exception e) {
                System.out.println("¡Introduce solamente números!");

                return prepararPocion(pocion);
            }
        }

        return pocion;
    }

    /**
     * Método para escoger el tipo de manzana.
     * @return Tipo de manzana.
     */   
    private Manzana prepararManzana() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Seleccione el número correspondiente a la manzana deseada:");
            System.out.println("1.- Manzana Dorada");
            System.out.println("2.- Manzana de Notch.");
            System.out.println("3.- Ensenji");

            try {
                switch(scanner.nextInt()) {
                    case 1:
                        return new ManzanaDorada();
                    case 2:
                        return new ManzanaNotch();
                    case 3:
                        return new Ensenji();
                    default:
                        System.out.println("Seleccione un número válido.");
                }
            } catch(Exception e) {
                System.out.println("Introduce solamente números.");

                return prepararManzana();
            }
        }
    }

    /**
     * Devuelve el estado actual de la maquina.
     */
    public String getEstado() {
        return estadoActual.getClass().getSimpleName();
    }

    /**
     * Imprime el estado actual de la maquina.
     */
    public void imprimeEstado() {
        System.out.println("El estado en el que se encuentra la maquina es: " + 
                           estadoActual.getClass().getSimpleName());
    }

    /**
     * Asigna un nuevo estado.
     * @param nuevoEstado nuevo estado a asignar
     */
    public void asignarEstado(Estados nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    /**
     * Devuelve el estado de encendido.
     * @return estado de encendido
     */
    public Estados getEstadoEncender() {
        return encender;
    }

    /**
     * Devuelve el estado de apagado
     * @return estado de apagado
     */
    public Estados getEstadoApagar() {
        return apagar;
    }

    /**
     * Devuelve el estado de preparando
     * @return estado de preparando
     */
    public Estados getEstadoPreparar() {
        return preparar;
    }

}
