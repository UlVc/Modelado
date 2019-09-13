package src;

import src.comida.*;
import src.estados.*;

public class Simulacion {
    public static void main(String []args) {
        Hamburguesas hamburguesas = new Hamburguesas();
        HamburguesasAlGustoDelGerente hamburguesasGerencia = new HamburguesasAlGustoDelGerente();

        PersonalDelRestaurante robot = new PersonalDelRestaurante(hamburguesas, hamburguesasGerencia);
        robot.imprimirMenu();
    }
}