package br.pro.tinnova.exercicios.um.classes;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Resultado 
{	public void getTotalPercentualVotos(Votos votos)
	{	NumberFormat nf = new DecimalFormat("0.00");
		System.out.println("Percentual de votos validos: " + 
			nf.format(this.getPercentualVotosValidos(votos)) + "%");
		
		System.out.println("Percentual de votos brancos: " +
			nf.format(this.getPercentualVotosBrancos(votos)) + "%");
		
		System.out.println("Percentual de votos nulos: " +
			nf.format(this.getPercentualVotosNulos(votos)) + "%");
	}
	
	private double getPercentualVotosValidos(Votos votos)
	{	return votos.getTotalEleitores() > 0 ?
			((double)votos.getVotosValidos() / 
			(double)votos.getTotalEleitores())*100 : 0;
	}
	
	private double getPercentualVotosBrancos(Votos votos)
	{	return votos.getTotalEleitores() > 0 ? 
			((double)votos.getVotosBrancos() / 
			(double)votos.getTotalEleitores())*100 : 0;
	}
	
	private double getPercentualVotosNulos(Votos votos)
	{	return votos.getTotalEleitores() > 0 ?
			((double)votos.getVotosNulos() / 
			(double)votos.getTotalEleitores())*100 : 0;
	}
}
