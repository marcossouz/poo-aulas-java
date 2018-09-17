package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Primos extends JFrame implements ActionListener {
    private PrimosPanel pp;
    private boolean stop;

    public Primos(){
        super("Primos sem Thread");
        setContentPane(pp = new PrimosPanel());
        pp.getB1().addActionListener(this);
        pp.getB2().addActionListener(this);
        pp.getB3().addActionListener(this);
        pp.getB4().addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,150);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pp.getB3()){
            try {
                pp.getB2().setEnabled(false);
                pp.getB3().setEnabled(false);
                calPrimos(Integer.parseInt(pp.getTf1().getText()),
                Integer.parseInt(pp.getTf2().getText()));
                pp.getB2().setEnabled(true);
                pp.getB3().setEnabled(true);
            } catch (NumberFormatException nfe){
                pp.getTa1().setText("Intervalo inválido");
                return;
            }
        } else if(e.getSource() == pp.getB2()) {
            pp.getTa1().setText(null);
        } else {
            stop = true;
            pp.getB2().setEnabled(true);
            pp.getB3().setEnabled(true);
        }
    }

    private void calPrimos(int inicio, int fim) {
        pp.getTa1().setText("Calculando:\n");
        stop = false;
        for (int n = inicio; n <= fim && !stop; n++){
            int i;
            for(i = 2; i < n; i++){
                if(n % i == 0) break;
                if(i == n) pp.getTa1().append(n + ", ");
            }
        }
    }
}
