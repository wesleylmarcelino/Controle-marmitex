package br.com.projeto.empresa.marmitex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.projeto.marmitex.Funcionario;

public class EmpresaMarmitex {

	private String nome, cnpj, endereco;
	private List<Funcionario> funcionarios = new ArrayList<>();

	public EmpresaMarmitex(String nome, String cnpj, String endereco) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	public void adicinaFuncionario(Funcionario f) {
		this.funcionarios.add(f);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public List<Funcionario> getFuncionarios() {
		return Collections.unmodifiableList(funcionarios);
	}

}
