package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Servico extends JFrame implements ActionListener{

    JLabel lblTipo;
    JComboBox cbxTipo;
    JLabel lblValor;
    JTextField txtValor;
    JLabel lblCliente;
    JComboBox cbxCliente;
    JLabel lblProdutos;

    // --- Produtos --- //
    JCheckBox lamina;
    JCheckBox posBarba;
    JCheckBox cremeDePentear;
    JCheckBox cremeDeBarbear;
    JCheckBox gel;
    JCheckBox alisante;
    JCheckBox shampoo;

    Container ctn;
    JButton btnConfirmar;

    public Servico(){

        setSize(800,600);
        setTitle("Servico");

        lblTipo = new JLabel("Tipo de servico: ");
        cbxTipo = new JComboBox();
        lblValor = new JLabel("Valor: ");
        txtValor = new JTextField();
        lblCliente = new JLabel("Cliente");
        cbxCliente = new JComboBox();
        lblProdutos = new JLabel("Produtos utilizados: ");

        // --- Produtos --- //
        lamina = new JCheckBox("Lâmina");
        posBarba = new JCheckBox("Loção pós Barba");
        cremeDePentear = new JCheckBox("Creme de pentear");
        cremeDeBarbear = new JCheckBox("Creme de Barbear");
        gel = new JCheckBox("Gel");
        alisante = new JCheckBox("Alisante");
        shampoo = new JCheckBox("Shampoo");


        btnConfirmar = new JButton("Confirmar");

        cbxTipo.addItem("Selecione");
        cbxTipo.addItem("Corte Tesoura");
        cbxTipo.addItem("Corte Maquina");
        cbxTipo.addItem("Corte Maquina e tesoura");
        cbxTipo.addItem("Barba");
        cbxTipo.addItem("Pitura de cabelo");
        cbxTipo.addItem("Alisamento");

        cbxCliente.addItem("Selecione");
        cbxCliente.addItem("José Peixoto");
        cbxCliente.addItem("Mario Gusmão");
        cbxCliente.addItem("Pedro Fernandes");
        cbxCliente.addItem("Manoel De Azevedo");
        cbxCliente.addItem("Fabricio Santos");


        ctn = getContentPane();

        lblTipo.setBounds(20,10,130,30);
        cbxTipo.setBounds(150,10,500,30);
        lblValor.setBounds(20,50,130,30);
        txtValor.setBounds(150,50,500,30);
        lblCliente.setBounds(20,90,130,30);
        cbxCliente.setBounds(150,90,500,30);
        lblProdutos.setBounds(20,130,130,30);

        // ---- produtos --- //
        lamina.setBounds(150,130,130,20);
        posBarba.setBounds(300,130,130,20);
        cremeDePentear.setBounds(150,160,130,20);
        cremeDeBarbear.setBounds(300,160,130,20);
        gel.setBounds(150,190,130,20);
        alisante.setBounds(300,190,130,20);
        shampoo.setBounds(450,130,130,20);

        // --- Botão confirmar --- //
        btnConfirmar.setBounds(520,290,130,30);

        ctn.setLayout(null);

        ctn.add(lblTipo);
        ctn.add(cbxTipo);
        ctn.add(lblValor);
        ctn.add(txtValor);
        ctn.add(lblCliente);
        ctn.add(cbxCliente);
        ctn.add(lblProdutos);

        // -- Produtos -- //
        ctn.add(lamina);
        ctn.add(posBarba);
        ctn.add(cremeDePentear);
        ctn.add(cremeDeBarbear);
        ctn.add(gel);
        ctn.add(alisante);
        ctn.add(shampoo);

        btnConfirmar.addActionListener(this);

        // -- Botão confirmar -- //
        ctn.add(btnConfirmar);

        setVisible(true);
        getRootPane().setDefaultButton(btnConfirmar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Confirmar")){
            if(isPreco(txtValor.getText())){
                JOptionPane.showMessageDialog(null, "Serviço adicionado com sucesso!");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Corrija o campo valor, use ponto ao inves de virgula, digite somente numeros");
                txtValor.requestFocus();
            }
        }
    }

    public boolean isPreco(String quant){
        try {
            Float.parseFloat(quant);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
