package com.sistema.projeto.entities;

import java.util.Objects;

public class ItemEntrada {
	
	private Integer id;
	private Integer quantidade;
	private Double valorParcial;
	
	private Entrada entrada = new Entrada();
	private Produto produto = new Produto();
	
	public ItemEntrada() {
		
	}

	public ItemEntrada(Integer id, Integer quantidade, Double valorParcial) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.valorParcial = valorParcial;
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

	public Double getValorParcial() {
		return valorParcial;
	}

	public void setValorParcial(Double valorParcial) {
		this.valorParcial = valorParcial;
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
