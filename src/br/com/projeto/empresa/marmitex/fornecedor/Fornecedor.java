package br.com.projeto.empresa.marmitex.fornecedor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.projeto.empresa.marmitex.insumo.Insumo;

public class Fornecedor {

	private String nome;
	private List<Insumo> insumos = new ArrayList<>();
	
	public Fornecedor(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome Fornecedor: " + nome;
	}
	
	public void adicionaInsumo(Insumo insumo) {
		this.insumos.add(insumo);
	}
	
	public void removeInsumo(Insumo insumo) {
		this.insumos.add(insumo);
	}

	public String getNome() {
		return nome;
	}

	public List<Insumo> getInsumos() {
		return Collections.unmodifiableList(insumos);
	}
	
}
