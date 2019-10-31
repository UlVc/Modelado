package src.estados;

/**
 * Interfaz para los estados.
 */
public interface Estados {
    
    /**    
     * Apaga la maquina    
     */    
    public void apagarse();
    
    /**    
     * Enciende la maquina    
     */    
    public void encenderse();
    
    /**    
     * Pone a preparar pociones    
     */    
    public void preparar();
}