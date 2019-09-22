package src.maquinas.galleneitor5000;

import src.maquinas.Maquinas;

public abstract class Galleneitor5000 extends Maquinas {

    public final void prepararReceta() {
        cocinarMasa();
        elegirMolde();
        ponerMezcla();
        agregarIngredientesExtra();
    }

    public abstract void cocinarMasa();

    public void elegirMolde() {
        System.out.println("Poniendo molde de galletas redondas...");
    }
}