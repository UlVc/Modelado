package src.maquinas.wonka3000.chocolate;

import src.maquinas.wonka3000.*;

public class ChocolateOscuro extends Wonka3000 {

	public void elegirMolde() {
        System.out.println("Eligiendo molde para chocolate oscuro.");
    }

    public void ponerMezcla() {
        System.out.println("Preparando mezcla...");
        ingredientes.usar("cacao", 8.6);
        ingredientes.usar("manteca_de_cacao", 2.1);
        ingredientes.usar("leche", 1.6);
        ingredientes.usar("agua", 1.1);
        ingredientes.usar("azucar", 3.6);
    }

    public void agregarIngredientesExtra() {
        System.out.println("Poniendo chocolate oscuro...");
        ingredientes.usar("chispas_de_chocolate", 7.6);
    }
}