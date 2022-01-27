package br.com.projeto.marmitex.teste;

import br.com.projeto.empresa.marmitex.EmpresaMarmitex;
import br.com.projeto.empresa.marmitex.fornecedor.Fornecedor;
import br.com.projeto.empresa.marmitex.insumo.Insumo;
import br.com.projeto.empresa.marmitex.refeicao.Marmitex;
import br.com.projeto.marmitex.Gerente;
import br.com.projeto.marmitex.MontadorMarmitex;
import br.com.projeto.marmitex.Nutricionista;

public class TesteMarmitex {

	public static void main(String[] args) {

		EmpresaMarmitex emp = new EmpresaMarmitex("Alimentarte", "XX.XXX.XXX/0001-XX", "xpto");

		Gerente g1 = new Gerente("Wesley", "1234567891-9", "Gerente", 5);
		Nutricionista n1 = new Nutricionista("Eduarda", "1234567891-2", "Nutricionista", 2);
		MontadorMarmitex m1 = new MontadorMarmitex("Emanuel", "9874562311-8", "MontadorMarmitex", 1);
		Fornecedor f1 = new Fornecedor("Rei dos grãos");
		Insumo i1 = new Insumo("Feijão", 100);
		Insumo i2 = new Insumo("Arroz", 200);
		Fornecedor f2 = new Fornecedor("Açogue boi vivo");
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

		Marmitex marmitex = new Marmitex(n1);

		System.out.println("Insumos disponíveis para montar o marmitex: ");
		for (int i = 0; i < emp.getFornecedores().size() ; i++) {
			for (int j = 0; j < emp.getFornecedores().get(i).getInsumos().size(); j++) {
				System.out.println(emp.getFornecedores().get(i).getInsumos().get(j));	
			}
			
		}
		
		
		
		System.out.println("Nutricionista Responsável:");
		System.out.println(marmitex.getNutricionistaResponsavel().getNome());

	}
}
