package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cliente extends JFrame implements ActionListener {

    /** Definindo as labels, textfields, buttons e o que se fizer necessario */
    JLabel lblNome;
    JTextField txtNome;
    JLabel lblTel;
    JTextField txtTel;
    JLabel lblEmail;
    JTextField txtEmail;
    JButton btnCadastrar;
    Container ctn;

    public Cliente() {

        //definindo tamanho da janela
        setSize(800, 600);

        //definindo titulo da janela
        setTitle("Cadastrar Cliente");


        /** atribuindo conteudo aos objetos criados acima */
        lblNome = new JLabel("Nome: ");
        txtNome = new JTextField();
        lblTel = new JLabel("Telefone: ");
        txtTel = new JTextField();
        lblEmail = new JLabel("Email: ");
        txtEmail = new JTextField();
        btnCadastrar = new JButton("Cadastrar");

        /** Posicionando todos os objetos criados*/
        lblNome.setBounds(20, 10, 200, 30);
        txtNome.setBounds(150, 10, 500, 30);
        lblTel.setBounds(20, 50, 200, 30);
        txtTel.setBounds(150, 50, 500, 30);
        lblEmail.setBounds(20, 90, 200, 30);
        txtEmail.setBounds(150, 90, 500, 30);
        btnCadastrar.setBounds(530, 130, 120, 30);

        //Criando um container
        ctn = getContentPane();

        //resetando todo o layout
        ctn.setLayout(null);

        //adicionando os objetos criados ao container
        ctn.add(lblNome);
        ctn.add(txtNome);
        ctn.add(lblTel);
        ctn.add(txtTel);
        ctn.add(lblEmail);
        ctn.add(txtEmail);
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

            /** Verifica se 'txtNome' é maior que 3 e se o primeiro caractere é maiusculo */
            if (txtNome.getText().length() >= 3 && txtNome.getText().charAt(0) == txtNome.getText().toUpperCase().charAt(0)) {

                /** verifica o texto do botão acionado e executa se for igual a 'Cadastrar' */
                if (e.getActionCommand().equals("Cadastrar")) {

                    /** Verifica se o tamanho do numero de telefone é igual a 9 */
                    if (txtTel.getText().length() == 9) {

                        /** Envia o valor de 'txtTel' para o metodo isNumber para verificar se o conteudo digitado é um numero*/
                        if(isNumber(txtTel.getText())){

                            /** Envia o valor de 'txtEmail' para o metodo isEmail para verificar se o conteudo digitado é um email valido */
                            if(isEmail(txtEmail.getText())){

                                /** Confirma ao usuário que o cadastro foi efetivado com sucesso*/
                                JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso!");

                                /** seta em ""  cada um dos campos*/
                                txtNome.setText("");
                                txtTel.setText("");
                                txtEmail.setText("");

                                /** Fecha a Janela atual quando o cadastro for efetivado */
                                dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "Digite um endereço de email válido");

                                //foca no campo email
                                txtEmail.requestFocus();
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Digite apenas numeros");

                            //foca no campo telefone
                            txtTel.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "O numero de telefone deve ter exatamente 9 digitos");
                        txtTel.requestFocus();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seu usuário não atende os requisitos mínimos para sua criação! \n-Primeira Letra maiuscula\n-Tamanho mínimo 3 letras");

                //foca no campo nome
                txtNome.requestFocus();
            }
        }
    }


    public boolean isNumber(String tel){

        /** Se conseguir converter é número, caso contrario, tem outros tipos de caracteres*/
        try {
            Integer.parseInt(tel);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean isEmail(String email){
        if(email.contains("@") && email.contains(".") && !email.contains(" ") && email.length() >= 5){
            return true;
        } else {
            return false;
        }
    }
}
