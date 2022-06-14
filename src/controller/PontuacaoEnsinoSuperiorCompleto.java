package controller;

import model.Candidato;

public class PontuacaoEnsinoSuperiorCompleto implements IPontuacao {

	@Override
	public double calculaPontuacao(Candidato c) {
		double pontuacaoTotal = 0.00;
		if (c.isEnsinoSuperiorCompleto() == true) {
			pontuacaoTotal = pontuacaoTotal + 10;
		}
		return pontuacaoTotal;
	}

	@Override
	public void proximoPontuacao(Candidato c) {
		c.setPontosProva((int) calculaPontuacao(c));
		
		PontuacaoEntidadeClasse entidade = new PontuacaoEntidadeClasse();
		entidade.proximoPontuacao(c);
	}

}
