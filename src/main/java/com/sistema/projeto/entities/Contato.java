package com.sistema.projeto.entities;

public class Contato {
	
	private String telefone;
	private String email;
	
	private Cliente cliente = new Cliente();
	private Fornecedor fornecedor = new Fornecedor();
	
	public Contato() {
		
	}

	public Contato(String telefone, String email) {
		super();
		this.telefone = telefone;
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	

}
