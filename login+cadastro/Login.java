package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{
    JLabel lblUser;
    JLabel lblPass;
    JTextField txtUser;
    JPasswordField passUser;
    JButton btnEntrar;
    JButton btnCadastrar;
    Container ctn;

    public Login(){
        setSize(500,200);
        setTitle("Login");

        lblUser = new JLabel("Usuário: ");
        txtUser = new JTextField();
        lblPass = new JLabel("Senha: ");
        passUser = new JPasswordField();
        btnEntrar = new JButton("Entrar");
        btnCadastrar = new JButton("Cadastro");

        lblUser.setBounds(20,20,100,25);
        txtUser.setBounds(150,20,300,25);
        lblPass.setBounds(20,50,100,25);
        passUser.setBounds(150,50,300,25);
        btnEntrar.setBounds(150,80,150,25);
        btnCadastrar.setBounds(300,80,150,25);

        ctn = getContentPane();
        ctn.setLayout(null);

        ctn.add(lblUser);
        ctn.add(txtUser);
        ctn.add(lblPass);
        ctn.add(passUser);
        ctn.add(btnEntrar);
        ctn.add(btnCadastrar);

        btnEntrar.addActionListener(this);
        btnCadastrar.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getActionCommand().equals("Entrar")){
            System.out.println("Validar Login");
        } else if(actionEvent.getActionCommand().equals("Cadastro")){
            Cadastro cadastro = new Cadastro();
        }
    }
}
