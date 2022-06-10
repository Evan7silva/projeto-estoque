package com.sistema.projeto.entities;

import java.util.Objects;

public class Produto {

    private Integer id;
    private String descricao;
    private Integer estoque;
    private Double valorVenda;
    private Double custoMedio;
    private Double taxaDeLucro;
    private boolean ativo;
    private Integer estoqueMinimo;
    private Integer estoqueMaximo;

    private Categoria categoria = new Categoria();

    public Produto() {
        this.ativo = true;
    }

    public Produto(String descricao, Integer estoque, Double valorVenda, Double custoMedio, Double taxaDeLucro, Integer estoqueMinimo, Integer estoqueMaximo, Categoria categoria) {
        this.descricao = descricao;
        this.estoque = estoque;
        this.valorVenda = valorVenda;
        this.custoMedio = custoMedio;
        this.taxaDeLucro = taxaDeLucro;
        this.ativo = true;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(Integer estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public Integer getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(Integer estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
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

    public void calcularValorVenda() {

    }
}
