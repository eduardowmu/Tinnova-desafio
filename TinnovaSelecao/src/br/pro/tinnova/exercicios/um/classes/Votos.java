package br.pro.tinnova.exercicios.um.classes;

public class Votos 
{	//atributos de classe
	private int totalEleitores;
	private int votosValidos;
	private int votosBrancos;
	private int votosNulos;
	
	//construtores
	public Votos() {}
	
	public Votos(int totalEleitores, 
		int votosValidos, int votosBrancos, int votosNulos) 
	{	this.totalEleitores = totalEleitores;
		this.votosValidos = votosValidos;
		this.votosBrancos = votosBrancos;
		this.votosNulos = votosNulos;
	}

	//GETTERS e SETTERS
	public int getTotalEleitores() {return totalEleitores;}
	public void setTotalEleitores(int totalEleitores) 
	{this.totalEleitores = totalEleitores;}

	public int getVotosValidos() {return votosValidos;}
	public void setVotosValidos(int votosValidos) 
	{this.votosValidos = votosValidos;}

	public int getVotosBrancos() {return votosBrancos;}
	public void setVotosBrancos(int votosBrancos) 
	{this.votosBrancos = votosBrancos;}

	public int getVotosNulos() {return votosNulos;}
	public void setVotosNulos(int votosNulos) 
	{this.votosNulos = votosNulos;}
}