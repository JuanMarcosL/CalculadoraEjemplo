package com.mycompany.calculadoraejemplo;
/**
 * Clase que implementa una calculadora básica con las operaciones aritméticas fundamentales.
 *
 * Esta clase permite realizar operaciones de suma, resta, multiplicación y división
 * sobre dos operandos de tipo double. Los resultados se almacenan en el atributo
 * {@code resultado} y se devuelven como valor de retorno de cada método.
 *
 * @author Juan Marcos León Hernández
 * @version 1.0
 * @since 2026
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {

    /**
     * Primer operando de la operación aritmética.
     */
    private double operando1;

    /**
     * Segundo operando de la operación aritmética.
     */
    private double operando2;

    /**
     * Resultado de la última operación aritmética realizada.
     */
    private double resultado;

    /**
     * Constructor de la clase CalculadoraEjemplo.
     * Inicializa los dos operandos con los valores proporcionados.
     *
     * @param operando1 El primer operando de la operación.
     * @param operando2 El segundo operando de la operación.
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = 0;
    }

    /**
     * Devuelve el valor del primer operando.
     *
     * @return El valor de {@code operando1}.
     */
    public double getOperando1() {
        return operando1;
    }

    /**
     * Establece el valor del primer operando.
     *
     * @param operando1 El nuevo valor para {@code operando1}.
     */
    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    /**
     * Devuelve el valor del segundo operando.
     *
     * @return El valor de {@code operando2}.
     */
    public double getOperando2() {
        return operando2;
    }

    /**
     * Establece el valor del segundo operando.
     *
     * @param operando2 El nuevo valor para {@code operando2}.
     */
    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    /**
     * Devuelve el resultado de la última operación realizada.
     *
     * @return El valor de {@code resultado}.
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * Calcula la suma de {@code operando1} y {@code operando2}.
     * El resultado se almacena en el atributo {@code resultado}.
     *
     * @return La suma de los dos operandos.
     */
    public double sumar() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Calcula la resta de {@code operando1} menos {@code operando2}.
     * El resultado se almacena en el atributo {@code resultado}.
     *
     * @return La diferencia entre los dos operandos.
     */
    public double restar() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Calcula la multiplicación de {@code operando1} por {@code operando2}.
     * El resultado se almacena en el atributo {@code resultado}.
     *
     * @return El producto de los dos operandos.
     */
    public double multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Calcula la división de {@code operando1} entre {@code operando2}.
     * El resultado se almacena en el atributo {@code resultado}.
     * Si {@code operando2} es cero, muestra un mensaje de error y devuelve 0.
     *
     * @return El cociente de la división, o 0 si el divisor es cero.
     */
    public double dividir() {
        if (operando2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            resultado = 0;
        } else {
            resultado = operando1 / operando2;
        }
        return resultado;
    }
}