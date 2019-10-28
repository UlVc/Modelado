package src.producto.carne;

/**
 * Clase usando el patrón de diseño Adaptador.
 */
public class AdaptadorCarne {

    private Carne carne;

    /**
     * Constructor de la clase AdaptadorCarne.
     * @param  carne Carne a adaptar.
     * @return       Carne ya adaptada.
     */
    public AdaptadorCarne(Carne carne) {
        this.carne = carne;
    }

    /**
     * Devuelve los ingredientes de la carne.
     * @return Ingredientes de la carne.
     */
    @Override
    public String getIngredientes() {
        return carne.getTipoCarne();
    }

}