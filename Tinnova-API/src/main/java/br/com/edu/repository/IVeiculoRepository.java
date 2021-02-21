package br.com.edu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.edu.domain.Veiculo;

public interface IVeiculoRepository extends MongoRepository<Veiculo, String> {}