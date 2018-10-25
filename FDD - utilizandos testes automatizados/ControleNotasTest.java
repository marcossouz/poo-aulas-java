package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ControleNotasTest {
    @Test
    public void testControleNotas(){
        ControleNotas c = new ControleNotas(10.0, 10.0, 10.0);
        assertNotNull(c);
    }
    @Test
    public void testCalculaNotaFinal(){
        ControleNotas c = new ControleNotas(10.0,10.0,10.0);
        double notaFinal = c.calculaNotaFinal();
        assertEquals(10.0,notaFinal,0);
    }
}