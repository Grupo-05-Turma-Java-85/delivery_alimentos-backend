package com.generation.fithubdelivery.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@JsonPropertyOrder({ "id", "nome", "imagem", "senha", "cpf", "email", "telefone", "endereco", "cep", })

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo nome é Obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo nome deve conter no mínimo 03 e no máximo 100 caracteres")
	private String nome;

	@NotBlank(message = "O atributo email é Obrigatório!")
	@Email(message = "O atributo email deve ser um email válido")
	private String email;

	@NotBlank(message = "O atributo endereço é Obrigatório!")
	@Size(min = 5, max = 150, message = "O atributo endereço deve conter no mínimo 05 e nomáximo 150 caracteres")
	@Column(length = 150)
	private String endereco;

	@NotBlank(message = "O atributo CEP é Obrigatório!")
	@Size(min = 8, max = 10, message = "O atributo CEP deve conter no mínimo 08 e nomáximo 10 caracteres")
	@Column(length = 10)
	private String cep;

	@NotBlank(message = "O atributo telefone é Obrigatório!")
	@Size(min = 8, max = 15, message = "O atributo telefone deve conter no mínimo 08 e nomáximo 15 caracteres")
	@Column(length = 15)
	private String telefone;

	@NotBlank(message = "O atributo CPF é Obrigatório!")
	@Size(min = 11, max = 15, message = "O atributo CPF deve conter no mínimo 08 e nomáximo 15 caracteres")
	@Column(length = 15)
	private String cpf;

	@NotBlank(message = "O atributo Imagem não pode estar vazio!")
	@Size(max = 255, message = "O atributo CPF deve conter no mínimo 08 e nomáximo 15 caracteres")
	@Column(length = 255)
	private String imagem;

	@NotBlank(message = "O atributo Senha não pode estar vazio")
	@Size(min = 8, message = "A senha deve ter no minimo 8 caracteres")
	private String senha;

	@OneToMany(mappedBy = "usuario")
	@JsonIgnoreProperties("usuario")
	private List<Produto> produtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}