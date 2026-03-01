package com.mycompany.calculadoraejemplo;
/**
 * Clase principal de la aplicación CalculadoraEjemplo.
 *
 * Esta clase contiene el método {@code main} desde el cual se crean objetos
 * de la clase {@link CalculadoraEjemplo} y se prueban todos sus métodos aritméticos:
 * suma, resta, multiplicación y división.
 *
 * @author Juan Marcos León Hernández
 * @version 1.0
 * @since 2026
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class Main {

    /**
     * Método principal que demuestra el uso de la clase {@link CalculadoraEjemplo}.
     * Crea varios objetos de la clase y prueba cada uno de los métodos aritméticos.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        
        System.out.println("Agregado para prueba de segundo commit");

        // --- Objeto 1: operandos 10 y 3 ---
        CalculadoraEjemplo calc1 = new CalculadoraEjemplo(10, 3);

        System.out.println("=== Calculadora 1: operandos " + calc1.getOperando1() + " y " + calc1.getOperando2() + " ===");
        System.out.println("Suma:           " + calc1.sumar());
        System.out.println("Resta:          " + calc1.restar());
        System.out.println("Multiplicación: " + calc1.multiplicar());
        System.out.println("División:       " + calc1.dividir());
        System.out.println();

        // --- Objeto 2: prueba de división entre cero ---
        CalculadoraEjemplo calc2 = new CalculadoraEjemplo(8, 0);

        System.out.println("=== Calculadora 2: prueba división entre cero ===");
        System.out.println("Operando 1: " + calc2.getOperando1());
        System.out.println("Operando 2: " + calc2.getOperando2());
        System.out.println("División:   " + calc2.dividir());
        System.out.println();

        // --- Objeto 3: uso de setters para cambiar los operandos ---
        CalculadoraEjemplo calc3 = new CalculadoraEjemplo(0, 0);
        calc3.setOperando1(15);
        calc3.setOperando2(4);

        System.out.println("=== Calculadora 3: operandos modificados con setters ===");
        System.out.println("Operando 1: " + calc3.getOperando1());
        System.out.println("Operando 2: " + calc3.getOperando2());
        System.out.println("Suma:           " + calc3.sumar());
        System.out.println("Multiplicación: " + calc3.multiplicar());
    }
}