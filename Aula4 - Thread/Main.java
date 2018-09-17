package com.company;

class Processador implements Runnable {
    private Thread th;

    public Processador(){
        th = new Thread(this);
        th.start();
    }

    public void run(){
        for (int i = 0; i < 1000; i++){
            System.out.println("Processando dados " + i);
        }
    }
}



public class Main {

    public static void main(String[] args) {
//        Processador p = new Processador();
        Primos primos = new Primos();
    }
}
