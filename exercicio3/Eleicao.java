package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Eleicao extends JFrame implements ActionListener {
    ButtonGroup buttonGroup;
    JRadioButton rbtMaria;
    JRadioButton rbtMarcos;
    JRadioButton rbtElizania;
    JRadioButton rbtJose;
    JRadioButton rbtDouglas;
    JButton btnConfirm;
    Container ctn;

    public Eleicao(){

        setSize(300,450);
        setTitle("Eleição para representates da CIPA");

        rbtMaria = new JRadioButton("Maria Josefa");
        rbtMarcos = new JRadioButton("Marcos Souza");
        rbtElizania = new JRadioButton("Elizania Gonçalves");
        rbtJose = new JRadioButton("Jose Lourenço");
        rbtDouglas = new JRadioButton("Douglas Azevedo");
        btnConfirm = new JButton("Confirmar voto");
        buttonGroup = new ButtonGroup();

        rbtMaria.setBounds(70,20,300,20);
        rbtMarcos.setBounds(70,50,300,20);
        rbtElizania.setBounds(70,80,300,20);
        rbtJose.setBounds(70,110,300,20);
        rbtDouglas.setBounds(70,140,300,20);

        buttonGroup.add(rbtMaria);
        buttonGroup.add(rbtMarcos);
        buttonGroup.add(rbtElizania);
        buttonGroup.add(rbtJose);
        buttonGroup.add(rbtDouglas);

        btnConfirm.setBounds(70,170,130,20);

        ctn = getContentPane();
        ctn.setLayout(null);

        ctn.add(rbtMaria);
        ctn.add(rbtMarcos);
        ctn.add(rbtElizania);
        ctn.add(rbtJose);
        ctn.add(rbtDouglas);
        ctn.add(btnConfirm);

        rbtMaria.addActionListener(this);
        rbtMarcos.addActionListener(this);
        rbtElizania.addActionListener(this);
        rbtJose.addActionListener(this);
        btnConfirm.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String voto;

        if(e.getActionCommand().equals("Confirmar voto")){
            if(rbtMarcos.isSelected()){
                voto = rbtMarcos.getText();
            } else if(rbtElizania.isSelected()){
                voto = rbtElizania.getText();
            } else if(rbtMaria.isSelected()){
                voto = rbtMaria.getText();
            } else if(rbtDouglas.isSelected()){
                voto = rbtDouglas.getText();
            } else if(rbtJose.isSelected()){
                voto = rbtJose.getText();
            } else {
                JOptionPane.showMessageDialog(null, "Escolha uma das opções!");
                return;
            }

            JOptionPane.showMessageDialog(null,"sou voto em " + voto + " confirmado com sucesso!");
        }
    }
}
