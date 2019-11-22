package src.autos;

import src.autos.armas.*;
import src.autos.blindaje.*;
import src.autos.carroceria.*;
import src.autos.llantas.*;
import src.autos.motor.*;

public class AutoBuilder {

   public AutoMadMax prepararCoche () {
      AutoMadMax auto = new AutoMadMax();

      auto.agregarPieza(new MotorDeportivo());
      auto.agregarPieza(new Metralleta());
      auto.agregarPieza(new BlindajeTanque());
      auto.agregarPieza(new CarroceriaDeportiva());
      auto.agregarPieza(new LlantasOffRoad());

      return auto;
   }   

}
