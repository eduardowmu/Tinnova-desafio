package br.com.edu.domain;

import java.util.Date;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Veiculo 
{	@Id private String id;
	private String nome;
	private String marca;
	private int ano;
	private String descricao;
	private boolean vendido;
	private Date created;
	private Date updated;
	
	public Veiculo() {}
	
	public Veiculo(String id, String nome, 
			String marca, int ano, 
			String descricao, boolean vendido, 
			Date created, Date updated) 
	{	this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.ano = ano;
		this.descricao = descricao;
		this.vendido = vendido;
		this.created = created;
		this.updated = updated;
	}

	public String getId() {return id;}
	public void setId(String id) {this.id = id;}

	@NotEmpty(message="Nome não pode ser vazio")
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

	@NotEmpty(message="Marca não pode ser vazio")
	public String getMarca() {return marca;}
	public void setMarca(String marca) {this.marca = marca;}

	@NotEmpty(message="Ano não pode ser vazio")
	public int getAno() {return ano;}
	public void setAno(int ano) {this.ano = ano;}

	public String getDescricao() {return descricao;}
	public void setDescricao(String descricao) 
	{this.descricao = descricao;}

	public boolean isVendido() {return vendido;}
	public void setVendido(boolean vendido) 
	{this.vendido = vendido;}

	public Date getCreated() {return created;}
	public void setCreated(Date created) {this.created = created;}

	public Date getUpdated() {return updated;}
	public void setUpdated(Date updated) {this.updated = updated;}
}