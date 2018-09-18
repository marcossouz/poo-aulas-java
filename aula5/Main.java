package com.company;

public class Main {
    public static void main(String[] args) {

        CentralizadorDados ct = new CentralizadorDados();

        MonitorComputador mc = new MonitorComputador("8.8.8.8", ct);
        MonitorComputador mc1 = new MonitorComputador("8.8.2.1", ct);
        MonitorComputador mc3 = new MonitorComputador("10.231.16.72", ct);
    }
}
