package com.sistema.projeto.entities;

import java.util.Date;
import java.util.Objects;

public class Entrada {
	
	private Integer id;
	private Date dataEntrada;
	private String observacao;
	private Double valor;
	
	private ItemEntrada ItensEntrada;
	
	public Entrada() {
		
	}

	public Entrada(Integer id, Date dataEntrada, String observacao, Double valor) {
		super();
		this.id = id;
		this.dataEntrada = dataEntrada;
		this.observacao = observacao;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public ItemEntrada getItensEntrada() {
		return ItensEntrada;
	}

	public void setItensEntrada(ItemEntrada itensEntrada) {
		ItensEntrada = itensEntrada;
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
