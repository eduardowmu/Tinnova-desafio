package br.com.edu.responses;

import java.util.ArrayList;
import java.util.List;

import br.com.edu.domain.Veiculo;

public class ValidadorMarca 
{	/*array de marcas de carros mais conhecidas*/
	private String[] marcasValidas = {"HONDA", "TOYOTA", "VOLKSWAGEN", 
							  "CHEVROLET", "BMW", "JACKMOTORS",
							  "HYUNDAI", "VOLVO", "MERCEDES"};
	
	public Response<Veiculo> validaMarca(String marca)
	{	for(String nome:marcasValidas)
		{	if(marca.equalsIgnoreCase(nome))
			{return null;}
		}
		List<String> erros = new ArrayList<>();
		erros.add("Marca invalida");
		return new Response<Veiculo>(erros);
	}
}
