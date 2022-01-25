package br.com.projeto.marmitex;

public class Nutricionista extends Funcionario {

	public Nutricionista(String nome, String cpf, String cargo, int qtdFilhos) {
		super(nome, cpf, cargo, qtdFilhos);
		super.salario = 2500.0;
	}

	@Override
	public double salarioComBonificacaoQtdFilhos() {
		return salario + super.bonificacaoPorFilho();
	}
	
}
