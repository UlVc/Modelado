package src.estados;

import src.maquinas.Maquinas;

/**
 * Clase para el estado Empacando.
 */
public class Empacando implements Estados {

    private Maquinas maquina;

    /**
     * Constructor de la clase Empacando.
     * @param  maquina nombre de la máquina.
     */
    public Empacando(Maquinas maquina) {
        this.maquina = maquina;
    }

    /**
     * Suspende la maquina.
     */
    @Override
    public void suspenderse() {
        System.out.println("No me puedo suspender, estoy empacando.");
    }

    /**
     * Apaga la maquina.
     */
    @Override
    public void apagar() {
        System.out.println("No me puedo apagar, estoy empacando.");
    }

    /**
     * Activa la maquina.
     */
    @Override
    public void activar() {
        System.out.println("Ya estoy activa.");
    }

    /**
     * Pone a empacar a la maquina.
     */
    @Override
    public void empacar() {
        System.out.println("Ya estoy empacando, sea más paciente, por favor.");
    }

    /**
     * Pone a prepara dulces a la maquina.
     */
    @Override
    public void prepararDulce() {
        System.out.println("Ya recibí los dulces a empacar.");
    }

    /**
     * Reabastece los ingredientes de la máquina.
     */
    @Override
    public void reabastecerIngredientes() {
        System.out.println("SE PUEDE.");
    }

}