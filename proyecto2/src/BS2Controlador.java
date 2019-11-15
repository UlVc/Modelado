package src;

import src.jugadores.*;

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
   public void actualizarVista(Jugador p1, Jugador p2) {
       vista.imprimirInformacionJugadores(p1, p2);
   }

}
