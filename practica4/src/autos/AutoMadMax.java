package src.autos;

import src.autos.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase en la cual se ponen todas las piezas al auto.
 */
public class AutoMadMax {

   private List<Pieza> piezas = new ArrayList<Pieza>();  

   /**
    * Método para agregar piezas al auto.
    * @param pieza Pieza a agregar al auto.
    */
   public void agregarPieza(Pieza pieza) {
      piezas.add(pieza);
   }

   /**
    * Regresa el costo total del auto.
    * @return Costo total del auto.
    */
   public double obtenerCosto() {
      double costo = 0.0;
      
      for (Pieza pieza : piezas)
         costo += pieza.costo();
      
      return costo;
   }

   /**
    * Regresa el ataque total del auto.
    * @return Ataque total del auto.
    */
   public double obtenerAtaque() {
      double ataque = 0.0;
      
      for (Pieza pieza : piezas)
         ataque += pieza.ataque();
      
      return ataque;
   }

   /**
    * Regresa la defensa total del auto.
    * @return Defensa total del auto.
    */
   public double obtenerDefensa() {
      double ataque = 0.0;
      
      for (Pieza pieza : piezas)
         ataque += pieza.defensa();
      
      return ataque;
   }

   /**
    * Regresa la velocidad total del auto.
    * @return Velocidad total del auto.
    */
   public double obtenerVelocidad() {
      double velocidad = 0.0;
      
      for (Pieza pieza : piezas)
         velocidad += pieza.velocidad();
      
      return velocidad;
   }

   /**
    * Método que muestra las estadísticas del auto.
    */
   public void estadisticas() {
       System.out.print("Estadísticas del auto:");
       System.out.print(" Ataque : " + obtenerAtaque());
       System.out.print(", Defensa : " + obtenerDefensa());
       System.out.print(", Velocidad : " + obtenerVelocidad());
       System.out.println(", Costo : " + obtenerCosto());
   }

}
