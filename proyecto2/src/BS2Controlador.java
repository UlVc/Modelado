package src;

import src.producto.Producto;

/**
 * Clase para el controlador de BS2.
 */
public class BS2Controlador {

   private BS2 modelo;
   private BS2Vista vista;

   public BS2Controlador(BS2 modelo, BS2Vista vista) {
       this.modelo = modelo;
       this.vista = vista;
   }

   /**
    * Método para actualizar la vista.
    * @param producto 
    */
   public void updateView(Producto producto) {
       vista.imprimirDetallesProducto(producto);
   }

}
