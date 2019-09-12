package src.comida;

import java.util.ArrayList;

public class HamburguesasAlGustoDelGerente {
    ArrayList menuItems;

    public HamburguesasAlGustoDelGerente() {
        menuItems = new ArrayList();
        agregarComida("Hamburguesa con jamón", "Hamburguesa que contiene dos rebanadas de pan y una rebanada de jamón.", 0, true, false);
        agregarComida("Hamburguesa de pollo", "Hamburguesa que contiene dos rebanadas de pan, dos rebanadas de jitomate y pollo.", 1, true, true);
        agregarComida("Hamburguesa Light", "Hamburguesa que contiene 2 rebanadas de pan integral, 1 pedazo de pollo asado, lechuga, cebolla y arroz", 3, true, false);
        agregarComida("Hamburguesa alta en proteina", "Hamburguesa que contiene 2 rebanadas de pan, 5 pedazos de carne, 1 pedazo de pollo, salsa BBQ, lechuga, jitomate, aros de cebolla y papas fritas", 3, true, false);
    }

    public void agregarComida(String nombre, String descripcion, int id, 
                              boolean tieneQueso, boolean esVegetariano) {
        ItemMenu nuevaComida = new ItemMenu(nombre, descripcion, id, 
                                            tieneQueso, esVegetariano);
        menuItems.add(nuevaComida);
    }

    public Iterator crearIterador() {
        return new menuItems.iterator();
    }
}