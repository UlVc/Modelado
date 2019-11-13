package src;

import src.producto.Producto;

/**
 * Clase para la vista de BS2.
 */
public class BS2Vista {

    /**
     * Imprime los detalles del producto.
     * @param producto Producto a imprimir detalles.
     */
    public void imprimirDetallesProducto(Producto producto) {
        System.out.println("Se ha creado lo siguiente:");
        System.out.println("Efectos: " + producto.getIngredientes());
        System.out.println("Duración: " + producto.getTiempoDuracion() + " minutos.");
    }

}
