package src.maquinas.galleneitor5000.galletas;

import src.maquinas.galleneitor5000.*;

public class GalletasChispas extends Galleneitor5000 {

    public void cocinarMasa() {
        System.out.println("Cocinando masa...");
        ingredientes.usar("harina", 15.4);
        ingredientes.usar("huevo", 3);
        ingredientes.usar("azucar", 8.4);
        ingredientes.usar("leche", 6);
    }
    
    public void ponerMezcla() {
        System.out.println("Poniendo mezcla...");
    }

    public void agregarIngredientesExtra() {
        System.out.println("Poniendo chispas de chocolate...");
        ingredientes.usar("chispas_de_chocolate", 7);
    }

}