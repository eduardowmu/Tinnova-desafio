package br.com.edu.service;

import java.util.List;
import java.util.Optional;

import br.com.edu.domain.Veiculo;

public interface IService 
{	void delete(String id);
	
	List<Veiculo> listAllVeiculos();
	Veiculo searchVeiculoByID(String id);
	Veiculo save(Veiculo veiculo);
	Veiculo update(Veiculo veiculo);
}
