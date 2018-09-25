package com.company;

import javax.swing.*;
import javax.xml.validation.Validator;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro extends JFrame implements ActionListener {
    JLabel lblTipoUser;
    JComboBox cbxTipoUser;
    JLabel lblNome;
    JTextField txtNome;
    JLabel lblEmail;
    JTextField txtEmail;
    JLabel lblSenha;
    JPasswordField passSenha;
    JLabel lblConfirmSenha;
    JPasswordField passConfirmSenha;
    JButton btnInserir;
    Container ctn;

    public Cadastro() {

        setSize(500, 300);
        setTitle("Cadastro");

        lblTipoUser = new JLabel("Tipo de usuário ");
        cbxTipoUser = new JComboBox();
        lblNome = new JLabel("Nome: ");
        txtNome = new JTextField();
        lblEmail = new JLabel("Email: ");
        txtEmail = new JTextField();
        lblSenha = new JLabel("Senha: ");
        passSenha = new JPasswordField();
        lblConfirmSenha = new JLabel("Confirmar senha: ");
        passConfirmSenha = new JPasswordField();
        btnInserir = new JButton("Inserir");

        lblTipoUser.setBounds(20,20,130,25);
        cbxTipoUser.setBounds(150,20,300,25);
        lblNome.setBounds(20, 50, 130, 25);
        txtNome.setBounds(150, 50, 300, 25);
        lblEmail.setBounds(20,80,130,25);
        txtEmail.setBounds(150,80,300,25);
        lblSenha.setBounds(20, 110, 130, 25);
        passSenha.setBounds(150, 110, 300, 25);
        lblConfirmSenha.setBounds(20, 140, 130, 25);
        passConfirmSenha.setBounds(150, 140, 300, 25);
        btnInserir.setBounds(320, 170, 130, 25);

        cbxTipoUser.addItem("Selecione");
        cbxTipoUser.addItem("Administrador");
        cbxTipoUser.addItem("Padrão");
        cbxTipoUser.addItem("Limitado");


        ctn = getContentPane();
        ctn.setLayout(null);

        ctn.add(lblTipoUser);
        ctn.add(cbxTipoUser);
        ctn.add(lblEmail);
        ctn.add(txtEmail);
        ctn.add(lblNome);
        ctn.add(txtNome);
        ctn.add(lblTipoUser);
        ctn.add(cbxTipoUser);
        ctn.add(lblSenha);
        ctn.add(passSenha);
        ctn.add(lblConfirmSenha);
        ctn.add(passConfirmSenha);
        ctn.add(btnInserir);

        btnInserir.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new Thread(t).start();
    }

    private static Runnable t = new Runnable() {
        @Override
        public void run() {
            System.out.println("Thread Executando");
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Inserir")) {
            Autentication.validasenha(txtNome.getText(), txtEmail.getText(), String.valueOf(passSenha.getPassword()), String.valueOf(passConfirmSenha.getPassword()));
        }
    }
}