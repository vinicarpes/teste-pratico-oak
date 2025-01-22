package br.com.teste_pratico.regispro.dto;

import br.com.teste_pratico.regispro.Model.Produto;
import br.com.teste_pratico.regispro.Model.ProdutoDisponivel;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;


import java.math.BigDecimal;

public class RequisicaoFormProduto {
    @NotNull()
    @NotBlank()
    private String nome;

    private String descricao;

    @NotNull()
    private ProdutoDisponivel produtoDisponivel;

    @NotNull()
    private BigDecimal valor;



    public Produto toProduto() {
        Produto produto = new Produto();
        produto.setNome(this.nome);
        produto.setDisponivel(this.produtoDisponivel);
        produto.setValor(this.valor);
        produto.setDescricao(this.descricao);

        return produto;
    }
    public Produto toProduto(Produto produto) {
        produto.setNome(this.nome);
        produto.setDisponivel(this.produtoDisponivel);
        produto.setValor(this.valor);

        return produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProdutoDisponivel getProdutoDisponivel() {
        return produtoDisponivel;
    }

    public void setProdutoDisponivel(ProdutoDisponivel produtoDisponivel) {
        this.produtoDisponivel = produtoDisponivel;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
