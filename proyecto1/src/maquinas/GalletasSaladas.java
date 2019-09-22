package src.maquinas;

public class GalletasSaladas extends Galleneitor5000 {

	ListaIngredientes ingredientes = new ListaIngredientes();

    public void ponerMezcla() {
        System.out.println("Poniendo mezcla...");
    }

    public void agregarIngredientesExtra() {
        System.out.println("Poniendo sal...");
        ingredientes.setCantidadDeSal(ingredientes.getCantidadDeSal() - 3.5);
    }

    public void cocinarMasa() {
        System.out.println("Cocinando masa...");
        ingredientes.setCantidadDeHarina(ingredientes.getCantidadDeHarina() - 15.4);
        ingredientes.setCantidadDeHuevo(ingredientes.getCantidadDeHuevo() - 3);
        ingredientes.setCantidadDeAzucar(ingredientes.getCantidadDeAzucar() - 8.4);
        ingredientes.setCantidadDeLeche(ingredientes.getCantidadDeLeche() - 6);

    }
}