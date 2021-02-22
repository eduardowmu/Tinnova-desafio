package br.com.edu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edu.domain.Veiculo;
import br.com.edu.responses.Response;
import br.com.edu.responses.ValidadorMarca;
import br.com.edu.serviceImp.VeiculoService;

@RestController
@RequestMapping(path="/api/veiculos")
public class VeiculoController 
{	@Autowired private VeiculoService vs;
	
	@GetMapping 
	public ResponseEntity<Response<List<Veiculo>>> listAllVeiculo()
	{	return ResponseEntity.ok(new Response<List<Veiculo>>(
			this.vs.listAllVeiculos()));
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<Response<Integer>> delete(@PathVariable(name="id") String id)
	{	this.vs.delete(id);
		//retorna um inteiro apenas para indicar que está tudo ok
		return ResponseEntity.ok(new Response<Integer>(1));
	}
	
	@PutMapping(path="/{id}") 
	public ResponseEntity<Response<Veiculo>> update(@Valid @PathVariable(name="id") 
		String id, @RequestBody Veiculo veiculo, BindingResult result)
	{	if(result.hasErrors())//se houver erros
		{	List<String> errors = new ArrayList<>();
			//insere numa lista de erros as mensagens de erros que podem aparecer
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			//um erro comum de tipo 400. Como deve ser retornado um tipo Client, devemos
			//criar uma classe que permita retornar uma mensagem de resposta papdrão
			return ResponseEntity.badRequest().body(new Response<Veiculo>(errors));
		}
		veiculo.setId(id);
		return ResponseEntity.ok(new Response<Veiculo>(this.vs.update(veiculo)));
	}
	
	@PostMapping 
	public ResponseEntity<Response<Veiculo>> save(@Valid @RequestBody Veiculo veiculo, BindingResult result)
	{	if(result.hasErrors())//se houver erros
		{	List<String> errors = new ArrayList<String>();
			//insere numa lista de erros as mensagens de erros que podem aparecer
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			//um erro comum de tipo 400. Como deve ser retornado um tipo Client, devemos
			//criar uma classe que permita retornar uma mensagem de resposta papdrão
			return ResponseEntity.badRequest().body(new Response<Veiculo>(errors));
		}
		ValidadorMarca vm = new ValidadorMarca();
		if(vm.validaMarca(veiculo.getMarca()) != null)
		{return ResponseEntity.badRequest().body(vm.validaMarca(veiculo.getMarca()));}
		return ResponseEntity.ok(new Response<Veiculo>(this.vs.save(veiculo)));
	}
}
