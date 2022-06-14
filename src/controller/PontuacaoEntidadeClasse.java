package controller;

import model.Candidato;

public class PontuacaoEntidadeClasse implements IPontuacao {

	@Override
	public double calculaPontuacao(Candidato c) {
		double pontuacaoTotal = 0.00;
		if(c.getAnosRegistroEntidadeClasse() > 1) {
			pontuacaoTotal = pontuacaoTotal + 1;
		}
		return c.getAnosRegistroEntidadeClasse() + pontuacaoTotal;
	}

	@Override
	public void proximoPontuacao(Candidato c) {
		
	}

}
