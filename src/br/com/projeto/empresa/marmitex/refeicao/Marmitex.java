package br.com.projeto.empresa.marmitex.refeicao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.projeto.empresa.marmitex.insumo.Insumo;
import br.com.projeto.marmitex.Nutricionista;

public class Marmitex {
	
	private Nutricionista nutricionistaResponsavel;
	private List<Insumo> insumosMarmitex = new ArrayList<>();

	public Marmitex(Nutricionista nutricionistaResponsavel) {
		if (nutricionistaResponsavel == null) {
			throw new NullPointerException("Para montar um marmitex precisa ter um nutricionista");
		}
		this.nutricionistaResponsavel = nutricionistaResponsavel;
	}
	
	public void adicionaInsumoMarmitex(Insumo insumo) {
		this.insumosMarmitex.add(insumo);
	}

	public void removeInsumoMarmitex(Insumo insumo) {
		this.insumosMarmitex.remove(insumo);
	}
	
	public Nutricionista getNutricionistaResponsavel() {
		return nutricionistaResponsavel;
	}

	public List<Insumo> getInsumosMarmitex() {
		return Collections.unmodifiableList(insumosMarmitex);
	}

}
