package br.pro.tinnova.exercicios.quatro;

import javax.swing.JOptionPane;

public class SomaMultiplos35 
{	public static void main(String[] args) 
	{	int numero = getValor();
		int soma = 0;
		//limite dado de numero-1 pois queremos
		//que seja abaixo do numero desejado.
		for(int i = 0; i < numero-1; i++)
		{	if((i+1)%3 == 0 || (i+1)%5 == 0)
			{soma += (i+1);}
		}
		JOptionPane.showMessageDialog(null, 
			"Soma dos multiplos de 3 ou 5 vale: " 
			+ soma);
	}

	private static int getValor()
	{	try
		{	return Integer.parseInt(
				JOptionPane.showInputDialog(
				"Escolha um numero inteiro"));
		}
		catch(Exception e) {return getValor();}
	}
}