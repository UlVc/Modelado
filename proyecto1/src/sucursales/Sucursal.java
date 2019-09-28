package src.sucursales;

import java.util.ArrayList;

/**
 * Clase para guardar los datos de las sucursales..
 */
public class Sucursal {

	private String id;
    private String direccion;
    private ArrayList<String> inventario;

    /**
     * Constructor de la clase SucursalesBBDD.
     * @param  id     id de la sucursal.
     * @param  direccion dirección de la sucursal.
     * @return        Un objeto de tipo SucursalesBBDD.
     */
    public Sucursal(String id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    /**
     * Regresa el Id de la sucursal.
     * @return Regresa el Id de la sucursal.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Regresa el direccion de la sucursal.
     * @return Regresa el direccion de la sucursal.
     */
    public String getdireccion() {
        return this.direccion;
    }

    /**
     * Regresa el inventario de la sucursal.
     * @return Regresa el inventario de la sucursal.
     */
    public ArrayList<String> getInventario() {
        return this.inventario;
    }

    public void setInventario(ArrayList<String> inventario) {
        this.inventario = inventario;
    }

}