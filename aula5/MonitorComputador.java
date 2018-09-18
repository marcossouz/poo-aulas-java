package com.company;

import java.util.Timer;

public class MonitorComputador {
    private Timer timer;
    private TestadorConexao testador;
    private CentralizadorDados ct;

    public MonitorComputador(String pHost, CentralizadorDados pCt){
        ct = pCt;
        testador = new TestadorConexao(pHost, ct);
        timer = new Timer();
        timer.schedule(testador,0,5000);
    }
}
