package com.sistema.projeto.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String observacao;
	private BigDecimal valorTotal;
	private LocalDate dataPedido;
	
	private Status status;
	private Pagamento pagamento;
	@ManyToOne
	private Cliente cliente;
	@OneToMany(mappedBy = "pedido")
	private List<ItemPedido> itens = new ArrayList<>();
	
	
	public Pedido() {
		this.status = Status.ORCAMENTO;
		this.valorTotal = BigDecimal.ZERO;
		this.dataPedido = LocalDate.now();
	}

	public Pedido(Integer id, String observacao, BigDecimal valorTotal, LocalDate dataPedido, Status status,
			Pagamento pagamento) {
		super();
		this.id = id;
		this.observacao = observacao;
		this.valorTotal = valorTotal;
		this.dataPedido = dataPedido;
		this.status = status;
		this.pagamento = pagamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	//TODO: validar regras de negócio
	public void adicionar(ItemPedido item) {
		itens.add(item);
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
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}

}
