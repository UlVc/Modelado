package src.estados;

import src.PersonalDelRestaurante;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * Clase del estado de activarse.
 */
public class Activo implements Estados {
    PersonalDelRestaurante pdr;

    /**
     * Constructor de la clase Activo.
     * @param  pdr Personal del restaurante.
     */
    public Activo(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    /**
     * Activa a el personal.
     */
    @Override
    public void activarse() {
        System.out.println("Ya estoy activo, asígname una actividad.");
    }

    /**
     * Suspende a el personal.
     */
    @Override
    public void suspenderse() {
        System.out.println("Suspendiendo...");
        pdr.asignarEstado(pdr.getEstadoSuspender());
    }

    /**
     * Pone a cocinar a el personal.
     */
    @Override
    public void cocinar() {
        System.out.println("Primero dime qué platillo deseas.");
    }

    /**
     * Pone a atender a el personal.
     */
    @Override
    public void atender() {
        pdr.asignarEstado(pdr.getEstadoAtender());
        System.out.println("\nHola, nuestro menú de hoy es:\n");
        pdr.imprimirMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n¿Qué hamburguesa desea? Sólo digame el Id de la comida.");
        try {
            int id = scanner.nextInt();
            pdr.cocinar(id);
        } catch(NoSuchElementException nsee) {
            System.out.println("\n¡Introduzca un número!\n");
            this.atender();
        }
    }

    /**
     * Pone a caminar a el personal.
     */
    @Override
    public void caminar() {
        System.out.println("Caminando...");
        pdr.asignarEstado(pdr.getEstadoCaminar());
    }
}