package br.com.edu.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.edu.domain.Veiculo;
import br.com.edu.repository.IVeiculoRepository;
import br.com.edu.service.IService;
@Service
public class VeiculoService implements IService
{	@Autowired IVeiculoRepository vr;
	
	@Override public List<Veiculo> listAllVeiculos() 
	{return this.vr.findAll();}
	
	@Override public Veiculo searchVeiculoByID(String id) 
	{return this.vr.findOne(id);}

	@Override public Veiculo save(Veiculo veiculo) 
	{return this.vr.save(veiculo);}

	@Override public Veiculo update(Veiculo veiculo) 
	{return this.vr.save(veiculo);}

	@Override public void delete(String id)	
	{this.vr.delete(id);}
}