package br.com.projeto.empresa.marmitex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.projeto.empresa.marmitex.cliente.Cliente;
import br.com.projeto.empresa.marmitex.fornecedor.Fornecedor;
import br.com.projeto.marmitex.Funcionario;

public class EmpresaMarmitex {

	private String nome, cnpj, endereco;
	private List<Funcionario> funcionarios = new ArrayList<>();
	private List<Fornecedor> fornecedores = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();

	public EmpresaMarmitex(String nome, String cnpj, String endereco) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Empresa: " + nome + "\n";
	}
	
	public void adicionaFornecedor(Fornecedor fornecedor) {
		this.fornecedores.add(fornecedor);
	}
	
	public void removeFornecedor(Fornecedor fornecedor) {
		this.fornecedores.remove(fornecedor);
	}

	public void adicinaFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}

	public void removeFuncionario(Funcionario funcionario) {
		this.funcionarios.remove(funcionario);
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
	
	public List<Fornecedor> getFornecedores() {
		return Collections.unmodifiableList(fornecedores);
	}
	
	public List<Cliente> getClientes() {
		return Collections.unmodifiableList(clientes);
	}

}
