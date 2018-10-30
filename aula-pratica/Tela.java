package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame implements ActionListener{
    JLabel lblTipoProduto;
    JLabel lblQtdProduto;
    JLabel lblPrecoProduto;
    JComboBox cbxTipoProduto;
    JTextField txtQtdProduto;
    JTextField txtPrecoProduto;
    JLabel lblResultado;
    JLabel lblResult;

    JButton btnCalcularValor;
    Container ctn;

    public Tela(){
        setSize(500, 300);
        setTitle("Cria Pedido");

        lblTipoProduto = new JLabel("Tipo: ");
        lblPrecoProduto = new JLabel("Preço: ");
        lblQtdProduto = new JLabel("Quantidade: ");
        cbxTipoProduto = new JComboBox();
        txtPrecoProduto = new JTextField();
        txtQtdProduto = new JTextField();
        lblResultado = new JLabel("Resultado: ");
        lblResult = new JLabel("");

        btnCalcularValor = new JButton("Calcular");

        cbxTipoProduto.addItem("-- Selecione --");
        cbxTipoProduto.addItem("AT1");
        cbxTipoProduto.addItem("DDU");

        lblTipoProduto.setBounds(20,20,100,25);
        cbxTipoProduto.setBounds(150,20,300,25);
        lblPrecoProduto.setBounds(20,50,100,25);
        txtPrecoProduto.setBounds(150,50,300,25);
        lblQtdProduto.setBounds(20,80,100,25);
        txtQtdProduto.setBounds(150,80,300,25);
        lblResultado.setBounds(20,120,100,25);
        lblResult.setBounds(150,120,300,25);
        btnCalcularValor.setBounds(20,150,100,25);

        ctn = getContentPane();
        ctn.setLayout(null);

        ctn.add(lblTipoProduto);
        ctn.add(lblPrecoProduto);
        ctn.add(lblQtdProduto);
        ctn.add(cbxTipoProduto);
        ctn.add(txtPrecoProduto);
        ctn.add(txtQtdProduto);
        ctn.add(lblResultado);
        ctn.add(lblResult);

        ctn.add(btnCalcularValor);

        btnCalcularValor.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getActionCommand().equals("Calcular")){
            FacadeImpostoDesconto fid = new FacadeImpostoDesconto();
            double valor = fid.calculaPrecoFinal(cbxTipoProduto.getSelectedItem().toString(), Integer.parseInt(txtQtdProduto.getText()), Double.parseDouble(txtPrecoProduto.getText()));

            lblResult.setText(Double.toString(valor));
        }
    }
}
