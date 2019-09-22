package src.maquinas.wonka3000.gomitas;

import src.maquinas.wonka3000.*;

public class OsitosDulces extends Wonka3000 {

    public void elegirMolde() {
        System.out.println("Eligiendo molde para ositos dulces...");
    }

    public void ponerMezcla() {
        System.out.println("Preparando mezcla...");
        ingredientes.usar("agua", 30);
        ingredientes.usar("grenetina", 20);
    }

    public void agregarIngredientesExtra() {
        System.out.println("Agregando azúcar...");
        ingredientes.usar("azucar", 15);
    }
}