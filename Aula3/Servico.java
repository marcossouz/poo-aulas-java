package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Servico extends JFrame implements ActionListener{
    JButton btnCliente;
    JButton btnServico;
    JButton btnCaixa;
    JButton btnProduto;

    Container ctn;

    public Servico() {

        setSize(800, 700);
        setTitle("Criação Login");

        btnCliente = new JButton("Cliente");
        btnCaixa = new JButton("Caixa");
        btnServico = new JButton("Servico");
        btnProduto = new JButton("Produto");


        btnCliente.setBounds(200, 100, 80, 20);
        btnServico.setBounds(200, 200, 80, 20);
        btnCaixa.setBounds(200, 300, 80, 20);
        btnProduto.setBounds(200, 400, 80, 20);


        ctn = getContentPane();
        ctn.setLayout(null);


        ctn.add(btnCliente);
        ctn.add(btnServico);
        ctn.add(btnCaixa);
        ctn.add(btnProduto);


        btnCliente.addActionListener(this);
        btnServico.addActionListener(this);
        btnCaixa.addActionListener(this);
        btnProduto.addActionListener(this);


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Cliente")){
            Cliente cliente = new Cliente();
        } else if (e.getActionCommand().equals("Servico")){
            System.out.println("Servico");
        } else if (e.getActionCommand().equals("Caixa")){
            System.out.println("Caixa");
        } else if (e.getActionCommand().equals("Produto")){
            System.out.println("Produto");
        }
    }
}
