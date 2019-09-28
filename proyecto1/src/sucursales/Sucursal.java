package src.sucursales;

import java.util.ArrayList;

/**
 * Clase para guardar los datos de las sucursales..
 */
public class Sucursal {

	private String id;
    private String direccion;
    private ArrayList<String> inventario = new ArrayList<String>();
    private Repostero repostero = new Repostero();

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
     * Método para agregar dulces al inventario de la sucursal.
     * @param inventario ArrayList con los nuevos dulces empaquetados.
     */
    public void agregarInventario(ArrayList<String> inventario) {
        for (String s: inventario)
            this.inventario.add(s);

        revisarInventario();
    }

    /**
     * Método para revisar el inventario, si falta algún dulce
     * se comunica con el repostero y lo repone usando la máquina Wonka3000.
     */
    private void revisarInventario() {
        if (!this.inventario.contains("OsitosDulces"))
            inventario.add(repostero.pedido("OsitosDulces").getClass().getSimpleName());
        if (!this.inventario.contains("GusanosAcidos"))
            inventario.add(repostero.pedido("GusanosAcidos").getClass().getSimpleName());
        if (!this.inventario.contains("FrutasConChamoy"))
            inventario.add(repostero.pedido("FrutasConChamoy").getClass().getSimpleName());
        if (!this.inventario.contains("ChocolateConAlmendras"))
            inventario.add(repostero.pedido("ChocolateConAlmendras").getClass().getSimpleName());
        if (!this.inventario.contains("ChocolateConLeche"))
            inventario.add(repostero.pedido("ChocolateConLeche").getClass().getSimpleName());
        if (!this.inventario.contains("ChocolateOscuro"))
            inventario.add(repostero.pedido("ChocolateOscuro").getClass().getSimpleName());
    }
}