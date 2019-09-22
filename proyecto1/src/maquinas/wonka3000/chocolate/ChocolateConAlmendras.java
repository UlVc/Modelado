package src.maquinas.wonka3000.chocolate;

import src.maquinas.wonka3000.*;

public class ChocolateConAlmendras extends Wonka3000 {

	public void elegirMolde() {
        System.out.println("Eligiendo molde para chocolate con almendras...");
    }

    public void ponerMezcla() {
        System.out.println("Preparando mezcla...");
        ingredientes.usar("cacao", 4.6);
        ingredientes.usar("leche", 1.6);
        ingredientes.usar("agua", 1.3);
        ingredientes.usar("azucar", 3.6);
    }

    public void agregarIngredientesExtra() {
        System.out.println("Poniendo almendras...");
        ingredientes.usar("almendras", 3);
        ingredientes.usar("chispas_de_chocolate", 7.6);
    }
}