package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTemperaturaTest {
    @Test
    public void testMediaTemp() {
        MediaTemperatura m = new MediaTemperatura(5);
        m.setLeitura(25.0);
        m.setLeitura(30.0);
        m.setLeitura(30.0);
        m.setLeitura(28.0);
        m.setLeitura(20.0);
        double res = m.mediaTemp();
        assertEquals(26.6, res,0.1);
    }
}