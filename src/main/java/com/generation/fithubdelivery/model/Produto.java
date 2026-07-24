package com.generation.fithubdelivery.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id // PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private Long id;
	
	@NotBlank(message = "O atributo Produto é obrigatório!")
	@Size(min = 2, max = 100, message = "O atributo Produto deve ter no mínimo 2 e no máximo 100 caracteres")
	@Column(length = 100)
	private String produto;
	
	@NotBlank(message = "O atributo Imagem é obrigatório!")
	@Size(min = 10, max = 1000, message = "O atributo imagem deve ter no mínimo 10 e no máximo 1000 caracteres")
	@Column(length = 1000)
	private String imagem;
	
	@NotNull(message = "O atributo Quantidade é obrigatório!")
	@PositiveOrZero(message = "O atributo Quantidade devem ser zero ou um valor positivo!")
	@Column(nullable = false)
	private Long quantidade;
	
	@NotNull(message = "O atributo Valor é obrigatório!")
	@Positive(message = "O atributo Valor devem ser positivo!")
	@Digits(integer = 3, fraction = 2)
	@Column(precision = 5, scale = 2, nullable = false)
	private BigDecimal valor;
	
	@NotNull(message = "O atributo Calorias é obrigatório!")
	@PositiveOrZero(message = "O atributo Calorias devem ser zero ou um valor positivo!")
	@Column(nullable = false)
	private Integer calorias;

	@NotBlank(message = "O atributo Descrição é obrigatório!")
	@Size(min = 10, max = 1000, message = "O atributo Descrição deve ter no mínimo 10 e no máximo 1000 caracteres")
	@Column(length = 1000)
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getCalorias() {
		return calorias;
	}

	public void setCalorias(Integer calorias) {
		this.calorias = calorias;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
