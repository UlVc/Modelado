package src.maquinas.wonka3000.chocolate;

import src.maquinas.wonka3000.*;

public class ChocolateConLeche extends Wonka3000 {

    public void elegirMolde() {
        System.out.println("Eligiendo molde para chocolate con leche...");
    }

    public void ponerMezcla() {
        System.out.println("Preparando mezcla...");
        ingredientes.usar("cacao", 4.6);
        ingredientes.usar("manteca_de_cacao", 2.1);
        ingredientes.usar("leche", 1.6);
        ingredientes.usar("agua", 1.1);
        ingredientes.usar("azucar", 3.6);
    }

    public void agregarIngredientesExtra() {
        System.out.println("Poniendo más leche...");
        ingredientes.usar("leche", 3.1);
        ingredientes.usar("chispas_de_chocolate", 7.6);
    }
}