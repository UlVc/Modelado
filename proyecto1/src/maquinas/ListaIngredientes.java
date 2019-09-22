package src.maquinas;

import java.util.HashMap;

public class ListaIngredientes {

    public HashMap<String, Double> ingredientes = new HashMap<String, Double>();

    public ListaIngredientes() {

        ingredientes.put("almendras", 500.0);
        ingredientes.put("cacao", 500.0);
        ingredientes.put("leche", 500.0);
        ingredientes.put("manteca_de_cacao", 500.0);

        ingredientes.put("grenetina", 500.0);
        ingredientes.put("agua", 500.0);
        ingredientes.put("miel_de_maiz", 500.0);
        ingredientes.put("azucar", 500.0);
        ingredientes.put("miel_de_saborizante_acido", 500.0);
        ingredientes.put("chamoy", 500.0);

        ingredientes.put("harina", 500.0);
        ingredientes.put("huevo", 500.0);
        ingredientes.put("sal", 500.0);
        ingredientes.put("chispas_de_chocolate", 500.0);
        ingredientes.put("mermelada", 500.0);

    }

    public void imprimir() {
        System.out.println(ingredientes);
    }

    public void usar(String ingrediente, double cantidad) {
        double nuevaCantidad = ingredientes.get(ingrediente) - cantidad;
        ingredientes.remove(ingrediente);
        ingredientes.put(ingrediente, nuevaCantidad);
    }
    
    public void llenar(String ingrediente, double cantidad) {
        ingredientes.remove(ingrediente);
        ingredientes.put(ingrediente, cantidad);
    }
}
