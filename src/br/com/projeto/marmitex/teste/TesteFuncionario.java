package br.com.projeto.marmitex.teste;

import br.com.projeto.marmitex.Funcionario;
import br.com.projeto.marmitex.Gerente;
import br.com.projeto.marmitex.MontadorMarmitex;
import br.com.projeto.marmitex.Nutricionista;

public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente g1 = new Gerente("Wesley", "1234567891-9", 5);
		Nutricionista n1 = new Nutricionista("Eduarda", "1234567891-2", 2);
		MontadorMarmitex m1 = new MontadorMarmitex("Emanuel", "9874562311-8", 1);
		
		System.out.println(g1.bonificacaoPorFilho());
		System.out.println(g1.salarioComBonificacaoQtdFilhos());
		System.out.println(g1.getSalario());
		
		System.out.println("********************************");
		
		System.out.println(n1.bonificacaoPorFilho());
		System.out.println(n1.salarioComBonificacaoQtdFilhos());
		System.out.println(n1.getSalario());
		
		System.out.println("********************************");
		
		System.out.println(m1.bonificacaoPorFilho());
		System.out.println(m1.salarioComBonificacaoQtdFilhos());
		System.out.println(m1.getSalario());
		
		System.out.println("********************************");
		
		System.out.println(Funcionario.getQtdFuncionarios());
	
		
	

	}
}
