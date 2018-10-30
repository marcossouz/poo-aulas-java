package com.company;

public class Pedido {
    private String tipoProduto;
    private int qtdProduto;
    private double precoProduto;

    public String getTipoProduto(){
        return tipoProduto;
    }
    public void setTipoProduto(String tipoProduto){
        this.tipoProduto = tipoProduto;
    }
    public int getQtdProduto(){
        return qtdProduto;
    }
    public void setQtdProduto(int qtdProduto){
        this.qtdProduto = qtdProduto;
    }
    public double getPrecoProduto(){
        return precoProduto;
    }
    public void setPrecoProduto(double precoProduto){
        this.precoProduto = precoProduto;
    }

    public Pedido(String tipoProduto, int qtdProduto, double precoProduto){
        this.tipoProduto = tipoProduto;
        this.qtdProduto = qtdProduto;
        this.precoProduto = precoProduto;
    }
}
