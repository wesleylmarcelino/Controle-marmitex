package br.com.projeto.marmitex;

public class MontadorMarmitex extends Funcionario {

	public MontadorMarmitex(String nome, String cpf, int qtdFilhos) {
		super(nome, cpf, qtdFilhos);
		super.salario = 1500.0;
	}

	@Override
	public double salarioComBonificacaoQtdFilhos() {
		return salario + super.bonificacaoPorFilho();
	}

}
