package com.sistema.projeto.entities;

import java.util.Objects;

public class ItemEntrada {
	
	private Integer id;
	private Integer quantidade;
	private Double valorUnitario;

	private Entrada entrada;
	private Produto produto;
	
	public ItemEntrada() {
		
	}

	public ItemEntrada(Integer id, Integer quantidade, Double valorParcial) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.valorUnitario = valorParcial;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Entrada getEntrada() {
		return entrada;
	}

	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
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
		ItemEntrada other = (ItemEntrada) obj;
		return Objects.equals(id, other.id);
	}

}
