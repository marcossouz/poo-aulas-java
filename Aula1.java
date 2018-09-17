package com.company;

import javax.swing.*;

class PrimeiraTela extends JFrame {
    private JLabel lblnome;
    private JTextField txtnome;

    public PrimeiraTela(){
        setSize(400,300);
        setTitle("Tela Inicial");
//      ctn = getContentPane();
        getContentPane().setLayout(null);
        lblnome = new JLabel("Nome: "); //texto
        txtnome = new JTextField(); //campo de texto

        lblnome.setBounds(20,50,50,25);
        txtnome.setBounds(60,50,300,25);


        getContentPane().add(txtnome);
        getContentPane().add(lblnome);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}


public class Main {

    public static void main(String[] args) {

        PrimeiraTela primeiraTela = new PrimeiraTela();
    }
}
