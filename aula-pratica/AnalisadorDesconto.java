package com.company;

public class AnalisadorDesconto {
    private Pedido ordemPedido;
    public AnalisadorDesconto(Pedido ordemPedido){
        this.ordemPedido = ordemPedido;
    }
    public double calculaDesconto(){
        if(ordemPedido.getPrecoProduto() * ordemPedido.getQtdProduto() > 10000.00){
            return 0.1;
        } else if(ordemPedido.getTipoProduto().equals("DDU")){
            return 0.2;
        }
        return 0.0;
    }
}
