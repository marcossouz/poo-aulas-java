package com.company;

public class MediaTemperatura {
    private int qtdMax;
    private double[] temperaturas;
    private int atual;
    public MediaTemperatura(int parQtdMax)
    {
        qtdMax = parQtdMax;
        temperaturas = new double[qtdMax];
        atual = 0;
    }
    public void setLeitura(double parTemp)
    {
        temperaturas[atual] = parTemp;
        atual++;
    }
    public double mediaTemp()
    {
        double soma = 0.0;
        for (int i = 0; i < atual; i++) {
            soma = soma + temperaturas[i];
        }
        return soma/atual;
    }
}
