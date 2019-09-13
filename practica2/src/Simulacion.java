package src;

import src.comida.*;
import src.estados.*;

public class Simulacion {
    public static void main(String []args) {
        Hamburguesas hamburguesas = new Hamburguesas();
        HamburguesasAlGustoDelGerente hamburguesasGerencia = new HamburguesasAlGustoDelGerente();
        HamburguesasEspeciales hamburguesasDeLujo = new HamburguesasEspeciales();

        PersonalDelRestaurante robot = new PersonalDelRestaurante(hamburguesas, hamburguesasGerencia, hamburguesasDeLujo);
        robot.atender();
        robot.activar();
        robot.atender();
        robot.getEstado();
    }
}