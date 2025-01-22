package br.com.teste_pratico.regispro.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    @NotNull
    private String nome;
    private String descricao;
    @NotNull
    private BigDecimal valor;
    @NotNull
    @Enumerated(EnumType.STRING)
    private ProdutoDisponivel disponivel;

    public Produto(String nome, String descricao, BigDecimal valor, ProdutoDisponivel disponivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.disponivel = disponivel;
    }
    public Produto(String nome, BigDecimal valor, ProdutoDisponivel disponivel) {
        this.nome = nome;
        this.valor = valor;
        this.disponivel = disponivel;
    }

    public Produto() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public ProdutoDisponivel getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(ProdutoDisponivel disponivel) {
        this.disponivel = disponivel;
    }
}

