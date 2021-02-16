package br.pro.tinnova.exercicios.dois.teste;

import javax.swing.JOptionPane;

import br.pro.tinnova.exercicios.dois.classes.BubleSort;

public class BubleSortTeste 
{	public static void main(String[] args) 
	{	int[] numeros = {5, 3, 2, 4, 7, 1, 0, 6};
	
		numeros = new BubleSort(numeros).getValores();
			
		for(int numero:numeros) {System.out.print(numero+" ");}
	}
}