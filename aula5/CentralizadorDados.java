package com.company;

public class CentralizadorDados {
    private int quantidadeSucesso;
    private int quantidadeFalha;

    public synchronized void incrementaSucesso(){
        quantidadeSucesso++;
    }

    public synchronized void incrementaFalha(){
        quantidadeFalha++;
    }

    public void mostraDados(){
        System.out.println("Sucesso " + quantidadeSucesso * 100 / (quantidadeSucesso + quantidadeFalha));
        System.out.println("Falha " + quantidadeFalha * 100 / (quantidadeSucesso + quantidadeFalha));
    }
}
