package src.usuario;

import src.autos.*;

import java.util.Scanner;

/**
 * Clase para construir usuarios.
 */
public class Usuario {

    private String nombre;
    private double saldo;
    private AutoMadMax auto;

    /**
     * Constructor de la clase Usuario.
     * @param  nombre Nombre del usuario.
     * @param  saldo  Saldo del usuario.
     * @return        Objeto de tipo Usuario.
     */
    public Usuario(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    /**
     * Devuelve el saldo del usuario.
     * @return Saldo del usuario.
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Devuelve el nombre del usuario.
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método para que el usuario pueda comprar un coche.
     */
    public void comprarCoche() {
        AutoMadMax auto = seleccionarCoche();
        if (this.saldo >= auto.obtenerCosto())
            asignarAuto(auto);
        else
            System.out.println("Lo sentimos, pero no cuentas con el"
                               + "saldo suficiente para comprar el coche.");
    }

    /**
     * Método para ver las estadísticas del coche del usuario.
     */
    public void verCoche() {
        if (this.auto != null)
            this.auto.estadisticas();
        else
            System.out.println("El usuario " + this.nombre + " no tiene ningún coche.");
    }

    /**
     * Método para asignar un auto al usuario.
     * @param auto Auto a asignar al usuario.
     */
    private void asignarAuto(AutoMadMax auto) {
        this.auto = auto;
    }

    /**
     * Método para que el usuario personalize su coche.
     * @return Coche personalizado.
     */
    private AutoMadMax seleccionarCoche() {
        Scanner scanner = new Scanner(System.in);
        AutoBuilder autoBuilder = new AutoBuilder();
        AutoMadMax auto;

        while(true) {
            System.out.println("¿Deseas personalizar tu coche o por tu falta de "
                               + "originalidad prefieres usar alguno de nuestros "
                               + "3 modelos creados por nosotros?");
            System.out.println("1.- Deseo personalizar mi coche.");
            System.out.println("2.- No soy original :(");

            try {
                switch(scanner.nextInt()) {
                    case 1:
                        return autoBuilder.crearCoche();
                    case 2:
                        return seleccionarModelosPredefinidos();
                    default:
                        System.out.println("Seleccione un número válido.");
                }
            } catch(Exception e) {
                System.out.println("Introduce solamente números.");

                return seleccionarCoche();
            }
        }
    }


    /**
     * Método para seleccionar modelos de coches predefinidos.
     * @return Coche seleccionado.
     */
    private AutoMadMax seleccionarModelosPredefinidos() {
        Scanner scanner = new Scanner(System.in);
        AutoBuilder autoBuilder = new AutoBuilder();
        AutoMadMax auto;

        while(true) {
            System.out.println("Estos son los coches que tenemos:");
            System.out.println("1.- Coche veloz.");
            System.out.println("2.- Tanque.");
            System.out.println("3.- Coche Simple.");
            System.out.println("Selecciona el número del coche que deseas.");

            try {
                switch(scanner.nextInt()) {
                    case 1:
                        auto = autoBuilder.cocheRapido();
                        return auto;
                    case 2:
                        auto = autoBuilder.cocheTanque();
                        return auto;
                    case 3:
                        auto = autoBuilder.cocheSimple();
                        return auto;
                    default:
                        System.out.println("Seleccione un número válido.");
                }
            } catch(Exception e) {
                System.out.println("Introduce solamente números.");

                return seleccionarModelosPredefinidos();
            }
        }
    }

}
