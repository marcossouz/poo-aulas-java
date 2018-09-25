package com.company;

import javax.swing.*;

public class Autentication {
    public static void validasenha(String txtNome, String email, String senha, String senhaConfirm){
        new Thread(){

            @Override
            public void run(){
                if(txtNome.length() > 3){
                    if(email.contains("@")){
                        if(senha.length() >= 8){
                            if(senha.equals(senhaConfirm)){
                                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
                            } else {
                                JOptionPane.showMessageDialog(null, "As senhas digitadas são diferentes");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Senha muito curta!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Digite um email válido!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "O campo nome deve possuir mais que 3 caracteres!");
                }
            }
        }.start();
    }
}
