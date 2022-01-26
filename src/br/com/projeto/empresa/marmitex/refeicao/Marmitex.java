package br.com.projeto.empresa.marmitex.refeicao;

import java.util.ArrayList;
import java.util.List;

import br.com.projeto.empresa.marmitex.insumo.Insumo;
import br.com.projeto.marmitex.Nutricionista;

public class Marmitex {

	private Nutricionista nutricionistaResponsavel;
	private List<Insumo> insumosMarmitex = new ArrayList<>();

	public Marmitex(Nutricionista nutricionista) {
		if (nutricionistaResponsavel == null) {
			throw new NullPointerException("Para montar um marmitex precisa ter um nutricionista");
		}
		this.nutricionistaResponsavel = nutricionista;
	}

	public void adicionaInsumoMarmitex(Insumo insumo) {
		this.insumosMarmitex.add(insumo);
	}

	public void removeInsumoMarmitex(Insumo insumo) {
		this.insumosMarmitex.remove(insumo);
	}

	public List<Insumo> getInsumosMarmitex() {
		return insumosMarmitex;
	}

}
