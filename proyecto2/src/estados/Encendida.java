package src.estados;

/**
 * Clase para el estado Encendida.
 */
public class Encendida implements Estados {
    
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
    	System.out.println("Ya estoy encendida, ¿qué deseas hacer?");
    }

    /**
     * Apaga la máquina.
     */
    @Override
    public void apagarse() {
        System.out.println("Apagando...");
        this.maquina.asignarEstado(maquina.getEstadoApagar());
        this.maquina.imprimeEstado();
    }

    /**
     * Pone a preparar un producto a la máquina.
     */
    @Override
    public void prepararProducto() {
        System.out.println("¿Qué producto deseas hacer?");
        //Lista de productos, se añadiran pronto.
    }
}
