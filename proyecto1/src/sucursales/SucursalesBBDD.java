package src.sucursales;

/**
 * Clase para guardar los datos de las sucursales..
 */
public class SucursalesBBDD {

	private String id;
    private String direccion;

    /**
     * Constructor de la clase SucursalesBBDD.
     * @param  id     id de la sucursal.
     * @param  direccion dirección de la sucursal.
     * @return        Un objeto de tipo SucursalesBBDD.
     */
    public SucursalesBBDD(String id, String direccion) {
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
}