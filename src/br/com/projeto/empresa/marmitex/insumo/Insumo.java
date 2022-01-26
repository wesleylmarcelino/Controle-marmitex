package br.com.projeto.empresa.marmitex.insumo;

public class Insumo {

	private String nome;
	private double quantidade;

	public Insumo(String nome, double quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}
	
	public double getQuantidade() {
		return quantidade;
	}

}
