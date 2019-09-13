package src;

import src.estados.*;
import src.comida.*;
import java.util.Iterator;

/**
 * Clase para el manejo del personal del restaurante.
 */
public class PersonalDelRestaurante {
    Estados atender;
    Estados cocinar;
    Estados caminar;
    Estados suspender;
    Estados activarse;
    Estados estadoActual;

    Menu hamburguesas;
    Menu hamburguesasGustoGerente;

    public PersonalDelRestaurante(Menu hamburguesas, Menu hamburguesasGustoGerente) {
        this.atender = new Atender(this);
        this.cocinar = new Cocinar(this);
        this.caminar = new Caminar(this);
        this.suspender = new Suspendido(this);
        this.activarse = new Activarse(this);
        this.estadoActual = this.suspender;

        this.hamburguesas = hamburguesas;
        this.hamburguesasGustoGerente = hamburguesasGustoGerente;
    }

    /**
     * Asigna un nuevo estado.
     * @param nuevoEstado nuevo estado a asignar.
     */
    public void asignarEstado(Estados nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    /**
     * Devuelve el estado de atender.
     * @return estado de atender.
     */
    public Estados getEstadoAtender() {
        return atender;
    }

    /**
     * Devuelve el estado de cocinar.
     * @return estado de cocinar.
     */
    public Estados getEstadoCocinar() {
        return cocinar;
    }

    /**
     * Devuelve el estado de caminar
     * @return estado de caminar.
     */
    public Estados getEstadoCaminar() {
        return caminar;
    }

    /**
     * Devuelve el estado de suspender.
     * @return estado de suspender.
     */
    public Estados getEstadoSuspender() {
        return suspender;
    }

    /**
     * Devuelve el estado de activarse.
     * @return estado de activarse.
     */
    public Estados getEstadoActivarse() {
        return activarse;
    }

    /**
     * Imprime el menú.
     */
    public void imprimirMenu() {
        Iterator hamburguesasIterator = hamburguesas.crearIterador();
        Iterator hamburguesasGustoGerenteIterator = hamburguesasGustoGerente.crearIterador();

        System.out.println("---Hamburguesas---" + "\n");
        printItems(hamburguesasIterator);
        System.out.println("\n" + "*** Hamburguesas de hoy ***" + "\n");
        printItems(hamburguesasGustoGerenteIterator);
    }

    /**
     * Imprime los submenús dado un iterador.
     * @param iterator iterador para recorrer los submenús.
     */
    public void printItems(Iterator iterator) {
        while (iterator.hasNext()) {
            ItemMenu itemMenu = (ItemMenu)iterator.next();
            System.out.println(itemMenu.getNombre() + ", " +
                   itemMenu.getDescripcion());
        }
    }
}