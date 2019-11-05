package src.estados;

/**
 * Interfaz para los estados.
 */
public interface Estados {
    
    /**    
     * Apaga la máquina.
     */    
    public void apagarse();
    
    /**    
     * Enciende la máquina.
     */    
    public void encenderse();
    
    /**
     * Pone a preparar un producto a la máquina.
     */
    public boolean prepararProducto();
}
