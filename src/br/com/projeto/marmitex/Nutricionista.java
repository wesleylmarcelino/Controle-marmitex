package br.com.projeto.marmitex;

public class Nutricionista extends Funcionario {

	public Nutricionista(String nome, String cpf, int qtdFilhos) {
		super(nome, cpf, qtdFilhos);
		super.salario = 2500.0;
	}

	@Override
	public double salarioComBonificacaoQtdFilhos() {
		return salario + super.bonificacaoPorFilho();
	}
	
}
