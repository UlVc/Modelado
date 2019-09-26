package src.maquinas.wonka3000;

import src.maquinas.Maquinas;

/**
 * Clase de la máquina Wonka3000.
 */
public class Wonka3000 extends Maquinas {

    /**
     * Método para preparar la receta.
     */
    @Override
    public final void prepararReceta() {
        elegirMolde();
        ponerMezcla();
        agregarIngredientesExtra();
    }

}