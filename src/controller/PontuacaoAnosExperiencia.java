package controller;

import model.Candidato;

public class PontuacaoAnosExperiencia implements IPontuacao {

	@Override
	public double calculaPontuacao(Candidato c) {
		double pontuacaoTotal = 0.00;
		if(c.getAnosExperiencia() > 2) {
			pontuacaoTotal = pontuacaoTotal + 2;
		}
		return c.getAnosExperiencia() + pontuacaoTotal;
	}

	@Override
	public void proximoPontuacao(Candidato c) {
		c.setPontosProva((int) calculaPontuacao(c));
		
		
	}

}
