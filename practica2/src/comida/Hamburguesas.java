package src.comida;

public class Hamburguesas {
    static final int MAX_ITEMS = 4;
    ItemsMenu[] menuItems;
    private numeroDeItems;

    public Hamburguesas() {
        menuItems = new menuItems[MAX_ITEMS];
        agregarComida("Hamburguesa aburrida", "Hamburguesa que contiene dos rebanadas de pan y un pedazo de carne.", 0, false, false);
        agregarComida("Hamburguesa aburrida para vegetarianos", "Hamburguesa que contiene dos rebanadas de pan, dos rebanadas de jitomate y un pedazo de lechuga.", 1, false, true);
        agregarComida("El paraiso", "Hamburguesa que contiene 4 rebanadas de pan, 3 pedazos de carne, salsa BBQ, mucha lechuga, aros de cebolla y papas fritas", 3, true, false);
        agregarComida("Hamburguesa simple", "Hamburguesa que contiene 2 rebanadas de pan, 1 pedazo de carne, salsa BBQ, lechuga, jitomate, aros de cebolla y papas fritas", 3, true, false);
    }

    public void agregarComida(String nombre, String descripcion, int id, 
                              boolean tieneQueso, boolean esVegetariano) {
        if (numeroDeItems < MAX_ITEMS) {
            ItemMenu nuevaComida = new ItemMenu(nombre, descripcion, id, 
                                                tieneQueso, esVegetariano);
            menuItems[numeroDeItems] = nuevaComida;
            numeroDeItems += 1; 
        } else {
            System.out.println("Ya no se pueden agregar más comidas.");
        }
    }

    public Iterator crearIterador() {
        return new HamburguesasIterador(menuItems);
    }
}