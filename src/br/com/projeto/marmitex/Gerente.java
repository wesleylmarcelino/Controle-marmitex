package br.com.projeto.marmitex;

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, int qtdFilhos) {
		super(nome, cpf, qtdFilhos);
		super.salario = 4500.0;
	}
	
	@Override
	public double salarioComBonificacaoQtdFilhos() {
		return salario + super.bonificacaoPorFilho();
	}

}
