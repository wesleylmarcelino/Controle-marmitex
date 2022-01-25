package br.com.projeto.marmitex.teste;

import br.com.projeto.empresa.marmitex.EmpresaMarmitex;
import br.com.projeto.marmitex.Gerente;
import br.com.projeto.marmitex.MontadorMarmitex;
import br.com.projeto.marmitex.Nutricionista;

public class TestaEmpresaMarmitex {

	public static void main(String[] args) {

		EmpresaMarmitex emp = new EmpresaMarmitex("Alimentarte", "XX.XXX.XXX/0001-XX", 
				"xpto");

		Gerente g1 = new Gerente("Wesley", "1234567891-9", "Gerente", 5);
		Nutricionista n1 = new Nutricionista("Eduarda", "1234567891-2", "Nutricionista", 2);
		MontadorMarmitex m1 = new MontadorMarmitex("Emanuel", "9874562311-8", "MontadorMarmitex", 1);
		
		emp.adicinaFuncionario(g1);
		emp.adicinaFuncionario(n1);
		emp.adicinaFuncionario(m1);
		
		
		
		//System.out.println(emp.getFuncionarios().get(0).getNome());
		
		System.out.println(emp);
	}
}
