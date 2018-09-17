package com.company;

import javax.swing.*;

class TelaCadastro extends JFrame{
    JLabel lblCpf, lblNome, lblApelido, lblDtNasc, lblSexo, lblEstadoCivil, lblCidadeNatal, lblEstadoNatal, lblNacionalidade, lblNomeDoPai, lblNomeDaMae,
            lblTipoDocumento, lblNumeroId, lblExpedicao, lblorgaoEmissor, lblUfIdentidade, lblIdentidade, lblUrlLattes, lblEmail, lblTelefoneResidencial, lblTelefoneCelular, lblLogradouro, lblNumero,
            lblBairro, lblComplemento, lblCidade, lblPais, lblCep, lblInformacoesPessoais, lblContato, lblCorrespondencia, lblUf;

    JLabel lbltracejado1, lbltracejado2, lbltracejado3, lbltracejado4, lbltracejado5, lbltracejado6;

    JTextField txtCpf, txtNome, txtApelido, txtDtNasc, txtCidadeNatal, txtNomeDoPai, txtNomeDaMae, txtNumeroIdentidade, txtExpedicaoIdentidade, txtOrgaoEmissorIdentidade,
            txtUrl, txtEmail, txtTelefoneResidencial, txtTelefoneCelular, txtLogradouro, txtNumero, txtBairro, txtComplemento, txtCidade, txtCep;

    JRadioButton rbtMasculino, rbtFeminino;

    JComboBox cbxEstadoCivil, cbxNacionalidade, cbxTipoDocumento, cbxEstadoNatal, cbxUfIdentidade, cbxUf, cbxPais;

    public TelaCadastro(){
        setSize(720, 800);
        setTitle("Cadastro");
        getContentPane().setLayout(null); //reseta pre definições do getContentPanel

        lbltracejado1 = new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        lblInformacoesPessoais = new JLabel("Informações Pessoais");
        lbltracejado2 = new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        lblCpf = new JLabel("CPF: ");
        txtCpf = new JTextField();
        lblNome = new JLabel("Nome Completo: ");
        txtNome = new JTextField();
        lblApelido = new JLabel("Apelido: ");
        txtApelido = new JTextField();
        lblDtNasc = new JLabel("Dt de Nasc: ");
        txtDtNasc = new JTextField();
        lblSexo = new JLabel("Sexo: ");
        rbtMasculino = new JRadioButton("Masculino");
        rbtFeminino = new JRadioButton("Feminino");
        lblEstadoCivil = new JLabel("Estado Civil: ");
        cbxEstadoCivil = new JComboBox();
        lblCidadeNatal = new JLabel("Cidade Natal: ");
        txtCidadeNatal = new JTextField();
        lblEstadoNatal = new JLabel("Estado Natal: ");
        cbxEstadoNatal = new JComboBox();
        lblNacionalidade = new JLabel("Nacionalidade: ");
        cbxNacionalidade = new JComboBox();
        lblNomeDaMae = new JLabel("Nome da mãe: ");
        txtNomeDaMae = new JTextField();
        lblNomeDoPai = new JLabel("Nome do pai: ");
        txtNomeDoPai = new JTextField();
        lblTipoDocumento = new JLabel("Tipo de documento:");
        cbxTipoDocumento = new JComboBox();
        lblIdentidade = new JLabel("Identidade: ");
        lblNumeroId = new JLabel("Nº ");
        txtNumeroIdentidade = new JTextField();
        lblExpedicao = new JLabel("Expedição: ");
        txtExpedicaoIdentidade = new JTextField();
        lblorgaoEmissor = new JLabel("Orgão Emissor: ");
        txtOrgaoEmissorIdentidade = new JTextField();
        lblUfIdentidade = new JLabel("UF: ");
        cbxUfIdentidade = new JComboBox();
        lblUrlLattes = new JLabel("URL Lattes: ");
        txtUrl = new JTextField();
        lbltracejado3 = new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        lblContato = new JLabel("Contato");
        lbltracejado4 = new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        lblEmail = new JLabel("Email: ");
        txtEmail = new JTextField();
        lblTelefoneResidencial = new JLabel("Telefone Residencial: ");
        txtTelefoneResidencial = new JTextField();
        lblTelefoneCelular = new JLabel("Telefone Celular: ");
        txtTelefoneCelular = new JTextField();
        lbltracejado5 = new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        lblCorrespondencia = new JLabel("Correspondência");
        lbltracejado6 = new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        lblLogradouro = new JLabel("Logradouro: ");
        txtLogradouro = new JTextField();
        lblNumero = new JLabel("Numero: ");
        txtNumero = new JTextField();
        lblBairro = new JLabel("Bairro: ");
        txtBairro = new JTextField();
        lblComplemento = new JLabel("Complemento: ");
        txtComplemento = new JTextField();
        lblCidade = new JLabel("Cidade: ");
        txtCidade = new JTextField();
        lblUf = new JLabel("UF: ");
        cbxUf = new JComboBox();
        lblPais = new JLabel("País: ");
        cbxPais = new JComboBox();
        lblCep = new JLabel("CEP: ");
        txtCep = new JTextField();


        lbltracejado1.setBounds(10,10,800,20);
        lblInformacoesPessoais.setBounds(20,28,200,20);
        lbltracejado2.setBounds(10,40,800,20);
        lblCpf.setBounds(20,70, 100, 20);
        txtCpf.setBounds(150, 70, 200, 20);
        lblDtNasc.setBounds(400,70,100,20);
        txtDtNasc.setBounds(480,70,200,20);
        lblNome.setBounds(20,100,100,20);
        txtNome.setBounds(150,100,530,20);
        lblApelido.setBounds(20,130,100,20);
        txtApelido.setBounds(150,130,200,20);
        lblSexo.setBounds(430,130,100,20);
        rbtMasculino.setBounds(480,130,100,20);
        rbtFeminino.setBounds(580,130,100,20);
        lblEstadoCivil.setBounds(20,160,100,20);
        cbxEstadoCivil.setBounds(150,160,130,20);
        lblCidadeNatal.setBounds(320,160,100,20);
        txtCidadeNatal.setBounds(410,160,270,20);
        lblEstadoNatal.setBounds(20,190,100,20);
        cbxEstadoNatal.setBounds(150,190,130,20);
        lblNacionalidade.setBounds(320,190,100,20);
        cbxNacionalidade.setBounds(410,190,130,20);
        lblNomeDaMae.setBounds(20,220,100,20);
        txtNomeDaMae.setBounds(150,220,530,20);
        lblNomeDoPai.setBounds(20,250,100,20);
        txtNomeDoPai.setBounds(150,250,530,20);
        lblTipoDocumento.setBounds(20,280,140,20);
        cbxTipoDocumento.setBounds(150,280,130,20);
        lblIdentidade.setBounds(20,325,100,20);
        lblNumeroId.setBounds(150,310,100,20);
        txtNumeroIdentidade.setBounds(250,310,100,20);
        lblExpedicao.setBounds(370,310,100,20);
        txtExpedicaoIdentidade.setBounds(450,310,100,20);
        lblorgaoEmissor.setBounds(150,340,100,20);
        txtOrgaoEmissorIdentidade.setBounds(250,340,100,20);
        lblUfIdentidade.setBounds(370,340,100,20);
        cbxUfIdentidade.setBounds(450,340,100,20);
        lblUrlLattes.setBounds(20,370,100,20);
        txtUrl.setBounds(150,370,530,20);
        lbltracejado3.setBounds(10,400,800,20);
        lblContato.setBounds(20,415,100,20);
        lbltracejado4.setBounds(10,430,800,20);
        lblEmail.setBounds(20,460,100,20);
        txtEmail.setBounds(150,460,530,20);
        lblTelefoneResidencial.setBounds(20,490,130,20);
        txtTelefoneResidencial.setBounds(150,490,130,20);
        lblTelefoneCelular.setBounds(320,490,130,20);
        txtTelefoneCelular.setBounds(450,490,130,20);
        lbltracejado5.setBounds(10,520,800,20);
        lblCorrespondencia.setBounds(20,535,100,20);
        lbltracejado6.setBounds(10,550,800,20);
        lblLogradouro.setBounds(20,580,100,20);
        txtLogradouro.setBounds(150,580,530,20);
        lblNumero.setBounds(20,610,100,20);
        txtNumero.setBounds(150,610,100,20);
        lblBairro.setBounds(270,610,100,20);
        txtBairro.setBounds(320,610,360,20);
        lblComplemento.setBounds(20,340,100,20);
        txtComplemento.setBounds(150,640,530,20);
        lblCidade.setBounds(20,670,100,20);
        txtCidade.setBounds(150,670,530,20);
        lblUf.setBounds(20,700,100,20);
        cbxUf.setBounds(150,700,130,20);
        lblPais.setBounds(320,700,100,20);
        cbxPais.setBounds(370,700,100,20);
        lblCep.setBounds(510,700,130,20);
        txtCep.setBounds(560,700,120,20);


        cbxEstadoCivil.addItem("Selecione");
        cbxEstadoCivil.addItem("Solteiro");
        cbxEstadoCivil.addItem("Casado");
        cbxEstadoCivil.addItem("Divorciado");
        cbxEstadoCivil.addItem("Separado");
        cbxEstadoCivil.addItem("Viuvo");
        cbxEstadoCivil.addItem("outro");

        cbxEstadoNatal.addItem("Selecione");
        cbxEstadoNatal.addItem("AC");
        cbxEstadoNatal.addItem("AL");
        cbxEstadoNatal.addItem("AP");
        cbxEstadoNatal.addItem("AM");
        cbxEstadoNatal.addItem("BA");
        cbxEstadoNatal.addItem("CE");
        cbxEstadoNatal.addItem("DF");
        cbxEstadoNatal.addItem("ES");
        cbxEstadoNatal.addItem("GO");
        cbxEstadoNatal.addItem("MA");
        cbxEstadoNatal.addItem("MT");
        cbxEstadoNatal.addItem("MS");
        cbxEstadoNatal.addItem("MG");
        cbxEstadoNatal.addItem("PA");
        cbxEstadoNatal.addItem("PB");
        cbxEstadoNatal.addItem("PR");
        cbxEstadoNatal.addItem("PE");
        cbxEstadoNatal.addItem("PI");
        cbxEstadoNatal.addItem("RJ");
        cbxEstadoNatal.addItem("RN");
        cbxEstadoNatal.addItem("RS");
        cbxEstadoNatal.addItem("RO");
        cbxEstadoNatal.addItem("RR");
        cbxEstadoNatal.addItem("SC");
        cbxEstadoNatal.addItem("SP");
        cbxEstadoNatal.addItem("SE");
        cbxEstadoNatal.addItem("TO");
        cbxEstadoNatal.addItem("outro");

        cbxNacionalidade.addItem("Selecione");
        cbxNacionalidade.addItem("Brasil");
        cbxNacionalidade.addItem("Outro");

        cbxUfIdentidade.addItem("Selecione");
        cbxUfIdentidade.addItem("AC");
        cbxUfIdentidade.addItem("AL");
        cbxUfIdentidade.addItem("AP");
        cbxUfIdentidade.addItem("AM");
        cbxUfIdentidade.addItem("BA");
        cbxUfIdentidade.addItem("CE");
        cbxUfIdentidade.addItem("DF");
        cbxUfIdentidade.addItem("ES");
        cbxUfIdentidade.addItem("GO");
        cbxUfIdentidade.addItem("MA");
        cbxUfIdentidade.addItem("MT");
        cbxUfIdentidade.addItem("MS");
        cbxUfIdentidade.addItem("MG");
        cbxUfIdentidade.addItem("PA");
        cbxUfIdentidade.addItem("PB");
        cbxUfIdentidade.addItem("PR");
        cbxUfIdentidade.addItem("PE");
        cbxUfIdentidade.addItem("PI");
        cbxUfIdentidade.addItem("RJ");
        cbxUfIdentidade.addItem("RN");
        cbxUfIdentidade.addItem("RS");
        cbxUfIdentidade.addItem("RO");
        cbxUfIdentidade.addItem("RR");
        cbxUfIdentidade.addItem("SC");
        cbxUfIdentidade.addItem("SP");
        cbxUfIdentidade.addItem("SE");
        cbxUfIdentidade.addItem("TO");
        cbxUfIdentidade.addItem("outro");

        cbxTipoDocumento.addItem("Selecione");
        cbxTipoDocumento.addItem("RG");
        cbxTipoDocumento.addItem("Habilitação");
        cbxTipoDocumento.addItem("outro");

        cbxUf.addItem("Selecione");
        cbxUf.addItem("AC");
        cbxUf.addItem("AL");
        cbxUf.addItem("AP");
        cbxUf.addItem("AM");
        cbxUf.addItem("BA");
        cbxUf.addItem("CE");
        cbxUf.addItem("DF");
        cbxUf.addItem("ES");
        cbxUf.addItem("GO");
        cbxUf.addItem("MA");
        cbxUf.addItem("MT");
        cbxUf.addItem("MS");
        cbxUf.addItem("MG");
        cbxUf.addItem("PA");
        cbxUf.addItem("PB");
        cbxUf.addItem("PR");
        cbxUf.addItem("PE");
        cbxUf.addItem("PI");
        cbxUf.addItem("RJ");
        cbxUf.addItem("RN");
        cbxUf.addItem("RS");
        cbxUf.addItem("RO");
        cbxUf.addItem("RR");
        cbxUf.addItem("SC");
        cbxUf.addItem("SP");
        cbxUf.addItem("SE");
        cbxUf.addItem("TO");
        cbxUf.addItem("outro");

        cbxPais.addItem("Selecione");
        cbxPais.addItem("Brasil");
        cbxPais.addItem("Outro");



        getContentPane().add(lbltracejado1);
        getContentPane().add(lblInformacoesPessoais);
        getContentPane().add(lbltracejado2);
        getContentPane().add(lblCpf);
        getContentPane().add(txtCpf);
        getContentPane().add(lblDtNasc);
        getContentPane().add(txtDtNasc);
        getContentPane().add(lblNome);
        getContentPane().add(txtNome);
        getContentPane().add(lblApelido);
        getContentPane().add(txtApelido);
        getContentPane().add(lblSexo);
        getContentPane().add(rbtMasculino);
        getContentPane().add(rbtFeminino);
        getContentPane().add(lblEstadoCivil);
        getContentPane().add(cbxEstadoCivil);
        getContentPane().add(lblCidadeNatal);
        getContentPane().add(txtCidadeNatal);
        getContentPane().add(lblEstadoNatal);
        getContentPane().add(cbxEstadoNatal);
        getContentPane().add(lblNacionalidade);
        getContentPane().add(cbxNacionalidade);
        getContentPane().add(lblNomeDaMae);
        getContentPane().add(txtNomeDaMae);
        getContentPane().add(lblNomeDoPai);
        getContentPane().add(txtNomeDoPai);
        getContentPane().add(lblTipoDocumento);
        getContentPane().add(cbxTipoDocumento);
        getContentPane().add(lblIdentidade);
        getContentPane().add(lblNumeroId);
        getContentPane().add(txtNumeroIdentidade);
        getContentPane().add(lblExpedicao);
        getContentPane().add(txtExpedicaoIdentidade);
        getContentPane().add(lblorgaoEmissor);
        getContentPane().add(txtOrgaoEmissorIdentidade);
        getContentPane().add(lblUfIdentidade);
        getContentPane().add(cbxUfIdentidade);
        getContentPane().add(lblUrlLattes);
        getContentPane().add(txtUrl);
        getContentPane().add(lbltracejado3);
        getContentPane().add(lblContato);
        getContentPane().add(lbltracejado4);
        getContentPane().add(lblEmail);
        getContentPane().add(txtEmail);
        getContentPane().add(lblTelefoneResidencial);
        getContentPane().add(txtTelefoneResidencial);
        getContentPane().add(lblTelefoneCelular);
        getContentPane().add(txtTelefoneCelular);
        getContentPane().add(lbltracejado5);
        getContentPane().add(lblCorrespondencia);
        getContentPane().add(lbltracejado6);
        getContentPane().add(lblLogradouro);
        getContentPane().add(txtLogradouro);
        getContentPane().add(lblNumero);
        getContentPane().add(txtNumero);
        getContentPane().add(lblBairro);
        getContentPane().add(txtBairro);
        getContentPane().add(lblComplemento);
        getContentPane().add(txtComplemento);
        getContentPane().add(lblCidade);
        getContentPane().add(txtCidade);
        getContentPane().add(lblUf);
        getContentPane().add(cbxUf);
        getContentPane().add(lblPais);
        getContentPane().add(cbxPais);
        getContentPane().add(lblCep);
        getContentPane().add(txtCep);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
