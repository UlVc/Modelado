package src.estados;

/**
 * Clase para el estado Preparando.
 */
public class Preparando implements Estados {
    
    private Maquina maquina;
    
    /**
     * Constructor de la clase Apagada.
     * @param  maquina Maquina
     */
    public Encendida(Maquina maquina) {
        this.maquina = maquina;
    }


    /**
     * Enciende la máquina.
     */
    @Override
    public void encenderse() {
        System.out.println("Ya estoy encendida.");

    }

    /**
     * Apaga la máquina.
     */
    @Override
    public void apagarse() {
        System.out.println("No es posible apagarse, estoy preparando productos.");
    }

    /**
     * Pone a preparar un producto a la máquina.
     */
    @Override
    public boolean prepararProducto() {
        System.out.println("Ya se esta creando el producto, sea paciente.");

        return false;
    }
}
