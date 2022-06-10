package com.sistema.projeto.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Produto {

    private Integer id;
    private String descricao;
    private Integer estoque;
    private BigDecimal valorVenda;
    private BigDecimal custoMedio;
    private Double taxaDeLucro;
    private boolean ativo;
    private Integer estoqueMinimo;
    private Integer estoqueMaximo;

    private LocalDate dataCadastro;

    private Categoria categoria = new Categoria();

    public Produto() {
        this.ativo = true;
        this.dataCadastro = LocalDate.now();
    }

    public Produto(String descricao, Integer estoque, BigDecimal valorVenda, BigDecimal custoMedio, Double taxaDeLucro, Integer estoqueMinimo, Integer estoqueMaximo, Categoria categoria) {
        this.descricao = descricao;
        this.estoque = estoque;
        this.valorVenda = valorVenda;
        this.custoMedio = custoMedio;
        this.taxaDeLucro = taxaDeLucro;
        this.ativo = true;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.categoria = categoria;
        this.dataCadastro = LocalDate.now();
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

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public BigDecimal getCustoMedio() {
        return custoMedio;
    }

    public void setCustoMedio(BigDecimal custoMedio) {
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

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
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
