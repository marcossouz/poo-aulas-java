package com.company;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela1 extends JFrame implements ActionListener{

    private JButton btnok;
    private  JTextField txtNome;
    private JLabel lblNome;
    private Container ctn;

    public Tela1(){
        setSize(300,140);
        setTitle("Eventos em Java Swing");

        btnok = new JButton("Enviar");
        txtNome = new JTextField();
        lblNome = new JLabel("Nome:");

        lblNome.setBounds(20,20,100,20);
        txtNome.setBounds(70,20,200,20);
        btnok.setBounds(170,50,100,20);

        ctn = getContentPane();
        ctn.setLayout(null);

        ctn.add(lblNome);
        ctn.add(txtNome);
        ctn.add(btnok);

        btnok.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Enviar")){

            System.out.println("valor do campo texto: " + txtNome.getText());
            txtNome.setText("Botão Clicado");
            btnok.setText("Enviado");
        }
    }
}