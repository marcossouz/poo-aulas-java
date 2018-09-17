package com.company;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Produto extends JFrame implements ActionListener {
    /** Definindo as labels, textfields, buttons e o que se fizer necessario */
    JLabel lblNome;
    JTextField txtNome;
    JLabel lblQuant;
    JTextField txtQuant;
    JLabel lblPreco;
    JTextField txtPreco;
    JButton btnCadastrar;
    Container ctn;

    public Produto() {

        //definindo tamanho da janela
        setSize(800, 600);

        //definindo titulo da janela
        setTitle("Cadastrar Produto");


        /** atribuindo conteudo aos objetos criados acima */
        lblNome = new JLabel("Nome: ");
        txtNome = new JTextField();
        lblQuant = new JLabel("Quantidade: ");
        txtQuant = new JTextField();
        lblPreco = new JLabel("Preço (R$): ");
        txtPreco = new JTextField();
        btnCadastrar = new JButton("Cadastrar");

        /** Posicionando todos os objetos criados*/
        lblNome.setBounds(20, 10, 200, 30);
        txtNome.setBounds(150, 10, 500, 30);
        lblQuant.setBounds(20, 50, 200, 30);
        txtQuant.setBounds(150, 50, 200, 30);
        lblPreco.setBounds(370, 50, 200, 30);
        txtPreco.setBounds(450, 50, 200, 30);
        btnCadastrar.setBounds(520, 90, 130, 30);

        //Criando um container
        ctn = getContentPane();

        //resetando todo o layout
        ctn.setLayout(null);

        //adicionando os objetos criados ao container
        ctn.add(lblNome);
        ctn.add(txtNome);
        ctn.add(lblQuant);
        ctn.add(txtQuant);
        ctn.add(lblPreco);
        ctn.add(txtPreco);
        ctn.add(btnCadastrar);

        //atribuindo ação ao botão 'btnCadastrar'
        btnCadastrar.addActionListener(this);

        //definindo a janela como visível
        setVisible(true);

        //definindo a função do botão 'enter' vinculada ao 'btnCadastrar'
        getRootPane().setDefaultButton(btnCadastrar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /** verifica o texto do botão acionado e executa se for igual a 'Cadastrar' */
        if (e.getActionCommand().equals("Cadastrar")) {
            if(txtNome.getText().length() > 3){
                if(isNumber(txtQuant.getText())){
                    if(isPreco(txtPreco.getText())){
                        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "O campo de preco deve possuir apenas numeros, e deve ser digitado com ponto e não virgula");
                        txtPreco.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "O campo quantidade de possuir apenas numeros");
                    txtQuant.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "O nome do produto deve possuir mais que 3 caracteres");
                txtNome.requestFocus();
            }
        }
    }

    public boolean isNumber(String quant){
        try {
            Integer.parseInt(quant);
            return true;
        } catch (Exception e){
            return false;
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
