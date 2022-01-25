package br.com.projeto.marmitex;

public abstract class Funcionario {

	private String nome, cpf, cargo;
	protected double salario;
	private int qtdFilhos;
	private static int qtdFuncionarios;

	public Funcionario(String nome, String cpf, String cargo, int qtdFilhos) {
		if (nome == null) {
			throw new NullPointerException("O nome não pode ser null");
		}
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.qtdFilhos = qtdFilhos;
		Funcionario.qtdFuncionarios++;
	}

	@Override
	public String toString() {
		String str = "Nome: " + nome + " Cargo: " + cargo + "\n";
		return str.replaceAll(",","" ).replace("[", "").replace("]", "");
	}

	public abstract double salarioComBonificacaoQtdFilhos();

	public double bonificacaoPorFilho() {
		if (qtdFilhos == 0) {
			return 0;
		} else if (qtdFilhos == 1) {
			return 50;
		} else if (qtdFilhos == 2) {
			return 100;
		} else {
			return 150;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public int getQtdFilhos() {
		return qtdFilhos;
	}

	public void setQtdFilhos(int qtdFilhos) {
		this.qtdFilhos = qtdFilhos;
	}

	public static int getQtdFuncionarios() {
		return Funcionario.qtdFuncionarios;
	}

	public String getCargo() {
		return cargo;
	}

}
