package com.sistema.projeto.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Entrada {
	
	private Integer id;
	private LocalDate dataEntrada;
	private String observacao;
	private BigDecimal valor;

	private Fornecedor fornecedor;
	
	private List<ItemEntrada> itens = new ArrayList<>();
	
	public Entrada() {
		valor = BigDecimal.ZERO;
		dataEntrada = LocalDate.now();
	}

	public Entrada(Integer id, LocalDate dataEntrada, String observacao, BigDecimal valor, Fornecedor fornecedor) {
		super();
		this.id = id;
		this.dataEntrada = dataEntrada;
		this.observacao = observacao;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public List<ItemEntrada> getItens() {
		return itens;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	//TODO: analisar regras de validação ao inserir
	public void adicionar(ItemEntrada item) {
		this.getItens().add(item);
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
		Entrada other = (Entrada) obj;
		return Objects.equals(id, other.id);
	}

}
