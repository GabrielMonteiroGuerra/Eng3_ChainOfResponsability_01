package controller;

import model.Candidato;

public interface IPontuacao {
	
	public double calculaPontuacao(Candidato c);
	public void proximoPontuacao(Candidato c);
}
