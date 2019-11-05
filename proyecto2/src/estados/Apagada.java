package src.estados;

/**
 * Clase para el estado Apagada.
 */
public class Apagada implements Estados {
    
    private Maquina maquina;
    
    /**
     * Constructor de la clase Apagada.
     * @param  maquina Maquina
     */
    public Apagada(Maquina maquina) {
        this.maquina = maquina;
    }


    /**
     * Enciende la maquina
     */
    @Override
    public void encenderse() {
        System.out.println("Encendiendo...");
        this.maquina.asignarEstado(maquina.getEstadoEncender());
        this.maquina.imprimeEstado();
    }

    /**
     * Apaga la maquina
     */
    @Override
    public void apagarse() {
        System.out.println("Ya estoy apagada.");
    }

    /**
     * Apaga la maquina
     */
    @Override
    public boolean prepararProducto() {
        System.out.println("Máquina Apagada, si deseas que prepare un producto primero actívame.");

        return false;
    }
}
