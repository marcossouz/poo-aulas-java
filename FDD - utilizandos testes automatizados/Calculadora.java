package com.company;

/**
 * A classe calculadora é responsável por executar as operações matemáticas básicas
 * @author Marcos Souza
 * @see java.lang.Math
 * @since 1.0
 */

public class Calculadora {
    /**
     * O métdodo ({@code somar} faz a soma de dois números
     *
     * @param a valor do primeiro número a ser somado
     * @param b valor do segundo número a ser somado
     * @return valor da soma de a e b
     * @see Math
     */
    public double somar(double a, double b){
        return a + b;
    }

    /**
     * O método ({@code subtrair} faz a subtração de dois números
     *
     * @param a valor do primeiro número a ser subtraído
     * @param b valor do segundo número a ser subtraído
     * @return valor de subtração de a e b
     * @see Math
     */
    public double subtrair(double a, double b){
        return a - b;
    }

    /**
     * O método ({@code dividir} faz a divisão de dois números
     *
     * @param a valor do primeiro número a ser dividido
     * @param b valor do segundo número a ser dividido
     * @return valor da divisão de a e b
     * @see Math
     */
    public double dividir(double a, double b){
        if(b == 0){
            return 0;
        } else {
            return a/ b;
        }
    }
    /**
     * O método ({@code multiplicar} faz a multiplicação de dois números
     *
     * @param a valor do primeiro número a ser multiplicado
     * @param b valor do segundo número a ser multiplicado
     * @return valor da divisão de a e b
     * @see Math
     */
    public double multiplicar(double a, double b){
        return a * b;
    }
}
