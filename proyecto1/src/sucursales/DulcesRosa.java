package src.sucursales;

import java.util.ArrayList;

/**
 * Clase para la empresa dulces Rosa.
 */
public class DulcesRosa {

    private ArrayList<Personal> repartidores = new ArrayList<Personal>();
    private ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();
    
    /**
     * Constructor de la clase dulces Rosa.
     */
    public DulcesRosa() {
        repartidores.add(new Personal("1", "0000a", "repartidor1"));
        repartidores.add(new Personal("2", "0000b", "repartidor2"));
        repartidores.add(new Personal("3", "0000c", "repartidor3"));
        repartidores.add(new Personal("4", "0000d", "repartidor4"));
        repartidores.add(new Personal("5", "0000e", "repartidor5"));
        repartidores.add(new Personal("6", "0000f", "repartidor6"));
        repartidores.add(new Personal("7", "0000g", "repartidor7"));

        sucursales.add(new Sucursal("1", "dirección 1"));
        sucursales.add(new Sucursal("2", "dirección 2"));
        sucursales.add(new Sucursal("3", "dirección 3"));
    }

    /**
     * Deuvelve la lista de los repartidores de la empresa Dulces Rosa.
     * @return lista de los repartidores.
     */
    public ArrayList<Personal> getRepartidores() {
        return this.repartidores;
    }

    /**
     * Deuvelve la lista de los repartidores de la empresa Dulces Rosa.
     * @return lista de los repartidores.
     */
    public ArrayList<Sucursal> getSucursales() {
        return this.sucursales;
    }

}