package src.estados;

/**
 * Interfaz para los estados.
 */
public interface Estados {

    /**
     * Suspende la maquina.
     */
    public void suspenderse() {
        System.out.println("Máquina apagada, primero actívame.");
    }

    /**
     * Apaga la maquina.
     */
    public void apagar() {
        System.out.println("Ya estoy apagada.");
    }

    /**
     * Activa la maquina.
     */
    public void activar() {
        System.out.println("ACTIVANDO MÁQUINA");
    }

    /**
     * Pone a empacar a la maquina.
     */
    public void empacar() {
        System.out.println("Máquina apagada, primero actívame.");
    }

    /**
     * Pone a prepara dulces a la maquina.
     */
    public void prepararDulce() {
        System.out.println("Máquina apagada, primero actívame.");
    }

}