package src.maquinas.wonka3000.gomitas;

import src.maquinas.wonka3000.*;

public class FrutasConChamoy extends Wonka3000 {

	public void elegirMolde() {
        System.out.println("Eligiendo molde para frutas con chamoy...");
    }

    public void ponerMezcla() {
        System.out.println("Poniendo frutas con chamoy...");
        ingredientes.usar("sal", 0.3);
    }

    public void agregarIngredientesExtra() {
        System.out.println("Agregando chamoy...");
        ingredientes.usar("chamoy", 9.6);
    }
}