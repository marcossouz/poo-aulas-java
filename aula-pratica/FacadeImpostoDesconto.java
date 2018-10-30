package com.company;

public class FacadeImpostoDesconto {
    public double calculaPrecoFinal(String tipoProduto, int qtdProduto, double precoProduto){
        Pedido p = new Pedido(tipoProduto, qtdProduto, precoProduto);
        AnalisadorImposto ai = new AnalisadorImposto(p);
        double valorcomImposto = p.getQtdProduto() * ((p.getPrecoProduto() * ai.calculaImposto()) + p.getPrecoProduto());
        AnalisadorDesconto ad = new AnalisadorDesconto(p);
        double valorFinal = valorcomImposto - (valorcomImposto * ad.calculaDesconto());
        return valorFinal;
    }
}
