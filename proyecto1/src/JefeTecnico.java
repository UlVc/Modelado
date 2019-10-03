package src;

import java.util.ArrayList;
import java.util.Set;
import java.util.Random;
import java.util.LinkedHashSet;

import src.maquinas.*;
import src.sucursales.*;

/**
 * Clase para el jefe técnico.
 */
public class JefeTecnico implements Observador {

    private static DulcesRosa dulcesRosa = new DulcesRosa();
    private static ArrayList<String> camiones = new ArrayList<String>();
    private static ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();

    /**
     * Constructor del JefeTecnico.
     */
    public JefeTecnico() {
        camiones.add("Camión 1");
        camiones.add("Camión 2");
        camiones.add("Camión 3");
        camiones.add("Camión 4");
        camiones.add("Camión 5");
        camiones.add("Camión 6");
        camiones.add("Camión 7");

        this.sucursales = dulcesRosa.getSucursales();
    }

    /**
     * Método para repartir los lotes a los repartidores.
     * @param dulcesEmpaquetados dulces empaquetados.
     */
    public void repartirLotes(ArrayList<Maquina> dulcesEmpaquetados) {
        ArrayList<Personal> repartidores = dulcesRosa.getRepartidores();
        Integer[] numerosAleatoriosCamiones = generarNumerosAleatorios(7, 7);
        Integer[] numerosAleatoriosSucursales = generarNumerosAleatorios(3, 3);
        int contador = 0;

        for (Personal p: repartidores) {
            int numeroSucursal = new Random().nextInt(3);
            p.asignarEntrega(sucursales.get(numerosAleatoriosSucursales[numeroSucursal]-1),
                             camiones.get(numerosAleatoriosCamiones[contador]), 4, dulcesEmpaquetados);
            contador += 1;
        }

        dulcesRosa.reporteGlobal();
    }

    /**
     * Método para generar un arreglo de números aleatorios sin repetición.
     * @param  max                número máximo que puede tener un número aleatorio.
     * @param  numerosNecesitados longitud del arreglo.
     * @return                    arreglo con números aleatorios.
     */
    private Integer[] generarNumerosAleatorios(int max, int numerosNecesitados) {
        Random rng = new Random();
        Set<Integer> generated = new LinkedHashSet<Integer>();

        while (generated.size() < numerosNecesitados) {
            Integer next = rng.nextInt(max) + 1;
            generated.add(next);
        }

        return generated.toArray(new Integer[0]);
    }

    /**
     * Método para reabastecer un cierto ingrediente.
     * @param ingrediente  ingrediente a reabastecer.
     * @param ingredientes lista de ingredientes.
     */
    @Override
    public void actualizar(String ingrediente, ListaIngredientes ingredientes) {
        System.out.println("Reabasteciendo " + ingrediente);
        ingredientes.llenar(ingrediente, 500.0);
    }

}