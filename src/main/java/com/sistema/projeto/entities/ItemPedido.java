package com.sistema.projeto.entities;

import java.util.Objects;

public class ItemPedido {
	
	private Integer id;
	private Integer quantidade;
	private Double valorPacial;
	
	private Produto produto = new Produto();
	private Pedido pedido = new Pedido();
	
	public ItemPedido() {
		
	}
	
	public ItemPedido(Integer id, Integer quantidade, Double valorPacial, Produto produto) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.valorPacial = valorPacial;
		this.produto = produto;
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

	public Double getValorPacial() {
		return valorPacial;
	}

	public void setValorPacial(Double valorPacial) {
		this.valorPacial = valorPacial;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
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
		ItemPedido other = (ItemPedido) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
