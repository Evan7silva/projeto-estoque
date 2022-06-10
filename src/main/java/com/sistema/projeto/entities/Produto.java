package com.sistema.projeto.entities;

import java.util.Objects;

public class Produto {
	
	private Integer id;
	private String nome;
	private Integer estoque;
	private Double valorVenda;
	private Double custoMedio;
	private Double taxaDeLucro;
	
	private Categoria categoria = new Categoria();
	private ItemPedido itens;
	private ItemEntrada itensEntrada;
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Produto() {
		
	}

	public Produto(Integer id, String nome, Integer estoque, Double valorVenda, Double custoMedio, Double taxaDeLucro) {
		super();
		this.id = id;
		this.nome = nome;
		this.estoque = estoque;
		this.valorVenda = valorVenda;
		this.custoMedio = custoMedio;
		this.taxaDeLucro = taxaDeLucro;
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

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Double getCustoMedio() {
		return custoMedio;
	}

	public void setCustoMedio(Double custoMedio) {
		this.custoMedio = custoMedio;
	}

	public Double getTaxaDeLucro() {
		return taxaDeLucro;
	}

	public void setTaxaDeLucro(Double taxaDeLucro) {
		this.taxaDeLucro = taxaDeLucro;
	}

	public ItemPedido getItens() {
		return itens;
	}

	public void setItens(ItemPedido itens) {
		this.itens = itens;
	}

	public ItemEntrada getEntradas() {
		return itensEntrada;
	}

	public void setEntradas(ItemEntrada entradas) {
		this.itensEntrada = entradas;
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
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

	public static void calculoValorVenda() {
		
	}
}
