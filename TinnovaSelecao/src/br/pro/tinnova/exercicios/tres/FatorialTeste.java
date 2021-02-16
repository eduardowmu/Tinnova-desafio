package br.pro.tinnova.exercicios.tres;

import java.text.ParseException;

import javax.swing.JOptionPane;

public class FatorialTeste 
{	public static void main(String[] args) 
	{	int numero = getValorInteiro();
		JOptionPane.showMessageDialog(null, 
				"O fatorial de " +numero+
				" vale "+calcularFatorial(numero));
	}

	private static int calcularFatorial(int numero)
	{	if(numero == 0) return 1;
		
		else {return numero*calcularFatorial(numero-1);}
	}
	
	private static int getValorInteiro()
	{	try
		{	int numero = Integer.parseInt(
				JOptionPane.showInputDialog(
				"Insira um valor inteiro positivo"));
			if(numero >= 0) {return numero;}
			else {return getValorInteiro();}
		}
		catch(Exception pe) {return getValorInteiro();}
	}
}