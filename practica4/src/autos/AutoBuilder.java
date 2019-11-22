package src.autos;

import src.autos.armas.*;
import src.autos.blindaje.*;
import src.autos.carroceria.*;
import src.autos.llantas.*;
import src.autos.motor.*;

import java.util.Scanner;

/**
 * Clase para construir coches estilo Mad Max.	
 */
public class AutoBuilder {

    /**
     * Método para crear un coche velox.
     * @return Coche veloz.
     */
    public AutoMadMax cocheRapido() {
        AutoMadMax auto = new AutoMadMax();

        auto.agregarPieza(new MotorDeportivo());
        auto.agregarPieza(new Metralleta());
        auto.agregarPieza(new BlindajeSimple());
        auto.agregarPieza(new CarroceriaDeportiva());
        auto.agregarPieza(new LlantasDeportivas());

        return auto;
    }

    /**
     * Método para crear un tanque.
     * @return Tanque.
     */
    public AutoMadMax cocheTanque() {
        AutoMadMax auto = new AutoMadMax();

        auto.agregarPieza(new MotorDiesel());
        auto.agregarPieza(new Lanzallamas());
        auto.agregarPieza(new BlindajeTanque());
        auto.agregarPieza(new CarroceriaCamion());
        auto.agregarPieza(new LlantasOrugaTanque());

        return auto;
    }

    /**
     * Método para crear un coche simple.
     * @return Coche bastante simple.
     */
    public AutoMadMax cocheSimple() {
        AutoMadMax auto = new AutoMadMax();

        auto.agregarPieza(new MotorSimple());
        auto.agregarPieza(new Sierra());
        auto.agregarPieza(new BlindajeSimple());
        auto.agregarPieza(new CarroceriaCasual());
        auto.agregarPieza(new LlantasSimples());

        return auto;
    }

    /**
     * Método para crear un coche personalizado.
     * @return Coche personalizado.
     */
    public AutoMadMax crearCoche() {
        AutoMadMax auto = new AutoMadMax();

        auto.agregarPieza(seleccionarMotor());
        auto.agregarPieza(seleccionarLlantas());
        auto.agregarPieza(seleccionarCarroceria());
        auto.agregarPieza(seleccionarBlindaje());
        auto.agregarPieza(seleccionarArma());

        return auto;
    }

    /**
     * Método para seleccionar un motor.
     * @return Motor seleccionado.
     */
    private Pieza seleccionarMotor() {
        Scanner scanner = new Scanner(System.in);
        Pieza motor;

        while(true) {
            System.out.println("Seleccione el número correspondiente al tipo de motor deseado:");
            System.out.println("1.- Motor deportivo.");
            System.out.println("2.- Motor de diesel.");
            System.out.println("3.- Motor simple.");

            try {
                switch(scanner.nextInt()) {
                    case 1:
                        motor = new MotorDeportivo();
                        return motor;
                    case 2:
                        motor = new MotorDiesel();
                        return motor;
                    case 3:
                        motor = new MotorSimple();
                        return motor;
                    default:
                        System.out.println("Seleccione un número válido.");
                }
            } catch(Exception e) {
                System.out.println("Introduce solamente números.");

                return seleccionarMotor();
            }
        }
    }

    /**
     * Método para seleccionar llantas.
     * @return Llantas seleccionadas.
     */
    private Pieza seleccionarLlantas() {
        Scanner scanner = new Scanner(System.in);
        Pieza llantas;

        while(true) {
            System.out.println("Seleccione el número correspondiente al tipo de llantas deseadas:");
            System.out.println("1.- Llantas deportivas.");
            System.out.println("2.- Llantas off-road.");
            System.out.println("3.- Llantas oruga de tanque.");
            System.out.println("4.- Llantas simples.");

            try {
                switch(scanner.nextInt()) {
                    case 1:
                        llantas = new LlantasDeportivas();
                        return llantas;
                    case 2:
                        llantas = new LlantasOffRoad();
                        return llantas;
                    case 3:
                        llantas = new LlantasOrugaTanque();
                        return llantas;
                    case 4:
                        llantas = new LlantasSimples();
                        return llantas;
                    default:
                        System.out.println("Seleccione un número válido.");
                }
            } catch(Exception e) {
                System.out.println("Introduce solamente números.");

                return seleccionarMotor();
            }
        }
    }

    /**
     * Método para seleccionar una carrocería.
     * @return Carrocería seleccionada.
     */
    private Pieza seleccionarCarroceria() {
        Scanner scanner = new Scanner(System.in);
        Pieza carroceria;

        while(true) {
            System.out.println("Seleccione el número correspondiente al tipo de carroceria deseada:");
            System.out.println("1.- Carroceria tipo camión.");
            System.out.println("2.- Carroceria casual.");
            System.out.println("3.- Carroceria deportiva.");

            try {
                switch(scanner.nextInt()) {
                    case 1:
                        carroceria = new CarroceriaCamion();
                        return carroceria;
                    case 2:
                        carroceria = new CarroceriaCasual();
                        return carroceria;
                    case 3:
                        carroceria = new CarroceriaDeportiva();
                        return carroceria;
                    default:
                        System.out.println("Seleccione un número válido.");
                }
            } catch(Exception e) {
                System.out.println("Introduce solamente números.");

                return seleccionarMotor();
            }
        }
    }

    /**
     * Método para seleccionar blindaje.
     * @return Blindaje seleccionado.
     */
    private Pieza seleccionarBlindaje() {
        Scanner scanner = new Scanner(System.in);
        Pieza blindaje;

        while(true) {
            System.out.println("Seleccione el número correspondiente al tipo de blindaje deseado:");
            System.out.println("1.- Blindaje reforzado.");
            System.out.println("2.- Blindaje simple.");
            System.out.println("3.- Blindaje de tanque.");

            try {
                switch(scanner.nextInt()) {
                    case 1:
                        blindaje = new BlindajeReforzado();
                        return blindaje;
                    case 2:
                        blindaje = new BlindajeSimple();
                        return blindaje;
                    case 3:
                        blindaje = new BlindajeTanque();
                        return blindaje;
                    default:
                        System.out.println("Seleccione un número válido.");
                }
            } catch(Exception e) {
                System.out.println("Introduce solamente números.");

                return seleccionarMotor();
            }
        }
    }

    /**
     * Método para seleccionar una arma.
     * @return Arma seleccionado.
     */
    private Pieza seleccionarArma() {
        Scanner scanner = new Scanner(System.in);
        Pieza arma;

        while(true) {
            System.out.println("Seleccione el número correspondiente al tipo de arma deseada:");
            System.out.println("1.- Arpón.");
            System.out.println("2.- Lanza.");
            System.out.println("3.- Lanzallamas.");
            System.out.println("4.- Metralleta.");
            System.out.println("5.- Sierra.");

            try {
                switch(scanner.nextInt()) {
                    case 1:
                        arma = new Arpon();
                        return arma;
                    case 2:
                        arma = new Lanza();
                        return arma;
                    case 3:
                        arma = new Lanzallamas();
                        return arma;
                    case 4:
                        arma = new Metralleta();
                        return arma;
                    case 5:
                        arma = new Sierra();
                        return arma;
                    default:
                        System.out.println("Seleccione un número válido.");
                }
            } catch(Exception e) {
                System.out.println("Introduce solamente números.");

                return seleccionarMotor();
            }
        }
    }

}
