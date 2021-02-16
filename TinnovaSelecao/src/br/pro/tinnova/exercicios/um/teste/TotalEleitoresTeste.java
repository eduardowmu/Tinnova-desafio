package br.pro.tinnova.exercicios.um.teste;

import br.pro.tinnova.exercicios.um.classes.Resultado;
import br.pro.tinnova.exercicios.um.classes.Votos;

public class TotalEleitoresTeste 
{	public static void main(String[] args) 
	{	int totalEleitores = 1000;
		int validos = 800;
		int brancos = 150;
		int nulos = 50;
		
		new Resultado()
			.getTotalPercentualVotos(
			new Votos(1000, 800, 150, 50));
	}
}