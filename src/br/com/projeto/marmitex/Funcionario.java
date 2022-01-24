package br.com.projeto.marmitex;

public abstract class Funcionario {

	private String nome, cpf;
	private double salario;
	private int qtdFilhos;
	private static int qtdFuncionarios; 

	public Funcionario(String nome, String cpf, double salario, int qtdFilhos) {
		if (nome == null) {
			throw new NullPointerException("O nome não pode ser null");
		}
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.qtdFilhos = qtdFilhos;
		Funcionario.qtdFuncionarios++;
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

	public void setSalario(double salario) {
		this.salario = salario;
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

}
