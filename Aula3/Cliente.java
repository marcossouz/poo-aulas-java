package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cliente extends JFrame implements ActionListener {
    JLabel lblNome;
    JTextField txtNome;
    JLabel lblTel;
    JTextField txtTel;
    JLabel lblEmail;
    JTextField txtEmail;
    JButton btnCadastrar;
    Container ctn;

    public Cliente() {

        setSize(800, 600);
        setTitle("Cliente");

        JLabel lblNome = new JLabel("Nome: ");
        JTextField txtNome = new JTextField();
        JLabel lblTel = new JLabel("Telefone: ");
        JTextField txtTel = new JTextField();
        JLabel lblEmail = new JLabel("Email: ");
        JTextField txtEmail = new JTextField();
        JButton btnCadastrar = new JButton("Cadastrar");

        lblNome.setBounds(20, 10, 200, 20);
        txtNome.setBounds(150, 10, 200, 20);
        lblTel.setBounds(20, 40, 200, 20);
        txtTel.setBounds(150, 40, 200, 20);
        lblEmail.setBounds(20, 70, 200, 20);
        txtEmail.setBounds(150, 70, 200, 20);
        btnCadastrar.setBounds(200, 100, 120, 20);

        ctn = getContentPane();
        ctn.setLayout(null);

        ctn.add(lblNome);
        ctn.add(txtNome);
        ctn.add(lblTel);
        ctn.add(txtTel);
        ctn.add(lblEmail);
        ctn.add(txtEmail);
        ctn.add(btnCadastrar);

        btnCadastrar.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Cadastrar")) {
            if (txtEmail.getText().equals(null)) {
                JOptionPane.showMessageDialog(null, "Campo Vazio");
            }
            }
    }
}
