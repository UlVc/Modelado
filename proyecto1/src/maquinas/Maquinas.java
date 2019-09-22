package src.maquinas;

public abstract class Maquinas implements Observador {

    public ListaIngredientes ingredientes = new ListaIngredientes();

    public abstract void prepararReceta();

    public abstract void elegirMolde();

    public abstract void ponerMezcla();

    public abstract void agregarIngredientesExtra();

    /**
     * Método que actualiza la cantidad del ingrediente.
     * @param ingrediente ingrediente del cual se agotó en la máquina.
     */
    @Override
    public void actualizar(String ingrediente) {
        ingredientes.llenar(ingrediente, 500.0);
    }
}