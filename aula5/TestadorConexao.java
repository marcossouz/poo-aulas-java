package com.company;

import java.net.InetAddress;
import java.util.TimerTask;

class TestadorConexao extends TimerTask {

    private String hostName;
    private  CentralizadorDados ct;

    public TestadorConexao(String pHost, CentralizadorDados pCt){
        hostName = pHost;
        ct = pCt;
    }

    @Override
    public void run() {
        testaConexao();
    }

    private void testaConexao() {
        //classe representa um computador em rede
        InetAddress host;
        try {
            //instancia a classe com as informacões de um IP ou nome de um host
            host = InetAddress.getByName(hostName);

            //verifica se o host esta comunicável com um timeout de 2
            if(host.isReachable(2000) == true){
                System.out.println("host " + hostName + " online");
                ct.incrementaSucesso();
            } else {
                System.out.println("host " + hostName + " offline");
                ct.incrementaFalha();
            }
            ct.mostraDados();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
