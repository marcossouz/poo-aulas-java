package com.company;

public class AnalisadorImposto {
    private Pedido ordemPedido;
    public AnalisadorImposto(Pedido ordemPedido){
        this.ordemPedido = ordemPedido;
    }
    public double calculaImposto(){
        if(ordemPedido.getTipoProduto().equals("AT1")){
            if(ordemPedido.getPrecoProduto() * ordemPedido.getQtdProduto() > 5000.00){
                return 50.0;
            } else {
                return 30.0;
            }
        }
        return 10.0;
    }
}
