package controller;

import model.Candidato;

public class PontuacaoEnsinoMedioCompleto implements IPontuacao {

	@Override
	public double calculaPontuacao(Candidato c) {
		double pontuacaoTotal = 0.00;
		if (c.isEnsinoMedioPublico() == true) {
			pontuacaoTotal = pontuacaoTotal + 5;
		}
		return pontuacaoTotal;
	}

	@Override
	public void proximoPontuacao(Candidato c) {
		c.setPontosProva((int) calculaPontuacao(c));
		
		PontuacaoEnsinoSuperiorCompleto superior = new PontuacaoEnsinoSuperiorCompleto();
		superior.proximoPontuacao(c);
	}

}
