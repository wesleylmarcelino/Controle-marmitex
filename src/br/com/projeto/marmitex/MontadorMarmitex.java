package br.com.projeto.marmitex;

public class MontadorMarmitex extends Funcionario {

	public MontadorMarmitex(String nome, String cpf, String cargo, int qtdFilhos) {
		super(nome, cpf, cargo, qtdFilhos);
		super.salario = 1500.0;
	}

	@Override
	public double salarioComBonificacaoQtdFilhos() {
		return salario + super.bonificacaoPorFilho();
	}

}
