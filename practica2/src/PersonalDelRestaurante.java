package src;

import src.estados.*;
import src.comida.*;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Clase para el manejo del personal del restaurante.
 */
public class PersonalDelRestaurante {
    private Estados atender;
    private Estados cocinar;
    private Estados caminar;
    private Estados suspender;
    private Estados activarse;
    private Estados estadoActual;

    private Menu hamburguesas;
    private Menu hamburguesasGustoGerente;
    private Menu hamburguesasDeLujo;

    private ArrayList<Menu> menus;

    public PersonalDelRestaurante(Menu hamburguesas, Menu hamburguesasGustoGerente, Menu hamburguesasDeLujo) {
        this.atender = new Atender(this);
        this.cocinar = new Cocinar(this);
        this.caminar = new Caminar(this);
        this.suspender = new Suspendido(this);
        this.activarse = new Activarse(this);
        this.estadoActual = this.suspender;

        this.hamburguesas = hamburguesas;
        this.hamburguesasGustoGerente = hamburguesasGustoGerente;
        this.hamburguesasDeLujo = hamburguesasDeLujo;

        menus = new ArrayList<Menu>();

        menus.add(hamburguesas);
        menus.add(hamburguesasGustoGerente);
        menus.add(hamburguesasDeLujo);
    }

    /**
     * Método para hacer que el personal atienda.
     */
    public void atender() {
        estadoActual.atender();
    }

    /**
     * Método para hacer que el personal cocine.
     */
    public void cocinar(int id) {
        ItemMenu comidaSeleccionada = this.buscarComida(id);
        System.out.println("Ha seleccionado la siguiente comida: " + comidaSeleccionada.getNombre());
        estadoActual.cocinar();
        System.out.println("Poniendo pan");
        System.out.println("Poniendo mayonesa");
        System.out.println("Poniendo mostaza");
        if (!comidaSeleccionada.esVegatariana())
            System.out.println("Poniendo carne");
        if (!comidaSeleccionada.tieneQueso())
            System.out.println("Poniendo queso");
        System.out.println("Poniendo vegetales");
        System.out.println("Poniendo catsup");
        System.out.println("Poniendo pan");
        System.out.println("\nAquí está su hamburguesa, disfrutela.");
        this.estadoActual = this.suspender;
        
    }

    /**
     * Método para hacder que el personal se suspenda.
     */
    public void suspender() {
        estadoActual.suspenderse();
    }

    /**
     * Método para hacer que el personal se active.
     */
    public void activar() {
        estadoActual.activarse();
    }

    /**
     * Método para hacer caminar a el personal.
     */
    public void caminar() {
        System.out.println("Voy enseguida a atenderle.");
        estadoActual.caminar();
    }

    /**
     * Devuelve el estado actual del personal.
     */
    public void getEstado() {
        System.out.println(estadoActual.getClass().getSimpleName());
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
        Iterator hamburguesasDeLujoIterator = hamburguesasDeLujo.crearIterador();

        System.out.println("---Hamburguesas---" + "\n");
        printItems(hamburguesasIterator);
        System.out.println("\n" + "*** Hamburguesas de hoy ***" + "\n");
        printItems(hamburguesasGustoGerenteIterator);
        System.out.println("\n" + "$$$ Hamburguesas de lujo $$$" + "\n");
        printItems(hamburguesasDeLujoIterator);
    }

    /**
     * Imprime los submenús dado un iterador.
     * @param iterator iterador para recorrer los submenús.
     */
    public void printItems(Iterator iterator) {
        while (iterator.hasNext()) {
            ItemMenu itemMenu = (ItemMenu)iterator.next();
            System.out.println("Id: " + itemMenu.getId() + ": " + 
                               itemMenu.getNombre() + ", " +
                               itemMenu.getDescripcion());
        }
    }

    public ItemMenu buscarComida(int id) {
        Iterator hamburguesasIterator = hamburguesas.crearIterador();
        Iterator hamburguesasGustoGerenteIterator = hamburguesasGustoGerente.crearIterador();
        Iterator hamburguesasDeLujoIterator = hamburguesasDeLujo.crearIterador();

        ItemMenu hamburguesaId = buscarComida(id, hamburguesasIterator);
        ItemMenu hamburguesaGerenteId = buscarComida(id, hamburguesasGustoGerenteIterator);
        ItemMenu hamburguesaLujoId = buscarComida(id, hamburguesasDeLujoIterator);

        if (hamburguesaId != null)
            return hamburguesaId;
        if (hamburguesaGerenteId != null)
            return hamburguesaGerenteId;
        if (hamburguesaLujoId != null)
            return hamburguesaLujoId;

        return null;
    }

    public ItemMenu buscarComida(int id, Iterator iterator) {
        while (iterator.hasNext()) {
            ItemMenu itemMenu = (ItemMenu)iterator.next();
            if (itemMenu.getId() == id)
                return itemMenu;
        }

        return null;
    }
}