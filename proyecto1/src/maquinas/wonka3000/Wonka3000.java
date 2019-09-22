package src.maquinas.wonka3000;

import src.maquinas.Maquinas;

public abstract class Wonka3000 extends Maquinas {

    public final void prepararReceta() {
        elegirMolde();
        ponerMezcla();
        agregarIngredientesExtra();
    }

}