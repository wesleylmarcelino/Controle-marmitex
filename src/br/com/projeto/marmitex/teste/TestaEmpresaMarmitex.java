package br.com.projeto.marmitex.teste;

import br.com.projeto.empresa.marmitex.EmpresaMarmitex;
import br.com.projeto.empresa.marmitex.fornecedor.Fornecedor;
import br.com.projeto.empresa.marmitex.insumo.Insumo;
import br.com.projeto.marmitex.Gerente;
import br.com.projeto.marmitex.MontadorMarmitex;
import br.com.projeto.marmitex.Nutricionista;

public class TestaEmpresaMarmitex {

	public static void main(String[] args) {

		EmpresaMarmitex emp = new EmpresaMarmitex("Alimentarte", "XX.XXX.XXX/0001-XX", "xpto");

		Gerente g1 = new Gerente("Wesley", "1234567891-9", "Gerente", 5);
		Nutricionista n1 = new Nutricionista("Eduarda", "1234567891-2", "Nutricionista", 2);
		MontadorMarmitex m1 = new MontadorMarmitex("Emanuel", "9874562311-8", "MontadorMarmitex", 1);
		Fornecedor f1 = new Fornecedor("Rei dos gr�os");
		Insumo i1 = new Insumo("Feij�o", 100);
		Insumo i2 = new Insumo("Arroz", 200);
		Fornecedor f2 = new Fornecedor("A�ogue boi vivo");
		Insumo i3 = new Insumo("Alcatra", 50);
		Insumo i4 = new Insumo("Maminha", 50);

		emp.adicinaFuncionario(g1);
		emp.adicinaFuncionario(n1);
		emp.adicinaFuncionario(m1);
		emp.adicionaFornecedor(f1);
		emp.adicionaFornecedor(f2);
		f1.adicionaInsumo(i1);
		f1.adicionaInsumo(i2);
		f2.adicionaInsumo(i3);
		f2.adicionaInsumo(i4);

		// System.out.println(emp.getFuncionarios().get(0).getNome());

		System.out.println(emp);
		System.out.println("Fornecedores:");
		
		

		for (int i = 0; i < emp.getFornecedores().size(); i++) {
			System.out.println(emp.getFornecedores().get(i).getNome());
			for (int j = 0; j < emp.getFornecedores().get(i).getInsumos().size(); j++) {
				System.out.println(emp.getFornecedores().get(i).getInsumos().get(j));
			}

			System.out.println("---------------------------------------");
		}

		System.out.println("Lista de Colaboradores: ");
		emp.getFuncionarios().forEach(f -> System.out
				.println("Colaborador: " + "\n" + f + "\n" + "-----------------------------------------------"));

		
	}
	
}
