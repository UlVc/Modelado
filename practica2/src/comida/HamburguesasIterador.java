package src.comida;

import java.util.Iterator;

public class HamburguesasIterador implements Iterator {
    ItemMenu[] comidas;
    int posicion = 0;

    public HamburguesasIterador(ItemMenu[] comidas) {
        this.comidas = comidas;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            ItemMenu item = comidas[posicion];
            posicion += 1;
            return item;
        }

        return null;
    }

    @Override
    public boolean hasNext() {
        if (posicion >= comidas.length || comidas[posicion] == null)
            return false;
        
        return true;
     }
}