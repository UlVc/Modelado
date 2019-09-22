package src;

import src.maquinas.*;

/**
 * Clase para el jefe técnico.
 */
public class JefeTecnico implements Observador {

    /**
     * Método para reabastecer un cierto ingrediente.
     * @param ingrediente  ingrediente a reabastecer.
     * @param ingredientes lista de ingredientes.
     */
    @Override
    public void actualizar(String ingrediente, ListaIngredientes ingredientes) {
        ingredientes.llenar(ingrediente, 500.0);
    }

}