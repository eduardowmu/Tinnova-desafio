package br.pro.tinnova.exercicios.dois.classes;

public class BubleSort 
{	public static int[] setOrdemNumerica(int[] valores)
	{	for(int i = 0; i < valores.length; i++)
		{	for(int j = 0; j < valores.length-1; j++)
			{	int auxiliar = valores[j];
				if(valores[j] > valores[j+1])
				{	valores[j] = valores[j+1];
					valores[j+1] = auxiliar;
				}
			}
		}
		return valores;
	}
}