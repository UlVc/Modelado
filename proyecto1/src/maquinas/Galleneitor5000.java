package src.maquinas;

public abstract class Galleneitor5000 extends Maquinas {

    public final void prepararReceta() {
        cocinarMasa();
        elegirMolde();
        ponerMezcla();
        agregarIngredientesExtra();
    }

    abstract void cocinarMasa();

    void elegirMolde() {
        System.out.println("Poniendo molde de galletas redondas...");
    }
}