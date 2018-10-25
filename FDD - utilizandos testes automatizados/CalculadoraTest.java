package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {
    @Test
    public void testSomar() {
        Calculadora c = new Calculadora();
        double res = c.somar(10, 50);
        assertEquals(60, res, 0);
    }
    @Test
    public void testSubtrair(){
        Calculadora c = new Calculadora();
        double res = c.subtrair(10, -15);
        assertEquals(25, res, 0);
    }
    @Test
    public void testDividir(){
        Calculadora c = new Calculadora();
        double res = c.dividir(10.0, 0);
        assertTrue(Double.isFinite(res));
    }
    @Test
    public void testMultiplicar(){
        Calculadora c = new Calculadora();
        double res = c.multiplicar(120.115, 12.5465);
        assertEquals(1507.01, res, 0.5);
    }
}