package com.sistema.projeto.entities;

import java.util.Objects;

public class Fornecedor {

	private Integer id;
	private String nome;
	private String cnpj;
	
	private Contato contatoFor = new Contato();
	private Entrada entradas;
	
	public Fornecedor() {
		
	}

	public Fornecedor(Integer id, String nome, String cnpj) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Contato getContatoFor() {
		return contatoFor;
	}

	public void setContatoFor(Contato contatoFor) {
		this.contatoFor = contatoFor;
	}

	public Entrada getEntradas() {
		return entradas;
	}

	public void setEntradas(Entrada entradas) {
		this.entradas = entradas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(id, other.id);
	}
	
}
