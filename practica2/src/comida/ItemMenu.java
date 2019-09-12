package src.comida;

public class ItemMenu {
    private String nombre;
    private String descripcion;
    private int id;
    private boolean tieneQueso;
    private boolean esVegetariano;

    public ItemMenu(String nombre, String descripcion, int id, 
                    boolean tieneQueso, boolean esVegetariano) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
        this.tieneQueso = tieneQueso;
        this.esVegetariano = esVegetariano;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void esVegatariano() {
        return esVegatariano;
    }
}