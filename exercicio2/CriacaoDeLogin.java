package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CriacaoDeLogin extends JFrame implements ActionListener {
    JLabel lblUser;
    JTextField txtUser;
    JLabel lblSenha;
    JPasswordField passSenha;
    JLabel lblConfirmSenha;
    JPasswordField passConfirmSenha;
    JButton btnInserir;
    Container ctn;

    public CriacaoDeLogin() {

        setSize(300, 170);
        setTitle("Criação Login");

        lblUser = new JLabel("Usuário: ");
        txtUser = new JTextField();
        lblSenha = new JLabel("Senha: ");
        passSenha = new JPasswordField();
        lblConfirmSenha = new JLabel("Confirmar senha: ");
        passConfirmSenha = new JPasswordField();
        btnInserir = new JButton("Inserir");

        lblUser.setBounds(20, 10, 130, 20);
        txtUser.setBounds(150, 10, 130, 20);
        lblSenha.setBounds(20, 40, 130, 20);
        passSenha.setBounds(150, 40, 130, 20);
        lblConfirmSenha.setBounds(20, 70, 130, 20);
        passConfirmSenha.setBounds(150, 70, 130, 20);
        btnInserir.setBounds(200, 100, 80, 20);

        ctn = getContentPane();
        ctn.setLayout(null);

        ctn.add(lblUser);
        ctn.add(txtUser);
        ctn.add(lblSenha);
        ctn.add(passSenha);
        ctn.add(lblConfirmSenha);
        ctn.add(passConfirmSenha);
        ctn.add(btnInserir);

        btnInserir.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Inserir")) {
            if (txtUser.getText().length() > 3 && txtUser.getText().charAt(0) == txtUser.getText().toUpperCase().charAt(0)) {
                if (e.getActionCommand().equals("Inserir")) {
                    if (String.valueOf(passSenha.getPassword()).equals(String.valueOf(passConfirmSenha.getPassword()))) {
                        JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "As senhas digitadas são diferentes!");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seu usuário não atende os requisitos mínimos para sua criação!");
            }
        }
    }
}