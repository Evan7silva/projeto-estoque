package com.sistema.projeto.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;
@Entity
public class ItemPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer quantidade;
	private BigDecimal valorUnitario;

	@ManyToOne
	private Produto produto;

	@ManyToOne
	private Pedido pedido;
	
	public ItemPedido() {

	}
	
	public ItemPedido(Integer quantidade, BigDecimal valorUnitario, Produto produto, Pedido pedido) {
		super();
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.produto = produto;
		this.pedido = pedido;
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

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
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
