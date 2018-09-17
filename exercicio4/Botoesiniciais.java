package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Botoesiniciais extends JFrame implements ActionListener{

    JButton btnCliente;
    JButton btnServico;
    JButton btnCaixa;
    JButton btnProduto;

    Container ctn;

    public Botoesiniciais() {

        setSize(800, 700);
        setTitle("Home");

        btnCliente = new JButton("Cadastrar Cliente");
        btnCaixa = new JButton("Caixa");
        btnServico = new JButton("Cadastrar Servico");
        btnProduto = new JButton("Cadastrar Produto");


        btnCliente.setBounds(200, 100, 250, 50);
        btnServico.setBounds(200, 200, 250, 50);
        btnCaixa.setBounds(200, 300, 250, 50);
        btnProduto.setBounds(200, 400, 250, 50);


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
        if(e.getActionCommand().equals("Cadastrar Cliente")){
            Cliente cliente = new Cliente();
        } else if (e.getActionCommand().equals("Cadastrar Servico")){
            Servico servico = new Servico();
        } else if (e.getActionCommand().equals("Caixa")){
            Caixa caixa = new Caixa();
        } else if (e.getActionCommand().equals("Cadastrar Produto")){
            Produto produto = new Produto();
        }
    }
}

