package exerc5Tests;

import exerc1.Administrativo;
import exerc1.Tecnico;
import exerc2.Cachorro;
import exerc2.Gato;
import exerc2.Miseravel;
import exerc2.Pobre;
import exerc2.Rica;
import exerc3.CamaroteInferior;
import exerc3.CamaroteSuperior;
import exerc3.Ingresso;
import exerc3.VIP;
import exerc4.Imovel;
import exerc4.Novo;
import exerc4.Velho;

public class Teste {
	public static void main(String[] args) {

		//5a
		Tecnico at = new Tecnico(302010, "Jonas", 3200, "12345", 250);
		Administrativo aa = new Administrativo(302011, "Marilia", 3900, "123123", "Dia", 400);
		
		System.out.println(at.getNome());
		System.out.println(aa.getNome());
		

		//5b
		Cachorro dog = new Cachorro();
		System.out.println(dog.late());
		
		Gato cat = new Gato();
		System.out.println(cat.mia());
		
		System.out.println(cat.caminha());
		System.out.println(dog.caminha());
		
		//5c
		Rica r = new Rica();
		Pobre p = new Pobre();
		Miseravel m = new Miseravel();
	
		r.fazCompras();
		p.trabalha();
		m.mendiga();
		
		//5d
		
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("Digite 1 para normal e 2 para vip");
		int op = in.nextInt();
		
		if(op == 1) {
			System.out.println("NORMAL: ");
			Ingresso ing = new Ingresso(60.00);
			ing.imprimeValor();
		} else {
			System.out.println("Digite 1 para superior e 2 para inferior");
			int op2 = in.nextInt();
			if(op2 == 1) {
				System.out.println("CAMAROTE INFERIOR: ");
				CamaroteInferior camInf = new CamaroteInferior(35.00);
				System.out.println(camInf.valorIngressoVIP());
			} else {
				System.out.println("CAMAROTE SUPERIOR");
				CamaroteSuperior camSup = new CamaroteSuperior(35.00);
				System.out.println(camSup.valorIngressoCamSup());
				
			}
		}
		
		//5e
		
		System.out.println("Digite 1 para Imovel novo e 2 para imovel usado");
		int op3 = in.nextInt();
		if(op3 == 1) {
			Novo nv = new Novo(200000);
			System.out.println(nv.valorImovelNovo());
		} else {
			Velho vlh = new Velho(120000);
			System.out.println(vlh.valorImovelVelho());
		}
	}
	
}
