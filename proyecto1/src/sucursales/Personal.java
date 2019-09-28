package src.sucursales;

/**
 * Clase para guardar los datos del personal.
 */
public class Personal {

    private String id, rfc, nombre, sucursal, camion;
    private int numeroDeLotes;

    /**
     * Constructor de la clase Personal.
     * @param  id     id del personal.
     * @param  rfc    rfc del personal.
     * @param  nombre nombre del personal.
     * @return        Un objeto de tipo Personal.
     */
    public Personal(String id, String rfc, String nombre) {
        this.id = id;
        this.rfc = rfc;
        this.nombre = nombre;
    }

    /**
     * Regresa el Id del personal.
     * @return Regresa el Id del personal.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Regresa el rfc del personal.
     * @return Regresa el rfc del personal.
     */
    public String getRfc() {
        return this.rfc;
    }

    /**
     * Regresa el nombre del personal.
     * @return Regresa el nombre del personal.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método para asignar la entrega al repartidor.
     * @param sucursal sucursal de destino.
     * @param camion   camión a usar.
     */
    public void asignarEntrega(String sucursal, String camion) {
        System.out.println("Se ha asignado a " + this.nombre + 
                           " la " + sucursal + " en el " + camion);
        this.sucursal = sucursal;
        this.camion = camion;
    }
}