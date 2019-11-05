package src;

public class BS2Controlador {

   private BS2 modelo;
   private BS2Vista vista;

   public BS2Controlador(BS2 modelo, BS2Vista vista){
      this.modelo = modelo;
      this.vista = vista;
   }

   public void updateView() {
      vista.imprimirDetallesProducto(modelo.getEfectos(), modelo.getDuracion());
   }

}
