package br.pro.tinnova.exercicios.dois;

public class BubleSort 
{	private int[] valores;

	public BubleSort(int[] valores) 
	{this.valores = this.setOrdemNumerica(valores);}
	
	public int[] setOrdemNumerica(int[] valores)
	{	boolean troca = true;
		do
		{	for(int i = 0; i < valores.length; i++)
			{	int auxiliar = valores[i];
				if(i < valores.length-1)
				{	if(valores[i] > valores[i+1])
					{	valores[i] = valores[i+1];
						valores[i+1] = auxiliar;
						troca = true;
					}
					else {troca = false;} 
				}
			}
			for(int valor:valores)
			{	if(valores[0] > valor)
				{	troca = true;
					break;
				}
			}
		} while(troca);
		return valores;
	}

	public int[] getValores() {return valores;}
	public void setValores(int[] valores) 
	{this.valores = valores;}
}